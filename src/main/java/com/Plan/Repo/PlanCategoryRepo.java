package com.Plan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plan.Entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory,Integer> {

	Integer getCategoryId();

}
