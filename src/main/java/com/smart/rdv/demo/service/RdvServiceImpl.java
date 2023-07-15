package com.smart.rdv.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.rdv.demo.Repository.RdvRepository;
import com.smart.rdv.demo.entity.RendezVous;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class RdvServiceImpl implements RdvService {

    @Autowired
    private RdvRepository rdvRepository;

    @Override
    public List<RendezVous> getAllRendezVous() {
        return rdvRepository.findAll();
    }

    @Override
    public RendezVous saveRDV(RendezVous rdv) {
        return rdvRepository.save(rdv);
       
    }
  
}
