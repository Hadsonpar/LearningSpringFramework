package com.hadsonpar.crudtestunitspringboot.business;

import com.hadsonpar.crudtestunitspringboot.entity.Client;
import com.hadsonpar.crudtestunitspringboot.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBusiness implements IClientBusiness {

    @Autowired
    IClientRepository iClientRepository;

    @Override
    public Client insertClient(Client client) {
        return iClientRepository.save(client);
    }

    @Override
    public Client findClient(Long pcode) throws Exception {
        return iClientRepository.findById(pcode).orElseThrow(
                () -> new Exception("No se encontró la entidad"));
    }

    @Override
    public List<Client> listClient() {
        return iClientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) throws Exception{
        findClient(client.getCode());//Invocar al metodo buscar por código
        return iClientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) throws Exception{
        iClientRepository.deleteById(id);
    }
}