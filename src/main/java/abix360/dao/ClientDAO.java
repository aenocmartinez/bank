package abix360.dao;

import java.util.ArrayList;

import abix360.domain.Client;
import abix360.domain.Product;
import abix360.domain.repositories.ClientRepository;

public class ClientDAO implements ClientRepository {

	@Override
	public boolean create(Client client) {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return false;
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
