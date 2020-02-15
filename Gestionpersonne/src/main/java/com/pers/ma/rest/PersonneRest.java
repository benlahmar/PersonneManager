/**
 * 
 */
package com.pers.ma.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.pers.ma.model.Personne;
import com.pers.ma.repository.PersonneRepo;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@RestController
@RequestMapping("/api")
public class PersonneRest {

	@Autowired
	PersonneRepo prepo;
	
	@GetMapping("/personnes")
	public List<Personne> all()
	{
		return prepo.findAll();
	}
	
	@GetMapping("/personnesp")
	public Page<Personne> allp(@RequestParam int p,@RequestParam int size)
	{
		Pageable page=PageRequest.of(p,  size);
		return prepo.findAll(page);
	}
	
	@GetMapping("/personnes/{id}")
	public Personne personnebyid(@PathVariable Long id)
	{
		Optional<Personne> p = prepo.findById(id);
		if(p.isPresent())
			return p.get();
		else
			return null;
	}
	@DeleteMapping("/personnes/{id}")
	public ResponseEntity<Void> deletepersonne(@PathVariable Long id)
	{
		ResponseEntity<Void> rs;
		Optional<Personne> pt = prepo.findById(id);
		if(pt.isPresent())
		{
			prepo.deleteById(id);
			return rs=new ResponseEntity<>(HttpStatus.ACCEPTED) ;
		}
		else
			return rs=new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
	}
	
	@PostMapping("/personnes")
	public Personne addpersonne(@RequestBody Personne p)
	{
		Personne pp= prepo.save(p);
		return pp;
	}
	@PutMapping("/personnes")
	public ResponseEntity<Personne> update(Personne p)
	{
		Personne pt = prepo.save(p);
		ResponseEntity<Personne> res=new ResponseEntity<Personne>(pt,HttpStatus.OK);
		return res;
	}
}
