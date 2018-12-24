/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSAddressDomain.java
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
@Table(name="employee_address")
public class TBEMSAddressDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="house_name")
	private String houseName;
	
	@Column(name="door_number")
	private Integer doorNumber;
	
	@Column(name="land_mark")
	private String landmark;
	
	@Column(name="zip_code")
	private Long zipcode;
	
	@Column(name="address_line_1")
	private String AddressLine1;
	
	@Column(name="address_line_2")
	private String AddressLine2;
	
	@Column(name="phone_number")
	private Long phoneNumber;
	
	@Column(name="fax_number")
	private Long faxNumber;
	
	@ManyToOne
	@JoinColumn(name = "eid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSEmployeeDomain employee;

	/**
	 * @return the houseName
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * @param houseName the houseName to set
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * @return the doorNumber
	 */
	public Integer getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(Integer doorNumber) {
		this.doorNumber = doorNumber;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the zipcode
	 */
	public Long getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return AddressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return AddressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	/**
	 * @return the phoneNumber
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the faxNumber
	 */
	public Long getFaxNumber() {
		return faxNumber;
	}

	/**
	 * @param faxNumber the faxNumber to set
	 */
	public void setFaxNumber(Long faxNumber) {
		this.faxNumber = faxNumber;
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
		return "TBEMSAddressDomain [houseName=" + houseName + ", doorNumber=" + doorNumber + ", landmark=" + landmark
				+ ", zipcode=" + zipcode + ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2
				+ ", phoneNumber=" + phoneNumber + ", faxNumber=" + faxNumber + ", employee=" + employee + "]";
	}
	
}
