package com.boot.dao;

import java.util.List;

import com.boot.model.StaffDetails;


/**
 * @author Dhyanandra
 *
 */
public interface StaffDao {
	
	public List<StaffDetails> fetchAllStaff();

	public StaffDetails fetchStaffById(long staffId);

	public StaffDetails saveStaffDetails(StaffDetails staffDetails);

	public StaffDetails updateStaff(long staffId);

	public StaffDetails deleteStaff(long staffId);
	
}
