package com.pips.JavaRESTAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pips.JavaRESTAPI.model.ServerInfo;

public interface ServerRepository extends MongoRepository<ServerInfo, String>{
    
}
