package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class MemberAudit{

    @Id @GeneratedValue
    Long id;

    Date date;
    String operation;

    @ManyToOne
    Member member;

    public void deactivate(){
        setOperation("DEACTIVATED");
    }

}
