package com.proyect.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.demo.modelo.Periodo;

@Repository
public interface IPeriodo extends CrudRepository<Periodo, Integer>{

}