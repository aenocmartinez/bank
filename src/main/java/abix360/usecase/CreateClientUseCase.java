package abix360.usecase;

import abix360.domain.CheckingAccount;
import abix360.domain.Client;
import abix360.domain.Product;
import abix360.domain.SavingsAccount;
import abix360.dto.CreateClientDTO;

public class CreateClientUseCase {
	
	public boolean execute(CreateClientDTO createClient) {
		
		boolean success = false;
		
		Client client = Client.findClientByDocument(createClient.getDocumentType(), createClient.getDocument());
		
		if (client.exists()) {
			System.out.println("El cliente ya existe");
			return success;
		}
		
		client.withDocument(createClient.getDocument())
				.withDocumentType(createClient.getDocumentType())
				.withName(createClient.getName())
				.withLastName(createClient.getLastName())
				.withDateOfBirth(createClient.getDateOfBirth());
		
		if (!client.isAdult()) {
			System.out.println("El cliente es menor de edad, no se puede crear");
			return success;
		}
		
		success = client.create();
		if (!success) {
			System.out.println("Ha ocurrido un error al crear el cliente");
			return success;
		}
		
		Product product = new SavingsAccount();
		if (createClient.getProductType() == 'C') {
			product = new CheckingAccount();
		}
		
		product.assignNumber();
		
		success = client.addProduct(product);
		if (!success) {
			System.out.println("Ha ocurrido un error al asignar el producto al cliente");	
			return success;
		}
		
		return success;
	}

}
