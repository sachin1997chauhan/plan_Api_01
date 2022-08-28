package com.Plan.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Plan.Entity.Plan;
import com.Plan.Entity.PlanCategory;
import com.Plan.Service.PlanService;
import com.Plan.constants.AppConstants;
import com.Plan.props.AppProperties;


@RestController
public class PlanRestController {
	
	private Map<String , String> messages;
	
	private PlanService planService;
	
	public PlanRestController(PlanService planService , AppProperties appProps) {
		
		this.planService = planService;
		this.messages = appProps.getMessages();
	}
	
	
	
	@GetMapping("/categories")
	public ResponseEntity<Map<Integer,String>> getAllCategories(){
		
		 
		Map<Integer, String> planCategories = planService.getPlanCategories();
		
		return new ResponseEntity<>(planCategories, HttpStatus.OK);
		
		
	}
	
	@PostMapping("/plan")
	public ResponseEntity<String> savePlan(@RequestBody Plan plan){
		
		boolean isSavedPlan = planService.savePlan(plan);
		String msg = AppConstants.EMPTY_VALUE;
		if (isSavedPlan) {
			
		msg = messages.get("planSaveSuccess");
		
		}else {
			msg = messages.get("planSaveFail");
		}
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/plans")
	public ResponseEntity<List<Plan>> showPlans(){
		
		List<Plan> allPlans = planService.getAllPlans();
		return new ResponseEntity<>(allPlans, HttpStatus.OK);
		
	} 
	
	
	@GetMapping("plan/{planId}")
	public ResponseEntity<Plan> getPlanById(@PathVariable Integer planId){
		
		Plan plan = planService.getPlanById(planId);
	
		return new ResponseEntity<>(plan , HttpStatus.OK);
		
	}
	
	@PutMapping("/plan")
	public ResponseEntity<String> updatePlan(@RequestBody Plan  plan){
		boolean isUpdated = planService.updatePlan(plan);
		String msg = "";
		if (isUpdated) {
			msg = "updated";
		} else {
           msg = "not updated";
		}
		return  new ResponseEntity<>(msg , HttpStatus.OK);
		
	}
	
	
	
	@DeleteMapping("plan/{planid}")
	public ResponseEntity<String> deletePlan(@PathVariable Integer planid){
		String msg = "";
		boolean isHardDelete = planService.hardDelete(planid);
		if (isHardDelete) {
			msg = "plan deleted successfully";
		} else {
  
			msg = "plan  not deleted";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
		
		
	}
	
	@PutMapping("plan/{planid}/{status}")
	public ResponseEntity<String> statusChange(@PathVariable Integer planid , @PathVariable String status){
		String msg = "";
		boolean isdeleted = planService.statusChange(planid, status);
		if (isdeleted) {
			msg = "deleted";
		} else {

			msg = "not deleted";
		}
		return new ResponseEntity<>(msg , HttpStatus.OK);
	}
	
	@PostMapping("/category")
	public ResponseEntity<String> CategorySaved(@RequestBody PlanCategory category){
		String msg = "";
		boolean isCategorySaved = planService.saveCategory(category);
		
		if (isCategorySaved) {
			msg = "Saved";
		} else {

			msg = "not Saved";
		}
		return  new ResponseEntity<>(msg , HttpStatus.OK);
		
	}

}
