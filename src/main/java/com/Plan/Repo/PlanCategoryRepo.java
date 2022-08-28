package com.Plan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Plan.Entity.PlanCategory;


@Repository
public interface PlanCategoryRepo extends JpaRepository<PlanCategory,Integer> {



}
