/**
 * @author : abhishek.ku
 * @date : Dec 17, 2018
 * @filname : TBPMSEmployeeService.java
 * @pacagename :in.co.trubee.employee.service
 */
package in.co.trubee.employee.service;

import java.util.List;
import java.util.Optional;

import in.co.trubee.employee.domain.TBPMSEmployeePersonalInfoDomain;

/**
 * @author abhishek.ku
 *
 */
public interface TBPMSEmployeeService {
	
	public List<TBPMSEmployeePersonalInfoDomain> getAllEmployees() ;

	public Optional<TBPMSEmployeePersonalInfoDomain>  findById(Long employeeId);


}
