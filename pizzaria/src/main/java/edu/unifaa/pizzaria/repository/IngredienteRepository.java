package edu.unifaa.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unifaa.pizzaria.model.Ingrediente;


public interface  IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    
    Ingrediente findByDescricao(String descricao);
    
}
