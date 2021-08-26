package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Foroprofesor;

@Repository
public interface IForoprofesor extends CrudRepository<Foroprofesor, Integer>{

}
