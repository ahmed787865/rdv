package com.smart.rdv.demo.Controller;


import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.smart.rdv.demo.entity.RendezVous;
import com.smart.rdv.demo.service.RdvService;


@RestController 
public class RdvController {

     @Autowired
    private RdvService rdvservice;

      @GetMapping (value = "/rdvs")
    public List<RendezVous> getAllRDVS(){
        return rdvservice.getAllRendezVous();
    }
      @GetMapping (value = "/bj")
    public String bjr(){
        return "bonjour ";
    }
    @PostMapping (value = "/rdv")
    public ResponseEntity<RendezVous> addEmp(@RequestBody RendezVous rdv 
                                         )  {
        rdvservice.saveRDV(rdv);
        return new ResponseEntity<RendezVous>(rdv, HttpStatus.CREATED);
    }
}
