package com.pers.ma.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pers.ma.model.Personne;

public interface PersonneRepo extends JpaRepository<Personne, Long> {
	Page<Personne> findByNom(String nom, Pageable p);
	Personne findByCin(String cin);
}
