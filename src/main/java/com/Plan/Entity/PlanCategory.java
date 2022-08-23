package com.Plan.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "Plan_Category")
public class PlanCategory {

	@Id
	@GeneratedValue
	@Column(name="Category_Id")
	private Integer CategoryId;
	
	@Column(name="CategoryName")
	private  String CategoryName;
	
	@Column(name="Active_Sw")
	private boolean ActiveSw;
	
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

	public Integer getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public boolean isActiveSw() {
		return ActiveSw;
	}

	public void setActiveSw(boolean activeSw) {
		ActiveSw = activeSw;
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
	
	

