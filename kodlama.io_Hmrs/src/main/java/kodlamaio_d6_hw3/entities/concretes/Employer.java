package kodlamaio_d6_hw3.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer extends User{

	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private int phoneNumber;

	
	
	
	
	public Employer() {}
	
	

	public Employer(String companyName, String website, int phoneNumber) {
		super();
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
