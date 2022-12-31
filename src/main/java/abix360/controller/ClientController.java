package abix360.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abix360.dto.CreateClientDTO;
import abix360.usecase.CreateClientUseCase;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@GetMapping("/create")
	public String create() throws ParseException {

		String dateInString = "1987/09/05";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
		
		
		CreateClientDTO createClient = new CreateClientDTO();
		createClient.setName("Lilian");
		createClient.setLastName("Riojas Gonzalez");
		createClient.setDocument("1010230231");
		createClient.setDocumentType("CC");
		createClient.setEmail("lilian@gmail.com");
		createClient.setDateOfBirth(formatter.parse(dateInString));
		
		CreateClientUseCase useCase = new CreateClientUseCase();
		
		boolean success = useCase.execute(createClient);
		if (!success) {			
			return "Ha ocurrido un error al crear el cliente";
		}
		
		return "El cliente se ha creado con éxito";		
	}
}
