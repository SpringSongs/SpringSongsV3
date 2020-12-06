package org.authority.domain;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.object_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String objectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.audit_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private Boolean auditFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.sort_code
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private Integer sortCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.deleted_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private Boolean deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.created_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.created_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.created_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private Date createdOn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.created_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String createdIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.updated_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.updated_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.updated_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private Date updatedOn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.updated_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    private String updatedIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.object_id
     *
     * @return the value of comment.object_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.object_id
     *
     * @param objectId the value for comment.object_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.audit_flag
     *
     * @return the value of comment.audit_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public Boolean getAuditFlag() {
        return auditFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.audit_flag
     *
     * @param auditFlag the value for comment.audit_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setAuditFlag(Boolean auditFlag) {
        this.auditFlag = auditFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.sort_code
     *
     * @return the value of comment.sort_code
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public Integer getSortCode() {
        return sortCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.sort_code
     *
     * @param sortCode the value for comment.sort_code
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.deleted_flag
     *
     * @return the value of comment.deleted_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.deleted_flag
     *
     * @param deletedFlag the value for comment.deleted_flag
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.created_user_id
     *
     * @return the value of comment.created_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.created_user_id
     *
     * @param createdUserId the value for comment.created_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.created_by
     *
     * @return the value of comment.created_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.created_by
     *
     * @param createdBy the value for comment.created_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.created_on
     *
     * @return the value of comment.created_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.created_on
     *
     * @param createdOn the value for comment.created_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.created_ip
     *
     * @return the value of comment.created_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getCreatedIp() {
        return createdIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.created_ip
     *
     * @param createdIp the value for comment.created_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.updated_user_id
     *
     * @return the value of comment.updated_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.updated_user_id
     *
     * @param updatedUserId the value for comment.updated_user_id
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.updated_by
     *
     * @return the value of comment.updated_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.updated_by
     *
     * @param updatedBy the value for comment.updated_by
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.updated_on
     *
     * @return the value of comment.updated_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.updated_on
     *
     * @param updatedOn the value for comment.updated_on
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.updated_ip
     *
     * @return the value of comment.updated_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public String getUpdatedIp() {
        return updatedIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.updated_ip
     *
     * @param updatedIp the value for comment.updated_ip
     *
     * @mbg.generated Thu Nov 07 15:40:12 CST 2019
     */
    public void setUpdatedIp(String updatedIp) {
        this.updatedIp = updatedIp == null ? null : updatedIp.trim();
    }
}