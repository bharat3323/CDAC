package com.cms.core;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private int planCost;

	// add ctor to init plan cost
	 private ServicePlan(int planCost) {
		this.planCost = planCost;
	}
	//getter n setter 

	public int getPlanCost() {
		return planCost;
	}

	public void setPlanCost(int planCost) {
		this.planCost = planCost;
	}
	@Override
	public String toString() {
		return name()+" costs "+this.planCost;
	}	
	
}
