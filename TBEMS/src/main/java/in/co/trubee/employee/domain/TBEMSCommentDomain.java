/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSCommentDomain.java
 * @pacagename :in.co.trubee.employee.domain
 */
package in.co.trubee.employee.domain;

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
@Table(name="emp_comment")
public class TBEMSCommentDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "eid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSEmployeeDomain employee;

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
		return "TBEMSCommentDomain [comment=" + comment + ", employee=" + employee + "]";
	}
	

}
