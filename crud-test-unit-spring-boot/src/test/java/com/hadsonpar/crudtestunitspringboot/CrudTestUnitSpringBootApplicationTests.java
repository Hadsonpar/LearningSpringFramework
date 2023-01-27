package com.hadsonpar.crudtestunitspringboot;

import com.hadsonpar.crudtestunitspringboot.business.IClientBusiness;
import com.hadsonpar.crudtestunitspringboot.entity.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CrudTestUnitSpringBootApplicationTests {

	@Autowired
	private IClientBusiness clientBusiness;
	@Test
	void contextLoads() {
	}

	@Test//Create
	void testInsertClient(){
		Client client = new Client();

		client.setName("Carmen Guerra");
		client.setAddress("Jr Carlindo");

		clientBusiness.insertClient(client);
	}

	@Test//Read
	void testSelectClient(){
		List<Client> list;
		list = clientBusiness.listClient();

		for(Client p:list){
			System.out.println(p.getName() + " - " +  p.getAddress());
		}
	}

	@Test//Update
	void testUpdateClient(){
		try {
			Client client = new Client();
			client.setCode(1L);
			client.setName("Cesar Paredes");
			client.setAddress("Los Campos");

			clientBusiness.updateClient(client);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Test//Test JUnit Delete
	void testDeleteClient() throws Exception{
		//registro a eliminar según código 5
		long clientId = 5L;
		clientBusiness.deleteClient(clientId);
	}
}