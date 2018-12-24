/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TVBEMSWorkDomain.java
 * @pacagename :in.co.trubee.employee.domain
 */
package in.co.trubee.employee.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author abhishek.ku
 *
 */
@Entity
@Table(name="project")
public class TBEMSProjectDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="project_location")
	private String projectLocation;
	
	@Column(name="projected_start_date")
	private Date projectedStartDate;
	
	@Column(name="projected_end_date")
	private Date projectedEndDate;

	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSProjectCommentDomain> comments;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSClientDomain> clientDomain;
	
	@ManyToOne
	@JoinColumn(name = "eid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSEmployeeDomain employee;

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectLocation
	 */
	public String getProjectLocation() {
		return projectLocation;
	}

	/**
	 * @param projectLocation the projectLocation to set
	 */
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

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
	 * @return the comments
	 */
	public List<TBEMSProjectCommentDomain> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<TBEMSProjectCommentDomain> comments) {
		this.comments = comments;
	}

	/**
	 * @return the clientDomain
	 */
	public List<TBEMSClientDomain> getClientDomain() {
		return clientDomain;
	}

	/**
	 * @param clientDomain the clientDomain to set
	 */
	public void setClientDomain(List<TBEMSClientDomain> clientDomain) {
		this.clientDomain = clientDomain;
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
		return "TBEMSProjectDomain [projectName=" + projectName + ", projectLocation=" + projectLocation
				+ ", projectedStartDate=" + projectedStartDate + ", projectedEndDate=" + projectedEndDate
				+ ", comments=" + comments + ", clientDomain=" + clientDomain + ", employee=" + employee + "]";
	}
	
	

}
