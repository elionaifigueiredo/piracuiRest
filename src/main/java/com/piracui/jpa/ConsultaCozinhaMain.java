package com.piracui.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.piracui.PiracuiApplication;
import com.piracui.modal.Cozinha;


@SpringBootApplication
public class ConsultaCozinhaMain {
	//aplicação não web, que inicia e finaliza
	public static void main(String[] args) {
		
		// contexto do spring sem ser web utilizando Build, que inicia e para so faz roda a plicação
		ApplicationContext context = new SpringApplicationBuilder(PiracuiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cozinha = context.getBean(CadastroCozinha.class);
		
		List<Cozinha>cozinhas = cozinha.lista();
		
		for (Cozinha cozinha2 : cozinhas) {
			System.out.println("Cozinha: " + cozinha2.getNome());
		}
	}

}
