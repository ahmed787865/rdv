package com.smart.rdv.demo.service;

import java.util.List;

import com.smart.rdv.demo.entity.RendezVous;

public interface RdvService {
    public List<RendezVous> getAllRendezVous();
    public RendezVous saveRDV(RendezVous rdv);
}
