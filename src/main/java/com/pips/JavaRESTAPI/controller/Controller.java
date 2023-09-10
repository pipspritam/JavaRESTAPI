package com.pips.JavaRESTAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pips.JavaRESTAPI.model.ServerInfo;
import com.pips.JavaRESTAPI.service.Service;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping("/api/servers")

public class Controller {
    @Autowired
    Service service;

    @PostMapping
    public String addServer(@RequestBody ServerInfo serverInfo) {
        service.addServer(serverInfo);

        return "Server added";
    }  

    @GetMapping
    public ResponseEntity< List<ServerInfo>> getServers() {
        return ResponseEntity.ok(service.getServers());
        
    }
    

}
