package com.piracui.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.piracui.PiracuiApplication;
import com.piracui.modal.Restaurante;


@SpringBootApplication
public class ConsultaRestauranteMain {
	//aplicação não web, que inicia e finaliza
	public static void main(String[] args) {
		
		// contexto do spring sem ser web utilizando Build, que inicia e para so faz roda a plicação
		ApplicationContext context = new SpringApplicationBuilder(PiracuiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroRestaurante restaurante = context.getBean(CadastroRestaurante.class);
		
		List<Restaurante> restaurantes = restaurante.lista();
		
		for (Restaurante restaurante2 : restaurantes) {

		System.out.printf("%s - %f - %s\n", restaurante2.getNome(), restaurante2.getCozinha().getNome());
		}
	}

}
