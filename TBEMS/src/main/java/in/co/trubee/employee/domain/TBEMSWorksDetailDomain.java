/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSWorksDetailDomain.java
 * @pacagename :in.co.trubee.employee.domain
 */
package in.co.trubee.employee.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author abhishek.ku
 *
 */
@Entity
@Table(name="emp_work")
public class TBEMSWorksDetailDomain {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="projected_start_date")
	private Date projectedStartDate;
	
	@Column(name="projected_end_date")
	private Date projectedEndDate;
	
	@Column(name="logged_hours")
	private Integer loggedHours;
	
	
	@Column(name="remaining_hours")
	private Integer remainingHours;
	
	@ManyToOne
	@JoinColumn(name = "eid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSEmployeeDomain employee;

	/**
	 * @return the projectedStartDate
	 */
	public Date getProjectedStartDate() {
		return projectedStartDate;
	}

	/**
	 * @param projectedStartDate the projectedStartDate to set
	 */
	public void setProjectedStartDate(Date projectedStartDate) {
		this.projectedStartDate = projectedStartDate;
	}

	/**
	 * @return the projectedEndDate
	 */
	public Date getProjectedEndDate() {
		return projectedEndDate;
	}

	/**
	 * @param projectedEndDate the projectedEndDate to set
	 */
	public void setProjectedEndDate(Date projectedEndDate) {
		this.projectedEndDate = projectedEndDate;
	}

	/**
	 * @return the loggedHours
	 */
	public Integer getLoggedHours() {
		return loggedHours;
	}

	/**
	 * @param loggedHours the loggedHours to set
	 */
	public void setLoggedHours(Integer loggedHours) {
		this.loggedHours = loggedHours;
	}

	/**
	 * @return the remainingHours
	 */
	public Integer getRemainingHours() {
		return remainingHours;
	}

	/**
	 * @param remainingHours the remainingHours to set
	 */
	public void setRemainingHours(Integer remainingHours) {
		this.remainingHours = remainingHours;
	}

	/**
	 * @return the employee
	 */
	public TBEMSEmployeeDomain getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(TBEMSEmployeeDomain employee) {
		this.employee = employee;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TBEMSWorksDetailDomain [projectedStartDate=" + projectedStartDate + ", projectedEndDate="
				+ projectedEndDate + ", loggedHours=" + loggedHours + ", remainingHours=" + remainingHours
				+ ", employee=" + employee + "]";
	}
	
	

}
