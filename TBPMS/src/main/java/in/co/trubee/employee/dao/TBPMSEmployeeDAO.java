/**
 * @author : abhishek.ku
 * @date : Dec 17, 2018
 * @filname : TBPMSEmployeeDAO.java
 * @pacagename :in.co.trubee.employee.doa
 */
package in.co.trubee.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trubee.employee.domain.TBPMSEmployeePersonalInfoDomain;

/**
 * @author abhishek.ku
 *
 */
public interface TBPMSEmployeeDAO extends JpaRepository<TBPMSEmployeePersonalInfoDomain, Long>{

}
