package com.pips.JavaRESTAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pips.JavaRESTAPI.model.ServerInfo;
import com.pips.JavaRESTAPI.repository.ServerRepository;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    ServerRepository serverRepository;

    public void addServer(ServerInfo serverInfo) {
        serverRepository.save(serverInfo);

    }

    public  List<ServerInfo> getServers() {
        return serverRepository.findAll();
    }

    public ServerInfo getServerById(String id) {
        return serverRepository.findById(id).orElse(null);

    }

    public List<ServerInfo> getServerByName(String name) {
        return serverRepository.findByName(name);
    }

    public boolean deleteServer(String id) {
        boolean exists = serverRepository.existsById(id);
        if(!exists) {
            return false;
        }
        else {
            serverRepository.deleteById(id);
            return true;
    }
        
    }
    
}
