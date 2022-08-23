package com.Plan.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Plan.Entity.Plan;
import com.Plan.Entity.PlanCategory;
import com.Plan.Repo.PlanCategoryRepo;
import com.Plan.Repo.PlanRepo;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanCategoryRepo plancategoryrepo;
	
	@Autowired
	private PlanRepo planrepo;

	@Override
	public Map<Integer, String> getPlanCategories() {
		// TODO Auto-generated method stub
		List<PlanCategory> categories = plancategoryrepo.findAll();
		Map<Integer, String> categoriesMap = new HashMap();
		
		categories.forEach(category -> {
			categoriesMap.put(category.getCategoryId() , category.getCategoryName());
		});
		return categoriesMap;
	}

	@Override
	public boolean savePlan(Plan plan) {
		// TODO Auto-generated method stub
		Plan saved = planrepo.save(plan);
		
		return saved.getPlanId()!=null ? true:false;
	}

	@Override
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		List<Plan> plans = planrepo.findAll();
		 
		
		return plans;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		// TODO Auto-generated method stub
		Plan updated = planrepo.save(plan);
		return updated.getPlanId()!=null;
	}

	@Override
	public Plan getPlanById(Integer planId) {
		// TODO Auto-generated method stub
		Optional<Plan> findById = planrepo.findById(planId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean hardDelete(Integer planId) {
		// TODO Auto-generated method stub
		boolean status = false;
		try {
			planrepo.deleteById(planId);
			status = true ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return status;
	}

	@Override
	public boolean statusChange(Integer planId, String action) {
		// TODO Auto-generated method stub
		Plan plan = new Plan();
		try {
			plan.setPlanId(planId);
			plan.setActiveSw(action);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
