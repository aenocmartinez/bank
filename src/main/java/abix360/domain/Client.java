package abix360.domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import abix360.dao.ClientDAO;
import abix360.dao.ProductDAO;
import abix360.domain.repositories.ClientRepository;
import abix360.domain.repositories.ProductRepository;

public class Client {
	
	private ClientRepository clientDao = new ClientDAO();
	private ProductRepository productDao = new ProductDAO();

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

	public boolean create() {		
		return this.clientDao.create(this);
	}

	public boolean delete() {
		return false;
	}

	public boolean update() {
		return false;
	}

	public boolean isAdult() {
        LocalDate dateConvert = this.dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period yearsOld = Period.between(dateConvert, LocalDate.now());
        return  yearsOld.getYears() >= 18;
	}

	public boolean hasProductUncancelled() {
		return false;
	}

	public static Client findClientById(int id) {
		return null;
	}

	public static Client findClientByDocument(String documentType, String document) {
		return new Client();
	}

	public static ArrayList<Client> all() {
		return null;
	}

	public ArrayList<Product> listProducts() {
		return this.clientDao.productsOfClient(this);
	}

	public boolean addProduct(Product product) {
		boolean success = this.productDao.create(product);
		if (!success) {
			return false;
		}
		
		return this.clientDao.addProductToClient(this, product);
	}

	public boolean removeProduct(Product product) {		
		return this.clientDao.removeProductToClient(this, product);
	}

	public boolean cancelProduct(Product product) {
		return false;
	}
	
	public boolean exists() {
		return this.id > 0;
	}
}
