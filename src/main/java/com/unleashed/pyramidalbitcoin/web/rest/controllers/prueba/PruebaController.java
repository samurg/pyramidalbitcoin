package com.unleashed.pyramidalbitcoin.web.rest.controllers.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unleashed.pyramidalbitcoin.repository.prueba.Nota;
import com.unleashed.pyramidalbitcoin.service.prueba.PruebaService;



@RestController
@RequestMapping("")
public class PruebaController {

	@Autowired
	PruebaService service;
	
	@GetMapping("")
    public ResponseEntity<String> prueba() {
		return new ResponseEntity<String>(String.valueOf(service.getCountNota()), HttpStatus.CREATED);
    }
	
	@PutMapping("")
	public ResponseEntity<Nota> add(@RequestBody Nota nota){
		return new ResponseEntity<Nota>(service.saveNota(nota), HttpStatus.CREATED);
	}

}
