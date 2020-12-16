package io.github.springsongs.mapper;

import io.github.springsongs.domain.SpringJob;
import java.util.List;

public interface SpringJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int insert(SpringJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    SpringJob selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    List<SpringJob> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_job
     *
     * @mbg.generated Mon Dec 14 16:28:43 CST 2020
     */
    int updateByPrimaryKey(SpringJob record);
}