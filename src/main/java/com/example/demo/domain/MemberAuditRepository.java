package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAuditRepository extends JpaRepository<MemberAudit, Long>{
    
}
