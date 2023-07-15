package com.smart.rdv.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.rdv.demo.entity.RendezVous;

@Repository
public interface RdvRepository extends JpaRepository<RendezVous, Long>{
    
}
