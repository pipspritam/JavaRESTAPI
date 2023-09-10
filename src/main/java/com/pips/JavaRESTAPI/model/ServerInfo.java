package com.pips.JavaRESTAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "server")



public class ServerInfo {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String language;
    @Field
    private String framework;


    public ServerInfo(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }
    
    public ServerInfo() {
        this.id = "";
        this.name = "";
        this.language = "";
        this.framework = "";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }


    public String getFramework() {
        return framework;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
}
