/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.repository.crud.PartyroomCrudRepository;
import co.usa.ciclo3.ciclo3.model.Partyroom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gadoj
 */

@Repository
public class PartyroomRepository {
    
    @Autowired
    private PartyroomCrudRepository partyroomCrudRepository;
    
    public List<Partyroom> getAll(){
        return (List<Partyroom>) partyroomCrudRepository.findAll();      
    }
    public Optional <Partyroom> getPartyroom(int id){
        return partyroomCrudRepository.findById(id);                         
    }
    public Partyroom save(Partyroom p){
        return partyroomCrudRepository.save(p);        
    }
    
    
}
