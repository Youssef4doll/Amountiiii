package org.example.si.service;

import lombok.AllArgsConstructor;
import org.example.si.entity.client;
import org.example.si.repository.clientrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class clientservice implements Iclient {
    clientrep clientrep;

    public List<client> retrieveAllClients() {
        return clientrep.findAll();
    }

    public client retrieveClient(Long clientId) {
        return clientrep.findById(clientId).get();
    }

    public client addClient(client client) {
        return clientrep.save(client);
    }

    public void removeClient(Long clientId) {
        clientrep.deleteById(clientId);
    }

    public client modifyClient(client client) {
        return clientrep.save(client);
    }
}
