package org.authority.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.authority.domain.Comment;

import com.github.pagehelper.Page;

public interface BaseCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    Comment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    int updateByPrimaryKey(Comment record);
    
    Page<Comment> ListByPage(Comment record);
    
    void setDeleted(@Param("ids") List<String> ids);
}