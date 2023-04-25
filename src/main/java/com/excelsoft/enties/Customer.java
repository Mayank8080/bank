package com.excelsoft.enties;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@XmlRootElement
@Entity
@Table(name="Customers_info")
public class Customer {
	
	@Id
	private int userId;
	
	private long accountNumber;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	private String name;
	
	private String gender;
	
	private String email;
	
	private String contact;
	
	private String aadharNo;
	
	//use one to one mapping 
	@OneToOne(mappedBy = "customer")
	@JsonManagedReference
    private  Account account;
	@OneToMany(mappedBy = "cust")
	@JsonManagedReference
	private List<Transaction> tran;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Transaction> getTran() {
		return tran;
	}
	public void setTran(List<Transaction> tran) {
		this.tran = tran;
	}
}
