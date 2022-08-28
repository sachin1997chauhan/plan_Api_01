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


	
	
	
	

}
