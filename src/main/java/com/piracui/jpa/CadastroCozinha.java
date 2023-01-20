package com.piracui.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piracui.modal.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;

	List<Cozinha> lista() {
		return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
	}
	
	
	@Transactional
	public Cozinha adiconar (Cozinha cozinha) {
		return manager.merge(cozinha);
	}

}
