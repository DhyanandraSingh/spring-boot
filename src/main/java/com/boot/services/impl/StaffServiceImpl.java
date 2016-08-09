/**
 * 
 */
package com.boot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.dao.StaffDao;
import com.boot.dao.StaffWorkingScheduleDao;
import com.boot.model.StaffDetails;
import com.boot.model.StaffWorkingSchedule;
import com.boot.services.StaffService;



/**
 * @author Dhyanandra
 *
 */

@Service
@Transactional
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	StaffDao staffDao;
	
	@Autowired
	StaffWorkingScheduleDao staffWorkingSchedule;
	
	@Override
	public List<StaffDetails> fetchAllStaff() {
		return staffDao.fetchAllStaff();
	}

	@Override
	public StaffDetails fetchStaffById(long staffId) {
		return staffDao.fetchStaffById(staffId);
	}

	@Override
	public StaffDetails saveStaffDetails(StaffDetails staffDetails) {
		return staffDao.saveStaffDetails(staffDetails);
	}

	@Override
	public StaffDetails updateStaff(long staffId) {
		return null;
	}

	@Override
	public StaffDetails deleteStaff(long staffId) {
		return null;
	}

	/** Address **/
	@Override
	public List<StaffDetails> fetchAddressDetails(long staffId) {
		return null;
	}

	@Override
	public List<StaffDetails> updateAddress(long addressId) {
		return null;
	}

	@Override
	public List<StaffDetails> deleteAddress(long staffId) {
		return null;
	}

	/** working schedule **/
	@Override
	public List<StaffWorkingSchedule> fetchworkingSchedule(long staffId) {
		return staffWorkingSchedule.getStaffWorkingSchedule(staffId);
	}

	@Override
	public List<StaffWorkingSchedule> updateworkingSchedule(long workScheduleId) {
		return null;
	}

	@Override
	public List<StaffWorkingSchedule> deleteworkingSchedule(long workScheduleId) {
		return null;
	}

}
