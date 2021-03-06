package com.proyect.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.demo.interfaceService.ImateriacursoService;
import com.proyect.demo.interfaces.IMateriacurso;
import com.proyect.demo.modelo.Materiacurso;



@Service
public class MateriacursoService implements ImateriacursoService{

	@Autowired
	private IMateriacurso data;
	
	@Override
	public List<Materiacurso> listar() {
		
		return (List<Materiacurso>)data.findAll();
	}

	@Override
	public Optional<Materiacurso> listarId(int id) {		
		return data.findById(id);
	}

	@Override
	public int save(Materiacurso a) {
		int res=0;
		Materiacurso aula=data.save(a);
		if(!aula.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
