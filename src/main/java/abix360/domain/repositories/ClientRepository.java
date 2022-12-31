package abix360.domain.repositories;

import java.util.ArrayList;

import abix360.domain.Client;
import abix360.domain.Product;

public interface ClientRepository {
	public boolean create(Client client);
	public boolean delete(Client client);
	public boolean update(Client client);
	public ArrayList<Client>all();
	public Client findById(int id);
	public boolean addProductToClient(Client client, Product product);
	public boolean removeProductToClient(Client client, Product product);
	public ArrayList<Product> productsOfClient(Client client);
}
