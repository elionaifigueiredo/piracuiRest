package com.piracui.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piracui.modal.Restaurante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CadastroRestaurante {

	@PersistenceContext
	private EntityManager manager;

	List<Restaurante> lista() {
		return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
	}

}
