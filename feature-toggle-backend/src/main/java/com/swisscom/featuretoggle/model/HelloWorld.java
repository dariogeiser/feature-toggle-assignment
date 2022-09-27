package com.swisscom.featuretoggle.model;

import javax.persistence.*;

@Entity
public class HelloWorld {

    @Id
    private String id;

    private String name;

    public HelloWorld() {

    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public HelloWorld(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
