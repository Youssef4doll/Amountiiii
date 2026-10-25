package org.example.si.service;

import org.example.si.entity.client;

import java.util.List;

public interface Iclient {
    public List<client> retrieveAllClients();
    public client retrieveClient(Long clientId);
    public client addClient(client client);
    public void removeClient(Long clientId);
    public client modifyClient(client client);
}
