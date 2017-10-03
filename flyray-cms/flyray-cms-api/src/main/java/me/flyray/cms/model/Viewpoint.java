package me.flyray.cms.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Viewpoint implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键，自增
	 */
	private Long id;
	/**
	 * 索引，用户编号
	 */
	private Long customerId;
	/**
	 * 发表观点，文字内容
	 */
	private String pointText;
	/**
	 * 发表观点，图片路径，json格式
	 */
	private String pointImg;
	/**
	 * 发表时间
	 */
	private Date pointTime;
	/**
	 * 发表地点
	 */
	private String pointAddress;
	
	/**
	 *发表状态距现在时间
	 * 
	 */
	private String diffTime;
	
	public String getDiffTime() {
		return diffTime;
	}
	public void setDiffTime(String diffTime) {
		this.diffTime = diffTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPointImg() {
		return pointImg;
	}
	public void setPointImg(String pointImg) {
		this.pointImg = pointImg;
	}
	public Date getPointTime() {
		return pointTime;
	}
	public void setPointTime(Date pointTime) {
		this.pointTime = pointTime;
	}
	public String getPointAddress() {
		return pointAddress;
	}
	public void setPointAddress(String pointAddress) {
		this.pointAddress = pointAddress;
	}
	public String getPointText() {
		return pointText;
	}
	public void setPointText(String pointText) {
		this.pointText = pointText;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "CmsViewPoint [id=" + id + ", customerId=" + customerId + ", pointText=" + pointText + ", pointImg="
				+ pointImg + ", pointTime=" + pointTime + ", pointAddress=" + pointAddress + ", diffTime=" + diffTime
				+ "]";
	}
	
}
