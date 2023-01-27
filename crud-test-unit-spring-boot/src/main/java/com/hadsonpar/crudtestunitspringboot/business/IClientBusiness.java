package com.hadsonpar.crudtestunitspringboot.business;

import com.hadsonpar.crudtestunitspringboot.entity.Client;

import java.util.List;

public interface IClientBusiness {
    public Client insertClient(Client client);
    public Client findClient(Long pcode) throws Exception;
    public  List<Client> listClient();
    public Client updateClient(Client client) throws Exception;
    public void deleteClient(Long id) throws Exception;
}