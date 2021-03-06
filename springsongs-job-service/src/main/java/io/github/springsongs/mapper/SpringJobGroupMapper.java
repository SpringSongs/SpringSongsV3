package io.github.springsongs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import io.github.springsongs.domain.SpringJobGroup;
import io.github.springsongs.dto.SpringJobGroupDTO;

@Mapper
public interface SpringJobGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job_group
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job_group
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int insert(SpringJobGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job_group
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    SpringJobGroup selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job_group
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    List<SpringJobGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job_group
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int updateByPrimaryKey(SpringJobGroup record);

	SpringJobGroup getByCode(@Param("code") String code);

	List<SpringJobGroup> listByPage(@Param("springJobGroupQuery") SpringJobGroupDTO springJobGroupQuery);

	void setDelete(@Param("ids") List<String> ids);

	List<SpringJobGroup> listAll();
}