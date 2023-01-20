package com.piracui.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.piracui.PiracuiApplication;
import com.piracui.modal.Cozinha;


@SpringBootApplication
public class InclusaoCozinhaMain {
	//aplicação não web, que inicia e finaliza
	public static void main(String[] args) {
		
		// contexto do spring sem ser web utilizando Build, que inicia e para so faz roda a plicação
		ApplicationContext context = new SpringApplicationBuilder(PiracuiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cozinha = context.getBean(CadastroCozinha.class);
		
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		
		Cozinha cozinha3 = new Cozinha();
		cozinha3.setNome("Brasileira");
		
		cozinha2 = cozinha.adiconar(cozinha2);
		cozinha3 = cozinha.adiconar(cozinha3);
		
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
		System.out.printf("%d - %s\n", cozinha3.getId(), cozinha3.getNome());
		
		
	}

}
