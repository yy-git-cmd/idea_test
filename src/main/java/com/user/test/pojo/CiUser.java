package com.user.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class CiUser implements Serializable {
    /** base-主键*/
    private String objectId;

    /** */
    private String hiddlePassword;

    /** base-删除标志*/
    private Boolean delFlag;

    /** base-上级id*/
    private String pid;

    /** base-排序*/
    private Integer sort;

    /** base-创建人*/
    private String createUserId;

    /** base-创建时间*/
    private Date createTime;

    /** base-修改人*/
    private String modificationUserId;

    /** base-修改时间*/
    private Date modificationTime;

    /** 用户名*/
    private String userName;

    /** 密码*/
    private String password;

    /** 昵称*/
    private String nickName;

    /** 真实名字*/
    private String ciName;

    /** */
    private String trueName;

    /** 台席号*/
    private String tableNo;

    /** 坐席员工号*/
    private String employeeNo;

    /** 负责人姓名*/
    private String leaderName;

    /** 身份证*/
    private String card;

    /** 头像*/
    private String headImgUrl;

    /** 电话*/
    private String mobileNumber;

    /** 邮箱*/
    private String emailAddress;

    /** 省*/
    private Integer province;

    /** 市*/
    private Integer city;

    /** 区*/
    private Integer district;

    /** 地址*/
    private String address;

    /** 性别*/
    private String enumSex;

    /** 生日*/
    private String birthday;

    /** 部门*/
    private String structId;

    /** 职位*/
    private String positionId;

    /** 备注*/
    private String remark;

    /** 类型*/
    private String enumType;

    /** 商家分类*/
    private String enumUserType;

    /** 是否公开信息*/
    private Boolean isPublic;

    /** 是否交押金*/
    private Boolean isPaid;

    /** 是否可用*/
    private Boolean isEnable;

    /** 审核状态*/
    private String enumApprovalStatus;

    /** 审核备注*/
    private String approvalContent;

    /** 极光RID*/
    private String rid;

    /** 收藏量*/
    private Integer collectionCount;

    /** 聊天*/
    private String imId;

    /** 翻译内容*/
    private Object foreignTransJsonb;

    /** */
    private Boolean isWorking;

    /** */
    private Boolean chooseLeader;

    /** */
    private Boolean workTell;

    /** */
    private Boolean isClerk;

    /** */
    private String isMarried;

    /** */
    private String nativeplace;

    /** */
    private String location;

    /** */
    private String political;

    /** */
    private String educationbackground;

    /** */
    private String professional;

    /** */
    private String school;

    /** */
    private String phoneNumber;

    /** */
    private String qq;

    /** */
    private String otherNum;

    /** */
    private String detailedAddress;

    /** */
    private String assessory;

    /** */
    private String standbyOne;

    /** */
    private String standbyTwo;

    private static final long serialVersionUID = 1L;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getHiddlePassword() {
        return hiddlePassword;
    }

    public void setHiddlePassword(String hiddlePassword) {
        this.hiddlePassword = hiddlePassword == null ? null : hiddlePassword.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModificationUserId() {
        return modificationUserId;
    }

    public void setModificationUserId(String modificationUserId) {
        this.modificationUserId = modificationUserId == null ? null : modificationUserId.trim();
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName == null ? null : ciName.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo == null ? null : tableNo.trim();
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEnumSex() {
        return enumSex;
    }

    public void setEnumSex(String enumSex) {
        this.enumSex = enumSex == null ? null : enumSex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getStructId() {
        return structId;
    }

    public void setStructId(String structId) {
        this.structId = structId == null ? null : structId.trim();
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType == null ? null : enumType.trim();
    }

    public String getEnumUserType() {
        return enumUserType;
    }

    public void setEnumUserType(String enumUserType) {
        this.enumUserType = enumUserType == null ? null : enumUserType.trim();
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public String getEnumApprovalStatus() {
        return enumApprovalStatus;
    }

    public void setEnumApprovalStatus(String enumApprovalStatus) {
        this.enumApprovalStatus = enumApprovalStatus == null ? null : enumApprovalStatus.trim();
    }

    public String getApprovalContent() {
        return approvalContent;
    }

    public void setApprovalContent(String approvalContent) {
        this.approvalContent = approvalContent == null ? null : approvalContent.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public Integer getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
    }

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId == null ? null : imId.trim();
    }

    public Object getForeignTransJsonb() {
        return foreignTransJsonb;
    }

    public void setForeignTransJsonb(Object foreignTransJsonb) {
        this.foreignTransJsonb = foreignTransJsonb;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }

    public Boolean getChooseLeader() {
        return chooseLeader;
    }

    public void setChooseLeader(Boolean chooseLeader) {
        this.chooseLeader = chooseLeader;
    }

    public Boolean getWorkTell() {
        return workTell;
    }

    public void setWorkTell(Boolean workTell) {
        this.workTell = workTell;
    }

    public Boolean getIsClerk() {
        return isClerk;
    }

    public void setIsClerk(Boolean isClerk) {
        this.isClerk = isClerk;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried == null ? null : isMarried.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground == null ? null : educationbackground.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getOtherNum() {
        return otherNum;
    }

    public void setOtherNum(String otherNum) {
        this.otherNum = otherNum == null ? null : otherNum.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public String getAssessory() {
        return assessory;
    }

    public void setAssessory(String assessory) {
        this.assessory = assessory == null ? null : assessory.trim();
    }

    public String getStandbyOne() {
        return standbyOne;
    }

    public void setStandbyOne(String standbyOne) {
        this.standbyOne = standbyOne == null ? null : standbyOne.trim();
    }

    public String getStandbyTwo() {
        return standbyTwo;
    }

    public void setStandbyTwo(String standbyTwo) {
        this.standbyTwo = standbyTwo == null ? null : standbyTwo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectId=").append(objectId);
        sb.append(", hiddlePassword=").append(hiddlePassword);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", pid=").append(pid);
        sb.append(", sort=").append(sort);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modificationUserId=").append(modificationUserId);
        sb.append(", modificationTime=").append(modificationTime);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", ciName=").append(ciName);
        sb.append(", trueName=").append(trueName);
        sb.append(", tableNo=").append(tableNo);
        sb.append(", employeeNo=").append(employeeNo);
        sb.append(", leaderName=").append(leaderName);
        sb.append(", card=").append(card);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", mobileNumber=").append(mobileNumber);
        sb.append(", emailAddress=").append(emailAddress);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", enumSex=").append(enumSex);
        sb.append(", birthday=").append(birthday);
        sb.append(", structId=").append(structId);
        sb.append(", positionId=").append(positionId);
        sb.append(", remark=").append(remark);
        sb.append(", enumType=").append(enumType);
        sb.append(", enumUserType=").append(enumUserType);
        sb.append(", isPublic=").append(isPublic);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", enumApprovalStatus=").append(enumApprovalStatus);
        sb.append(", approvalContent=").append(approvalContent);
        sb.append(", rid=").append(rid);
        sb.append(", collectionCount=").append(collectionCount);
        sb.append(", imId=").append(imId);
        sb.append(", foreignTransJsonb=").append(foreignTransJsonb);
        sb.append(", isWorking=").append(isWorking);
        sb.append(", chooseLeader=").append(chooseLeader);
        sb.append(", workTell=").append(workTell);
        sb.append(", isClerk=").append(isClerk);
        sb.append(", isMarried=").append(isMarried);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", location=").append(location);
        sb.append(", political=").append(political);
        sb.append(", educationbackground=").append(educationbackground);
        sb.append(", professional=").append(professional);
        sb.append(", school=").append(school);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", qq=").append(qq);
        sb.append(", otherNum=").append(otherNum);
        sb.append(", detailedAddress=").append(detailedAddress);
        sb.append(", assessory=").append(assessory);
        sb.append(", standbyOne=").append(standbyOne);
        sb.append(", standbyTwo=").append(standbyTwo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
