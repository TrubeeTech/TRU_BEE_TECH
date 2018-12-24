/**
 * @author : abhishek.ku
 * @date : Dec 17, 2018
 * @filname : TBPMSEmployeeService.java
 * @pacagename :in.co.trubee.employee.service
 */
package in.co.trubee.employee.service;

import java.util.List;
import java.util.Optional;

import in.co.trubee.employee.domain.TBEMSEmployeeDomain;

/**
 * @author abhishek.ku
 *
 */
public interface TBPMSEmployeeService {
	
	public List<TBEMSEmployeeDomain> getAllEmployees() ;

	public Optional<TBEMSEmployeeDomain>  findById(Long employeeId);


}
