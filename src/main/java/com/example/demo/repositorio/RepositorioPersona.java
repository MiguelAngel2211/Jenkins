package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Persona;


public interface RepositorioPersona extends JpaRepository<Persona, Long>{

}
