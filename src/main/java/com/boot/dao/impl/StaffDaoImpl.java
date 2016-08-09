package com.boot.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.boot.dao.AbstractDao;
import com.boot.dao.StaffDao;
import com.boot.model.StaffDetails;


/**
 * @author Dhyanandra
 *
 */
@Repository("staffDao")
public class StaffDaoImpl 
		extends AbstractDao<Long, StaffDetails> 
		implements StaffDao  {

	@SuppressWarnings("unchecked")
	@Override
	public List<StaffDetails> fetchAllStaff() {
		return createEntityCriteria().addOrder(Order.asc("staffMemberId")).list();
	}

	@Override
	public StaffDetails fetchStaffById(long staffId) {
		return getByKey(staffId);
	}

	@Override
	public StaffDetails saveStaffDetails(StaffDetails staffDetails) {
		return save(staffDetails);
	}

	@Override
	public StaffDetails updateStaff(long staffId) {
		return null;
	}

	@Override
	public StaffDetails deleteStaff(long staffId) {
		return null;
	}

}
