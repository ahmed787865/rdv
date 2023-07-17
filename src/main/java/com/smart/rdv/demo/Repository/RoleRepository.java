package com.smart.rdv.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.rdv.demo.entity.ERole;

import com.smart.rdv.demo.entity.roles;

@Repository
public interface RoleRepository extends JpaRepository<roles, Long> {
  Optional<roles> findByName(ERole name);
}
