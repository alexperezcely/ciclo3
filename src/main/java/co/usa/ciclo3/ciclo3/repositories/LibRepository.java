package co.usa.ciclo3.ciclo3.repositories;

import co.usa.ciclo3.ciclo3.model.Lib;
import co.usa.ciclo3.ciclo3.repositories.crud.LibCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibRepository {

    @Autowired
    private LibCrudRepository libCrudRepository;

    public List<Lib>getAll(){
        return (List<Lib>) libCrudRepository.findAll();
    }

    public Optional<Lib>getLib(int id){
        return libCrudRepository.findById(id);
    }

    public Lib save(Lib l){
        return libCrudRepository.save(l);
    }
}
