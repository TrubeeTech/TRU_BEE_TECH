/**
 * @author : abhishek.ku
 * @date : Dec 21, 2018
 * @filname : TBEMSClientDomain.java
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
@Table(name="client_detials")
public class TBEMSClientDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="client_name")
	private String clientName;
	
	@ManyToOne
	@JoinColumn(name = "pid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSProjectDomain project;
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TBEMSClientDomain [clientName=" + clientName + ", project=" + project + "]";
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the project
	 */
	public TBEMSProjectDomain getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(TBEMSProjectDomain project) {
		this.project = project;
	}


	
}
