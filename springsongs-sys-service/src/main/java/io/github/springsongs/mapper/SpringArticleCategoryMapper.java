package io.github.springsongs.mapper;

import io.github.springsongs.domain.SpringArticleCategory;
import io.github.springsongs.dto.SpringArticleCategoryDTO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SpringArticleCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_article_category
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_article_category
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int insert(SpringArticleCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_article_category
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    SpringArticleCategory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_article_category
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    List<SpringArticleCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_article_category
     *
     * @mbg.generated Mon Dec 14 16:39:39 CST 2020
     */
    int updateByPrimaryKey(SpringArticleCategory record);

	List<SpringArticleCategory> listByPage(@Param("record") SpringArticleCategoryDTO record);

	List<SpringArticleCategory> getByParentId(@Param("parentId") String id);

	void setDelete(@Param("ids") List<String> ids);

	List<SpringArticleCategory> getInParentId(@Param("ids") List<String> ids);
}