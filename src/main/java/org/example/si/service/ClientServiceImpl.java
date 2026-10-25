package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entities.Client;
import org.example.si.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {
    ClientRepository clientRepository;

    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    public Client retrieveClient(Long clientId) {
        return clientRepository.findById(clientId).get();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public void removeClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    public Client modifyClient(Client client) {
        return clientRepository.save(client);
    }
}
