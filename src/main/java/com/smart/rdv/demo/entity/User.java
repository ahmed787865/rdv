package com.smart.rdv.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity 
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, unique = true, nullable = false)
    private String username;
	
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

   @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<roles> roles = new HashSet<>();
    
    
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
     public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Long id, String username, String email , String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public Set<roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<roles> roles) {
        this.roles = roles;
    }

   

    
    
    
}
