package edu.unifaa.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unifaa.pizzaria.model.Ingrediente;
import edu.unifaa.pizzaria.service.IngredienteService;

@RestController
@RequestMapping("/api/ingredientes") //Rota ou endpoint 
@CrossOrigin("*")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;
    
    @GetMapping
    public List<Ingrediente> obterTodos(){
        return ingredienteService.obterTodos();
}

    @GetMapping("/{id}")
    public Ingrediente obterPorId(@PathVariable Long id){

        return ingredienteService.obterPorId(id);
}

    @PostMapping
    public Ingrediente adicionar(@RequestBody Ingrediente ingrediente){
        return ingredienteService.adicionar(ingrediente);

}

    @PutMapping("/{id}")
    public Ingrediente atualizar(@PathVariable Long id, @RequestBody Ingrediente ingrediente){
        return ingredienteService.atualizar(id, ingrediente);

}

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
    ingredienteService.deletar(id);
    }
}

// http://localhost:8081/api/ingredientes/2
