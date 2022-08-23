package com.Plan.Service;

import java.util.List;
import java.util.Map;

import com.Plan.Entity.Plan;

public interface PlanService {
	
	public Map<Integer,String> getPlanCategories(); 
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public boolean updatePlan(Plan plan);
	
	public Plan getPlanById(Integer planId);
	
	public boolean  hardDelete(Integer planId);
	
	public boolean statusChange(Integer planId , String action);
	
	

}
