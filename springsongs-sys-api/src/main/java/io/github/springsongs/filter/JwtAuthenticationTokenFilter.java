package io.github.springsongs.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.github.springsongs.enumeration.ResultCode;
import io.github.springsongs.exception.SpringSongsException;
import io.github.springsongs.utils.JwtUtil;

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

	@Value("${jwt.header}")
	private String tokenHeader;

	@Value("${jwt.tokeanHead}")
	private String tokenHead;

	private JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		jwtUtil = new JwtUtil();
		final String requestHeader = request.getHeader(this.tokenHeader);
		String token = "";
		String userName = "";
		if (null != requestHeader && requestHeader.startsWith(this.tokenHead)) {
			token = requestHeader.substring(this.tokenHead.length());
			if (StringUtils.isEmpty(token)) {
				throw new SpringSongsException(ResultCode.LOGIN_FAIL);
			}
			try {
				userName = jwtUtil.getUserNameFromToken(token);
			} catch (Exception e) {
				throw new SpringSongsException(ResultCode.LOGIN_FAIL);
			}
			if (!StringUtils.isEmpty(userName)) {
				if (!jwtUtil.validateToken(token, userName)) {
					throw new SpringSongsException(ResultCode.LOGIN_FAIL);
				}
			}
		} else {
			throw new SpringSongsException(ResultCode.LOGIN_FAIL);
		}
		filterChain.doFilter(request, response);
	}

}
