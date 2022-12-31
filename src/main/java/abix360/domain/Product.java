package abix360.domain;

import java.util.Date;
import java.util.Random;

import abix360.dao.ProductDAO;

public abstract class Product {
	
	private ProductDAO productDao = new ProductDAO();
	
	protected int id;
	protected String number;
	protected String status;
	protected double balance;
	protected double avalaibleBalance;
	protected boolean exemptGMF;
	protected Date createdOn;
	protected String createdBy;
	protected Date updatedOn;
	protected String updatedBy;
	protected Client client;

	public int getId() {
		return id;
	}

	public Product withId(int id) {
		this.id = id;
		return this;
	}

	public String getNumber() {
		return number;
	}

	public Product withNumber(String number) {
		this.number = number;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Product withStatus(String status) {
		this.status = status;
		return this;
	}

	public double getBalance() {
		return balance;
	}

	public Product withBalance(double balance) {
		this.balance = balance;
		return this;
	}

	public double getAvalaibleBalance() {
		return avalaibleBalance;
	}

	public Product withAvalaibleBalance(double avalaibleBalance) {
		this.avalaibleBalance = avalaibleBalance;
		return this;
	}

	public boolean isExemptGMF() {
		return exemptGMF;
	}

	public Product withExemptGMF(boolean exemptGMF) {
		this.exemptGMF = exemptGMF;
		return this;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public Product withCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Product withCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public Product withUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Product withUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}
	
	
	
	public Client getClient() {
		return client;
	}

	public Product withClient(Client client) {
		this.client = client;
		return this;
	}
	
	protected String generateNumber() {
		Random r = new Random();		
		return String.format("%8d", r.nextInt(99999999));
	}

	
	public boolean activate() {
		return false;
	}
	
	public boolean cancel() {
		return false;
	}
	
	public boolean update() {
		return this.productDao.update(this);
	}
	
	public boolean create() {
		return this.productDao.create(this);
	}
	
	public abstract void assignNumber();
	

	public abstract String getType();
	

}
