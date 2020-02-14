package com.pers.ma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pers.ma.model.Personne;

public interface PersonneRepo extends JpaRepository<Personne, Long> {
	List<Personne> findByNom(String nom);
	List<Personne> findByCin(String cin);
}
