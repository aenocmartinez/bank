package abix360.domain;

import java.util.ArrayList;
import java.util.Date;

import abix360.dao.ClientDAO;
import abix360.domain.repositories.ClientRepository;

public class Client {
	
	private ClientRepository clientDao = new ClientDAO();

	private int id;
	private String documentType;
	private String document;
	private String name;
	private String lastName;
	private String email;
	private Date dateOfBirth;
	private Date createdOn;
	private String createdBy;
	private Date updatedOn;
	private String updatedBy;
	private ArrayList<Product> products;
	

	public int getId() {
		return id;
	}

	public Client withId(int id) {
		this.id = id;
		return this;
	}

	public String getDocumentType() {
		return documentType;
	}

	public Client withDocumentType(String documentType) {
		this.documentType = documentType;
		return this;
	}

	public String getDocument() {
		return document;
	}

	public Client withDocument(String document) {
		this.document = document;
		return this;
	}

	public String getName() {
		return name;
	}

	public Client withName(String name) {
		this.name = name;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Client withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Client withEmail(String email) {
		this.email = email;
		return this;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Client withDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public Client withCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Client withCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public Client withUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Client withUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public Client withProducts(ArrayList<Product> products) {
		this.products = products;
		return this;
	}

	public boolean create(char typeProduct) {
		
		boolean success = this.clientDao.create(this);
		if (!success){
			System.out.println("Error domain/client/create: al crear el cliente");
			return false;
		}
		
		Product product = new SavingsAccount();
		if (typeProduct == 'C') {
			product = new CheckingAccount();
		}
		
		product.assignNumber();
		
		return this.addProduct(product);
	}

	public boolean delete() {
		return false;
	}

	public boolean update() {
		return false;
	}

	public boolean isAdult() {
		return false;
	}

	public boolean hasProductUncancelled() {
		return false;
	}

	public Client findClientById(int id) {
		return null;
	}

	public Client findClientByDocument(String documentType, String document) {
		return null;
	}

	public static ArrayList<Client> all() {
		return null;
	}

	public ArrayList<Product> listProducts() {
		return this.clientDao.productsOfClient(this);
	}

	public boolean addProduct(Product product) {
		return this.clientDao.addProductToClient(this, product);
	}

	public boolean removeProduct(Product product) {		
		return this.clientDao.removeProductToClient(this, product);
	}

	public boolean cancelProduct(Product product) {
		return false;
	}
}
