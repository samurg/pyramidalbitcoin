package com.unleashed.pyramidalbitcoin.service.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unleashed.pyramidalbitcoin.repository.prueba.Nota;
import com.unleashed.pyramidalbitcoin.repository.prueba.PruebaRepository;

@Service
public class PruebaService {
	@Autowired
	public PruebaRepository repo;
	
	public Long getCountNota() {
		return repo.count();
	}
	
	public Nota saveNota(Nota nota) {
		return repo.saveAndFlush(nota);
	}
}
