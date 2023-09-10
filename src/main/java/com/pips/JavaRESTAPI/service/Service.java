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
    
}
