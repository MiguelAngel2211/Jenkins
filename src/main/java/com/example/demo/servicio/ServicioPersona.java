package com.example.demo.servicio;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;

@Service
public interface ServicioPersona {
		//POST
		public ResponseEntity<Persona> crearUsuario(Persona persona);
		
		//GET
		public List<Persona> recogerUsuarios();
		
}
