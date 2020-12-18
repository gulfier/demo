package src.main.java.com.example.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1/dashboard")
public class Prueba {
	
	
	  @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	  public String  getByCode()
	  {
	  return "Hola";
	  }

}
