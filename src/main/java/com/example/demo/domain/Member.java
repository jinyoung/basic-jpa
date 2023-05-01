package com.example.demo.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Member {

    @Id @GeneratedValue
    Long id;

    String name;

    String firstName;
   
    String lastName;

    String state;

    @Embedded
    Address address;

    @ElementCollection
    List<Address> addresses;

    @OneToMany(mappedBy = "member")
    List<MemberAudit> history;

    @PrePersist
    protected void splitName(){
        setFirstName(getName().substring(1, 1));
        setLastName(getName());
    }

    public void deactivate(){
        setState("DEACTIVATED");
        getHistory().stream().forEach(history->{history.deactivate();});
    }
    
}
