package com.pers.ma;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class GestionpersonneApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionpersonneApplication.class, args);
		
		
	}
//	@Bean
//	public void aa()
//	{
//		Adresse adr=new Adresse();
//		Personne p=new Personne("fffff","pop","ggg",adr);
//		prepo.save(p);
//		
//	}
//	@Override
//	public void run(String... args) throws Exception {
//		aa();
//		
//	}
//	
	

}
