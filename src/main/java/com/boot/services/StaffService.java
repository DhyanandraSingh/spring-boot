package com.boot.services;

import java.util.List;

import com.boot.model.StaffDetails;
import com.boot.model.StaffWorkingSchedule;


/**
 * @author Dhyanandra
 *
 */
public interface StaffService {

	public List<StaffDetails> fetchAllStaff();

	public StaffDetails fetchStaffById(long staffId);

	public StaffDetails saveStaffDetails(StaffDetails staffDetails);

	public StaffDetails updateStaff(long staffId);

	public StaffDetails deleteStaff(long staffId);

	/** Address **/

	public List<StaffDetails> fetchAddressDetails(long staffId);

	public List<StaffDetails> updateAddress(long addressId);

	public List<StaffDetails> deleteAddress(long staffId);

	/** Staff Working Schedule **/

	public List<StaffWorkingSchedule> fetchworkingSchedule(long staffId);

	public List<StaffWorkingSchedule> updateworkingSchedule(long workScheduleId);

	public List<StaffWorkingSchedule> deleteworkingSchedule(long workScheduleId);

}
