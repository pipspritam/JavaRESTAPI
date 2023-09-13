package com.pips.JavaRESTAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pips.JavaRESTAPI.model.ServerInfo;
import com.pips.JavaRESTAPI.service.Service;

@RestController
@RequestMapping("/")

public class Controller {
    @Autowired
    Service service;

    @PostMapping("/addServer")
    public String addServer(@RequestBody ServerInfo serverInfo) {
        service.addServer(serverInfo);

        return "Server added";
    }

    @GetMapping("/getServers")
    public ResponseEntity<List<ServerInfo>> getServers() {
        return ResponseEntity.ok(service.getServers());

    }

    @GetMapping("/getServerByid/{id}")
    public ResponseEntity<ServerInfo> getServerById(@PathVariable String id) {
        ServerInfo serverInfo = service.getServerById(id);
        if (serverInfo == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(serverInfo);
        }
    }

    @GetMapping("/getServers/{name}")
    public ResponseEntity<List<ServerInfo>> getServerByName(@PathVariable String name) {
        List<ServerInfo> serverInfo = service.getServerByName(name);
        if (serverInfo.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(serverInfo);
        }
    }

    @DeleteMapping("/deleteServer/{id}")
    public String deleteServer(@PathVariable String id) {
        boolean flag = service.deleteServer(id);
        if (!flag) {
            return "Server not found";
        } else {
            return "Server deleted";
        }
    }

}
