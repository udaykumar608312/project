package com.project.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
	@Column(name="first_name")
		private String First_Name;
	@Column(name="last_name")
		private String Last_Name;
	@Column(name="employee_id")
		private long Emp_id;
	@Column(name="designation")
		private String designation;
	@Column(name="Department")
		private String dept;
	@Column(name="status")
		private String Status;
	@Column(name="reporting_manager")
		private String Rep_Mgr;
	@Column(name="gender")
	
		private String gender;
	@Column(name="blood_group")
		private char Blood_grp;
	@Column(name="address")
		private String Address;
		
		
		
		public Users(String first_Name, String last_Name, String designation, String dept, String status,
				String rep_Mgr, String gender, char blood_grp, String address) {
			super();
			First_Name = first_Name;
			Last_Name = last_Name;
			this.designation = designation;
			this.dept = dept;
			Status = status;
			Rep_Mgr = rep_Mgr;
			this.gender = gender;
			Blood_grp = blood_grp;
			Address = address;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirst_Name() {
			return First_Name;
		}
		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}
		public String getLast_Name() {
			return Last_Name;
		}
		public void setLast_Name(String last_Name) {
			Last_Name = last_Name;
		}
		public long getEmp_id() {
			return Emp_id;
		}
		public void setEmp_id(long emp_id) {
			Emp_id = emp_id;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public String getRep_Mgr() {
			return Rep_Mgr;
		}
		public void setRep_Mgr(String rep_Mgr) {
			Rep_Mgr = rep_Mgr;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public char getBlood_grp() {
			return Blood_grp;
		}
		public void setBlood_grp(char blood_grp) {
			Blood_grp = blood_grp;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}


}
