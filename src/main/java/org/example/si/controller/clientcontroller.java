package org.example.si.controller;

import lombok.AllArgsConstructor;
import org.example.si.entity.client;
import org.example.si.service.Iclient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class clientcontroller {
    Iclient clientService;

    @GetMapping("/retrieve-all-clients")
    public List<client> getClients() {
        List<client> listClients = clientService.retrieveAllClients();
        return listClients;
    }

    @GetMapping("/retrieve-client/{client-id}")
    public client retrieveClient(@PathVariable("client-id") Long clientId) {
        client client = clientService.retrieveClient(clientId);
        return client;
    }

    @PostMapping("/add-client")
    public client addClient(@RequestBody client c) {
        client client = clientService.addClient(c);
        return client;
    }

    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }

    @PutMapping("/modify-client")
    public client modifyClient(@RequestBody client c) {
        client client = clientService.modifyClient(c);
        return client;
    }
}
