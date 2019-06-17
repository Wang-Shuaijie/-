package com.wsj.myo2o.enums;

public enum ShopCategoryStateEnum {
	SUCCESS(0, "创建成功"), 
	INNER_ERROR(-1001, "操作失败"), 
	EMPTY(-1002, "店铺信息为空");
	
	private int state;
	private String stateInfo;
	
	private ShopCategoryStateEnum(int state, String stateInfo) {
		this.state=state;
		this.stateInfo=stateInfo;
	}
	
	public static ShopCategoryStateEnum stateOf(int index) {
		for (ShopCategoryStateEnum state:values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
	
	public int getState() {
		return state;
	}
	
	public String getStateInfo() {
		return stateInfo;
	}
}
