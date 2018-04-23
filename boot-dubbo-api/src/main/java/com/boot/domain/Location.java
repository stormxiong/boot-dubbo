package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {

    private String province;

    private String city;

    private String country;

} 
