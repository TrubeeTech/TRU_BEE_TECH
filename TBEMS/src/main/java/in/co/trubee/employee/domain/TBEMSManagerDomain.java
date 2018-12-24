/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSManagerDomain.java
 * @pacagename :in.co.trubee.employee.domain
 */
package in.co.trubee.employee.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author abhishek.ku
 *
 */
@Entity
@Table(name="manager")
public class TBEMSManagerDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="manager_name")
	private String name;
	
	@Column(name="start_date")
	private Date startDate;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	

}
