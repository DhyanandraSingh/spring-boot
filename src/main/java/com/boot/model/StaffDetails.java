package com.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="staffMemberId")
@Table(name = "staff_details")
public class StaffDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "staff_member_id")
	private long staffMemberId;
	
	@NotNull
	@NotEmpty
	@Column(name= "first_name", nullable= false)
	private String firstName;
	
	@NotNull
	@NotEmpty
	@Column(name= "last_name", nullable= false)
	private String lastName;
	
	@Email
	@NotNull
	@NotEmpty
	@Column(name= "email", nullable= false)
	private String email;
	
	@NotNull
	@NotEmpty
	@Column(name= "buisness_contact_no", nullable= false)
	private String buisnessContactNo;
	
	@NotEmpty
	@Column(name= "personal_contact_no")
	private String personalContactNo;
	
	@NotNull
	@NotEmpty
	@Column(name= "gender", nullable= false)
	private String gender;
	
	@OneToMany(mappedBy = "staffId",  cascade = CascadeType.ALL)
	@JsonManagedReference(value="staffWorkingSchedule-staffDetails")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<StaffWorkingSchedule> workingSchedule = new ArrayList<>();
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getStaffMemberId() {
		return staffMemberId;
	}

	public void setStaffMemberId(long staffMemberId) {
		this.staffMemberId = staffMemberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBuisnessContactNo() {
		return buisnessContactNo;
	}

	public void setBuisnessContactNo(String buisnessContactNo) {
		this.buisnessContactNo = buisnessContactNo;
	}

	public String getPersonalContactNo() {
		return personalContactNo;
	}

	public void setPersonalContactNo(String personalContactNo) {
		this.personalContactNo = personalContactNo;
	}

	
	public List<StaffWorkingSchedule> getWorkingSchedule() {
		return workingSchedule;
	}

	public void setWorkingSchedule(List<StaffWorkingSchedule> workingSchedule) {
		this.workingSchedule = workingSchedule;
	}
	
	
	
}
