package io.github.springsongs.mapper;

import io.github.springsongs.domain.SpringLoginLog;
import io.github.springsongs.dto.SpringLoginLogDTO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

@Mapper
public interface SpringLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_login_log
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_login_log
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int insert(SpringLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_login_log
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    SpringLoginLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_login_log
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    List<SpringLoginLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_login_log
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int updateByPrimaryKey(SpringLoginLog record);

	Page<SpringLoginLog> listByPage(SpringLoginLogDTO springLoginLogQuery);

	void delete(@Param("ids") List<String> ids);
}