package br.com.senai.infoa.backend.projeto_empreendedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_empreendedor.models.Empreendedor;
import br.com.senai.infoa.backend.projeto_empreendedor.services.EmpreendedorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;






@RestController 
@RequestMapping("/empreendedor")
public class EmpreendedorController {

    @Autowired
    private EmpreendedorService service;

    @GetMapping("/contar")
    public long contar() {
    return service.contar();
    }

    @GetMapping("/listar")
    public List<Empreendedor> listar() {
        return service.listarEmpreendedores();
    }
    @GetMapping("/buscar/{id}")
    public Empreendedor buscarPorId(@RequestParam Integer id) {
        return service.buscarPorId(id);
    }
    
 

}