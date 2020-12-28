package io.github.springsongs.mapper;

import io.github.springsongs.domain.SpringSiteInfo;
import io.github.springsongs.dto.SpringSiteInfoDTO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

@Mapper
public interface SpringSiteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_site_info
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_site_info
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int insert(SpringSiteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_site_info
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    SpringSiteInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_site_info
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    List<SpringSiteInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_site_info
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int updateByPrimaryKey(SpringSiteInfo record);

	Page<SpringSiteInfo> listByPage(SpringSiteInfoDTO record);

	void setDelete(@Param("ids") List<String> ids);
}