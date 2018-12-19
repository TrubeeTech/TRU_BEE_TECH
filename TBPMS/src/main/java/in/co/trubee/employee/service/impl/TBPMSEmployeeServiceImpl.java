/**
 * @author : abhishek.ku
 * @date : Dec 17, 2018
 * @filname : TBPMSEmployeeServiceImpl.java
 * @pacagename :in.co.trubee.employee.service.impl
 */
package in.co.trubee.employee.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.trubee.employee.dao.TBPMSEmployeeDAO;
import in.co.trubee.employee.domain.TBPMSEmployeePersonalInfoDomain;
import in.co.trubee.employee.service.TBPMSEmployeeService;

/**
 * @author abhishek.ku
 *
 */
@Service
@Transactional
public class TBPMSEmployeeServiceImpl implements TBPMSEmployeeService{

	@Autowired
	private TBPMSEmployeeDAO employeeDAO;

	@Override
	public List<TBPMSEmployeePersonalInfoDomain> getAllEmployees() {
		return employeeDAO.findAll();
	}

	/**
	 * 
	 */
	@Override
	public 	Optional<TBPMSEmployeePersonalInfoDomain> findById(Long employeeId) {
		return employeeDAO.findById(employeeId);
	}

}
