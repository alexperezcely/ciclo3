package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Lib;
import co.usa.ciclo3.ciclo3.repositories.LibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibService {

    @Autowired
    private LibRepository libRepository;

    public List<Lib>getAll(){
        return libRepository.getAll();
    }

    public Optional<Lib>getLib(int id){
        return libRepository.getLib(id);
    }

    public Lib save(Lib l){
        if(l.getId()==null){
            return libRepository.save(l);
        } else {
            Optional<Lib>paux=libRepository.getLib(l.getId());
            if(paux.isEmpty()){
                return libRepository.save(l);
            }else {
                return l;
            }

        }

    }
}
