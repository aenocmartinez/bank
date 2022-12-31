package abix360.dao;

import java.util.ArrayList;

import abix360.domain.Client;
import abix360.domain.Product;
import abix360.domain.repositories.ClientRepository;

public class ClientDAO implements ClientRepository {

	@Override
	public boolean create(Client client) {
		System.out.println("");
		System.out.println("*********** ClienteDAO ***********");
		System.out.println(client.getName() + " " + client.getLastName());
		System.out.println(client.getDocumentType() + " " + client.getDocument());
		System.out.println("");
		System.out.println("");
		return true;
	}

	@Override
	public boolean delete(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Client> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProductToClient(Client client, Product product) {
		System.out.println("");
		System.out.println("*********** ClienteDAO / Agrega cuenta de ahorro ***********");
		System.out.println("Agrega cuenta: " + product.getType() + " - " + product.getNumber());
		System.out.println("Cliente: " + client.getDocumentType() + " - " + client.getDocument());
		System.out.println("");
		System.out.println("");
		return true;
	}

	@Override
	public boolean removeProductToClient(Client client, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Product> productsOfClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
