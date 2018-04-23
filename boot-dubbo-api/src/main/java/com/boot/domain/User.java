package com.boot.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private Integer gender;

    private Set<Location> locations;
} 
