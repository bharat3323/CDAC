package com.myscms.core;

public enum ServicePlan {

		SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
		private int planCost;

		private ServicePlan(int planCost) {
			this.planCost = planCost;
		}

		public int getPlanCost() {
			return planCost;
		}

		public void setPlanCost(int planCost) {
			this.planCost = planCost;
		}
		
		@Override
		public String toString() {
			return name()+"costs"+this.planCost;
		}
}
