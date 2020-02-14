package com.pers.ma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pers.ma.model.Adresse;
import com.pers.ma.model.Personne;
import com.pers.ma.repository.PersonneRepo;

@SpringBootApplication
public class GestionpersonneApplication implements CommandLineRunner{

	@Autowired
	PersonneRepo prepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionpersonneApplication.class, args);
		
		
	}
	@Bean
	public void aa()
	{
		Adresse adr=new Adresse();
		Personne p=new Personne("fffff","pop","ggg",adr);
		prepo.save(p);
		
	}
	@Override
	public void run(String... args) throws Exception {
		aa();
		
	}
	
	

}
