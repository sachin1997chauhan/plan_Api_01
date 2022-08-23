package com.Plan.Entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;


@Entity
@Data
@Table(name = "Plan")
public class Plan {
	
	
	@Id
	@GeneratedValue
	@Column(name="Plan_Id")
	private Integer PlanId;
	
	@Column(name="Plan_Name")
	private String PlanName;
	
	@Column(name="Plan_StartDate")
	private LocalDate PlanStartDate;
	
	@Column(name="Plan_EndDate")
	private LocalDate PlanEndDate;

	@Column(name="Category_Id")
	private Integer CategoryId;
	
	
	@Column(name="Active_Sw")
	private String ActiveSw;
	
	@Column(name="Create_Date", updatable = false)
	@CreationTimestamp
	private LocalDate CreateDate;
	
	@Column(name="Update_Date", insertable = false)
	@UpdateTimestamp
	private LocalDate UpdateDate;
	
	@Column(name="Created_By")
	private String CreatedBy;
	
	@Column(name="Updated_By")
	private String UpdatedBy;

	public Integer getPlanId() {
		return PlanId;
	}

	public void setPlanId(Integer planId) {
		PlanId = planId;
	}

	public String getPlanName() {
		return PlanName;
	}

	public void setPlanName(String planName) {
		PlanName = planName;
	}

	public LocalDate getPlanStartDate() {
		return PlanStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		PlanStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return PlanEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		PlanEndDate = planEndDate;
	}

	public Integer getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}

	public String isActiveSw() {
		return ActiveSw;
	}

	public void setActiveSw(String action) {
		ActiveSw = action;
	}

	public LocalDate getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(LocalDate createDate) {
		CreateDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		UpdateDate = updateDate;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}
	
	
	
	
	

}
