/**
 * 
 */
package com.boot.dao;

import java.util.List;

import com.boot.model.StaffWorkingSchedule;


/**
 * @author Dhyanandra
 *
 */
public interface StaffWorkingScheduleDao {

	//public List<StaffWorkingSchedule> saveWorkingSchedule(long staffId );
	
	public String deleteWorkingSchedule(long workScheduleId);
	
	public StaffWorkingSchedule updateWorkingSchedule(long workScheduleId, 
			                                          StaffWorkingSchedule workSchedule);
	
	public List<StaffWorkingSchedule> getStaffWorkingSchedule(long staffId);
	
	public List<StaffWorkingSchedule> getStaffWorkingScheduleOfDay(long staffId, String day);
	
}
