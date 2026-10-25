package org.example.si.service;

import org.example.si.entity.client;
import org.example.si.repository.clientrep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class clientservice implements Iclient {

    private final clientrep clientrep;

    public clientservice(clientrep clientrep) {
        this.clientrep = clientrep;
    }
    public client addclient(client c) {
        return clientrep.save(c);
    }

    public List<client> getallClient() {

        return clientrep.findAll();
    }
    public client getclientbyid (Long id) {
        return clientrep.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found: " + id));
    }

    public void deleteclinet(Long id) {
        clientrep.deleteById(id);
    }




}
