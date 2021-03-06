package io.github.springsongs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import io.github.springsongs.domain.SpringAritlce;
import io.github.springsongs.dto.SpringAritlceDTO;
@Mapper
public interface SpringAritlceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_aritlce
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_aritlce
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int insert(SpringAritlce record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_aritlce
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    SpringAritlce selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_aritlce
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    List<SpringAritlce> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_aritlce
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int updateByPrimaryKey(SpringAritlce record);

	void setDelete(@Param("ids") List<String> ids);

	List<SpringAritlce> listByPage(SpringAritlceDTO springAritlceQuery);
}