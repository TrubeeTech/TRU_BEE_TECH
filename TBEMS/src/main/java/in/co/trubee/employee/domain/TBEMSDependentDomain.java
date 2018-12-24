/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSEmpDependentsDomain.java
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
@Table(name="emp_dependent")
public class TBEMSDependentDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="dependent_name")
	private String dependentName;
	
	@Column(name="phone")
	private Long phone;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="dob")
	private Date dob;

	@Column(name="relation")
	private String relation;
	
	@Column(name="profile_pic")
	private String profilePicURL;
	
	
	@ManyToOne
	@JoinColumn(name = "eid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSEmployeeDomain employee;

	/**
	 * @return the dependentName
	 */
	public String getDependentName() {
		return dependentName;
	}

	/**
	 * @param dependentName the dependentName to set
	 */
	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

	/**
	 * @return the phone
	 */
	public Long getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
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
		return "TBEMSDependentDomain [dependentName=" + dependentName + ", phone=" + phone + ", sex=" + sex + ", dob="
				+ dob + ", relation=" + relation + ", employee=" + employee + "]";
	}
	
	
}
