/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSEmployeeDomain.java
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author abhishek.ku
 *
 */

@Entity
@Table(name="employee")
public class TBEMSEmployeeDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_address")
	private String emailId;
	
	@Column(name = "dob" )
	private Date dob;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "age")
	private long age;
	
	@Column(name = "profile_pic")
	private String  profilePicURL;
	
	@Column(name = "emp_id")
	private String  empId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSAddressDomain>address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSDepartmentDomain>department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSDependentDomain>dependent;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSWorksDetailDomain>workDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.TRUE)
	@JsonManagedReference
	private List<TBEMSProjectDomain>project;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the age
	 */
	public long getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(long age) {
		this.age = age;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return the address
	 */
	public List<TBEMSAddressDomain> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<TBEMSAddressDomain> address) {
		this.address = address;
	}

	/**
	 * @return the department
	 */
	public List<TBEMSDepartmentDomain> getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(List<TBEMSDepartmentDomain> department) {
		this.department = department;
	}

	/**
	 * @return the dependent
	 */
	public List<TBEMSDependentDomain> getDependent() {
		return dependent;
	}

	/**
	 * @param dependent the dependent to set
	 */
	public void setDependent(List<TBEMSDependentDomain> dependent) {
		this.dependent = dependent;
	}

	/**
	 * @return the workDetails
	 */
	public List<TBEMSWorksDetailDomain> getWorkDetails() {
		return workDetails;
	}

	/**
	 * @param workDetails the workDetails to set
	 */
	public void setWorkDetails(List<TBEMSWorksDetailDomain> workDetails) {
		this.workDetails = workDetails;
	}

	/**
	 * @return the project
	 */
	public List<TBEMSProjectDomain> getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(List<TBEMSProjectDomain> project) {
		this.project = project;
	}

	
	/**
	 * @return the profilePicURL
	 */
	public String getProfilePicURL() {
		return profilePicURL;
	}

	/**
	 * @param profilePicURL the profilePicURL to set
	 */
	public void setProfilePicURL(String profilePicURL) {
		this.profilePicURL = profilePicURL;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TBEMSEmployeeDomain [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", dob=" + dob + ", bloodGroup=" + bloodGroup + ", age=" + age
				+ ", profilePicURL=" + profilePicURL + ", empId=" + empId + ", address=" + address + ", department="
				+ department + ", dependent=" + dependent + ", workDetails=" + workDetails + ", project=" + project
				+ "]";
	}

	

}
