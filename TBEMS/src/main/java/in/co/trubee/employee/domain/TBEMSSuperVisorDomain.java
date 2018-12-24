/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSProjectDomain.java
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
@Table(name="project_supervisor")
public class TBEMSSuperVisorDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="supervisior_name")
	private String superVisorName;
	
	@Column(name="start_date")
	private Date startDate;

	
	@Column(name="comments")
	private Date comments;


	/**
	 * @return the superVisorName
	 */
	public String getSuperVisorName() {
		return superVisorName;
	}


	/**
	 * @param superVisorName the superVisorName to set
	 */
	public void setSuperVisorName(String superVisorName) {
		this.superVisorName = superVisorName;
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


	/**
	 * @return the comments
	 */
	public Date getComments() {
		return comments;
	}


	/**
	 * @param comments the comments to set
	 */
	public void setComments(Date comments) {
		this.comments = comments;
	}
	

}
