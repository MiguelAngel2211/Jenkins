package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
import com.example.demo.repositorio.RepositorioPersona;

@Service
public class ServicioPersonaImp implements ServicioPersona{
	@Autowired
	private RepositorioPersona repositorio;
	
	@Override
	public ResponseEntity<Persona> crearUsuario(Persona persona) {
		try {
			
			return new ResponseEntity<Persona> (repositorio.save(persona), HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<Persona> (HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public List<Persona> recogerUsuarios() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
}
