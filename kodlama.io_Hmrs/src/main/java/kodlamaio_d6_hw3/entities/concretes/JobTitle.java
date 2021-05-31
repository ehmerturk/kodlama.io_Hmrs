package kodlamaio_d6_hw3.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_title")
public class JobTitle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;

	
	public JobTitle() {}
	
	public JobTitle(String title) {
		super();
		this.title = title;
	}



	
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
}
