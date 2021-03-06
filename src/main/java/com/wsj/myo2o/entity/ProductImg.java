package com.wsj.myo2o.entity;

import java.util.Date;

/**
 * 商品图片实体类
 * @author WangShuaiJie
 *
 */
public class ProductImg {
	//id
	private Long productImgId;
	//图片地址
	private String imgAddr;
	//图片说明
	private String imgDesc;
	//显示权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//属于哪一个商品（多对一）
	private Long productId;
	
	public Long getProductImgId() {
		return productImgId;
	}
	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
}
