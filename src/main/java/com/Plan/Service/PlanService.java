package com.Plan.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Plan.Entity.Plan;
import com.Plan.Entity.PlanCategory;


public interface PlanService {
	
	public Map<Integer,String> getPlanCategories(); 
	
	public boolean saveCategory(PlanCategory planCategory);
	
	public boolean editCategory(PlanCategory planCategory);
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public boolean updatePlan(Plan plan);
	
	public Plan getPlanById(Integer planId);
	
	public boolean  hardDelete(Integer planId);
	
	public boolean statusChange(Integer planId , String action);
	
	

}
