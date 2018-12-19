/**
 * @author : abhishek.ku
 * @date : Dec 17, 2018
 * @filname : TBPMSEmployeeController.java
 * @pacagename :in.co.trubee.employee.controller
 */
package in.co.trubee.employee.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.trubee.employee.domain.TBPMSEmployeePersonalInfoDomain;
//import in.co.trubee.employee.exception.ResourceNotFoundException;
import in.co.trubee.employee.service.TBPMSEmployeeService;

/**
 * @author abhishek.ku
 *
 */
@RestController
@RequestMapping("/tbpms")
public class TBPMSEmployeeController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	private final String className = this.getClass().getName();

	@Autowired
	TBPMSEmployeeService employeeService;

	/**
	 * 
	 * @return
	 * @author : abhishek.ku
	 * @date : Dec 17, 2018
	 * @methodreturn:List<TBPMSEmployeeInfo>
	 *
	 */
	@GetMapping("/employee/list")
	public List<TBPMSEmployeePersonalInfoDomain> getAllEmployees() {
		
		final String cls="CLASS NAME : ";
		final String method="METHOD NAME : ";
		
		final String methodName= this.getClass().getMethods().toString();
		LOGGER.debug(cls, className,method,methodName);
		
		return employeeService.getAllEmployees();
	}
	
	
	/**
	 * 
	 * @param employeeId
	 * @return
	 * @throws ResourceNotFoundException
	 * @author : abhishek.ku
	 * @date : Dec 17, 2018
	 * @methodreturn:ResponseEntity<TBPMSEmployeeInfo>
	 *
	 */	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Optional<TBPMSEmployeePersonalInfoDomain>> getEmployeeById(@PathVariable(value = "id") Long employeeId)
    //throws ResourceNotFoundException
	{
		Optional<TBPMSEmployeePersonalInfoDomain> employee = employeeService.findById(employeeId);
		return ResponseEntity.ok().body(employee);
	}
}
