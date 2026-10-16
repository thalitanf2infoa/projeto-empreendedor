package br.com.senai.infoa.backend.projeto_empreendedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_empreendedor.models.Empreendedor;
import br.com.senai.infoa.backend.projeto_empreendedor.repositories.EmpreendedorRepository;

@Service 
public class EmpreendedorService {
     
    @Autowired
    private EmpreendedorRepository repo;

    public long contar() {
        return repo.count();
    }
    public List<Empreendedor> listarEmpreendedores(){
        return repo.findAll();
    }

    public Empreendedor buscarPorId(Integer id){
        return repo.findById(id).get();
    }
}
