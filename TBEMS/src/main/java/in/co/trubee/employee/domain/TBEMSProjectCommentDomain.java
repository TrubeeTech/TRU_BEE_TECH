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
@Table(name="project_comment")
public class TBEMSProjectCommentDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "pid",referencedColumnName = "id", insertable = false, updatable = false)
	@JsonBackReference
	private TBEMSProjectDomain project;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TBEMSProjectCommentDomain [comment=" + comment + ", project=" + project + "]";
	}
	
	
	
}
