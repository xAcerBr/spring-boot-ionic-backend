package br.com.henrique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henrique.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
