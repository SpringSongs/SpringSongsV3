package io.github.springsongs.mapper;

import io.github.springsongs.domain.SpringResourceRole;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpringResourceRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_resource_role
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int deleteByPrimaryKey(@Param("id") String id, @Param("moduleId") String moduleId, @Param("roleId") String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_resource_role
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int insert(SpringResourceRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_resource_role
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    SpringResourceRole selectByPrimaryKey(@Param("id") String id, @Param("moduleId") String moduleId, @Param("roleId") String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_resource_role
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    List<SpringResourceRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_resource_role
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int updateByPrimaryKey(SpringResourceRole record);

	void delete(@Param("roleId")String roleId,@Param("moduleId") String moduleId);

	void saveAll(List<SpringResourceRole> baseModuleRoleEntityList);

	List<SpringResourceRole> listModulesByRoleId(@Param("roleId")String roleId);

	SpringResourceRole findByRoleIdAndModuleId(@Param("roleId")String roleId,@Param("moduleId") String moduleId);

	void deleteByRoleIdAndModuleId(@Param("roleId")String roleId,@Param("moduleId") String moduleId);
}