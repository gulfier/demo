package src.main.java.com.example.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Prueba {
	
	

	  @RequestMapping("/hello")
	  public String  getByCode()
	  {
	  return "Hola";
	  }

}
