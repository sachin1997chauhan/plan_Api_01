package com.Plan.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Plan.Entity.Plan;


@Repository
public interface PlanRepo extends JpaRepository<Plan , Integer >{

}
