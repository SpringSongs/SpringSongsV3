package io.github.springsongs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import io.github.springsongs.domain.SpringActVacationApprove;
import io.github.springsongs.dto.SpringActVacationApproveDTO;

@Mapper
public interface SpringActVacationApproveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_act_vacation_approve
     *
     * @mbg.generated Mon Dec 14 16:20:59 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_act_vacation_approve
     *
     * @mbg.generated Mon Dec 14 16:20:59 CST 2020
     */
    int insert(SpringActVacationApprove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_act_vacation_approve
     *
     * @mbg.generated Mon Dec 14 16:20:59 CST 2020
     */
    SpringActVacationApprove selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_act_vacation_approve
     *
     * @mbg.generated Mon Dec 14 16:20:59 CST 2020
     */
    List<SpringActVacationApprove> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spring_act_vacation_approve
     *
     * @mbg.generated Mon Dec 14 16:20:59 CST 2020
     */
    int updateByPrimaryKey(SpringActVacationApprove record);

	List<SpringActVacationApprove> listByPage(@Param("record") SpringActVacationApproveDTO record);

	List<SpringActVacationApprove> findByVacationId(@Param("vacationId") String vacationId);
}