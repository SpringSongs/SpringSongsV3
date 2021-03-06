package io.github.springsongs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SpringDictionaryDetailDTO{
	 private String id;
     public String getId(){
         return  this.id;
     }
     public void setId(String id){
         this.id=id;
     }

     @NotBlank(message="请填写字典主表编码")
     @Size(max=45, min=1)
     private String dictionaryCode;
     public String getDictionaryCode(){
         return  this.dictionaryCode;
     }
     public void setDictionaryCode(String dictionaryCode){
         this.dictionaryCode=dictionaryCode;
     }

     @Size(max=36, min=0)
     private String parentId;
     public String getParentId(){
         return  this.parentId;
     }
     public void setParentId(String parentId){
         this.parentId=parentId;
     }

     @NotBlank(message="请填写编码")
     @Size(max=45, min=1)
     private String detailCode;
     public String getDetailCode(){
         return  this.detailCode;
     }
     public void setDetailCode(String detailCode){
         this.detailCode=detailCode;
     }

     @NotBlank(message="请填写名称")
     @Size(max=45, min=1)
     private String detailName;
     public String getDetailName(){
         return  this.detailName;
     }
     public void setDetailName(String detailName){
         this.detailName=detailName;
     }

     @NotBlank(message="请填写值")
     @Size(max=45, min=1)
     private String detailValue;
     public String getDetailValue(){
         return  this.detailValue;
     }
     public void setDetailValue(String detailValue){
         this.detailValue=detailValue;
     }

     @NotBlank(message="请填写说明")
     @Size(max=200, min=1)
     private String description;
     public String getDescription(){
         return  this.description;
     }
     public void setDescription(String description){
         this.description=description;
     }

     private String childIds;
     public String getChildIds(){
         return  this.childIds;
     }
     public void setChildIds(String childIds){
         this.childIds=childIds;
     }

     private int sortCode;
     public int getSortCode(){
         return  this.sortCode;
     }
     public void setSortCode(int sortCode){
         this.sortCode=sortCode;
     }

     private boolean enableEdit;
     public boolean getEnableEdit(){
         return  this.enableEdit;
     }
     public void setEnableEdit(boolean enableEdit){
         this.enableEdit=enableEdit;
     }

     private boolean enableDelete;
     public boolean getEnableDelete(){
         return  this.enableDelete;
     }
     public void setEnableDelete(boolean enableDelete){
         this.enableDelete=enableDelete;
     }

     private boolean deletedStatus;
     public boolean getDeletedStatus(){
         return  this.deletedStatus;
     }
     public void setDeletedStatus(boolean deletedStatus){
         this.deletedStatus=deletedStatus;
     }

     @Size(max=36, min=0)
     private String createdUserId;
     public String getCreatedUserId(){
         return  this.createdUserId;
     }
     public void setCreatedUserId(String createdUserId){
         this.createdUserId=createdUserId;
     }

     @Size(max=36, min=0)
     private String createdBy;
     public String getCreatedBy(){
         return  this.createdBy;
     }
     public void setCreatedBy(String createdBy){
         this.createdBy=createdBy;
     }

     private java.util.Date createdOn;
     public java.util.Date getCreatedOn(){
         return  this.createdOn;
     }
     public void setCreatedOn(java.util.Date createdOn){
         this.createdOn=createdOn;
     }

     @Size(max=45, min=0)
     private String createdIp;
     public String getCreatedIp(){
         return  this.createdIp;
     }
     public void setCreatedIp(String createdIp){
         this.createdIp=createdIp;
     }

     @Size(max=36, min=0)
     private String updatedUserId;
     public String getUpdatedUserId(){
         return  this.updatedUserId;
     }
     public void setUpdatedUserId(String updatedUserId){
         this.updatedUserId=updatedUserId;
     }

     @Size(max=45, min=0)
     private String updatedBy;
     public String getUpdatedBy(){
         return  this.updatedBy;
     }
     public void setUpdatedBy(String updatedBy){
         this.updatedBy=updatedBy;
     }

     private java.util.Date updatedOn;
     public java.util.Date getUpdatedOn(){
         return  this.updatedOn;
     }
     public void setUpdatedOn(java.util.Date updatedOn){
         this.updatedOn=updatedOn;
     }

     @Size(max=45, min=0)
     private String updatedIp;
     public String getUpdatedIp(){
         return  this.updatedIp;
     }
     public void setUpdatedIp(String updatedIp){
         this.updatedIp=updatedIp;
     }
}
