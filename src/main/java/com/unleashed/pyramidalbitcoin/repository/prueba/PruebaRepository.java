package com.unleashed.pyramidalbitcoin.repository.prueba;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PruebaRepository extends JpaRepository<Nota, Long>{

	
	
}
