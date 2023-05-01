package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Member;
import com.example.demo.domain.MemberRepository;

@RestController
public class MemberService {

    @Autowired
    MemberRepository repository;


    // @RequestMapping(path="/members",
    //     method=RequestMethod.POST,
    //     produces = "application/json;charset=UTF-8"
    // )
    // public void save(@RequestBody MemberDTO memberDTO){
    //     Member member = new Member();
    //     member.setName(memberDTO.getChangedName());

    //     repository.save(member);

    // }

    @RequestMapping(path="/members/{id}/deactivate",
        method=RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public void deactivate(@PathVariable("id") Long id){
        
        repository.findById(id).ifPresent(member -> {
            member.deactivate();
            repository.save(member);
        });

    }
    
}
