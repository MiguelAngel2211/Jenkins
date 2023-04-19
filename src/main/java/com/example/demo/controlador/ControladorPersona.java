package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Persona;
import com.example.demo.servicio.ServicioPersona;

@RestController
@RequestMapping("/personas")
public class ControladorPersona {
	
	@Autowired
	private ServicioPersona servicio;
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<Persona> crearUsuario(@RequestBody Persona persona) {
		return servicio.crearUsuario(persona);
	}
	
	@GetMapping
	public ResponseEntity<List<Persona>> recogerUsuarios() {
		return new ResponseEntity<> (servicio.recogerUsuarios(), HttpStatus.FOUND);
	}
	
}
