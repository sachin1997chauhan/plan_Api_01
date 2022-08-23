package com.Plan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Plan.Entity.Plan;

public interface PlanRepo extends JpaRepository<Plan , Integer >{

}
