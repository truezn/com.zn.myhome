package com.zn.myhome.srv.profile.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    
    }
}