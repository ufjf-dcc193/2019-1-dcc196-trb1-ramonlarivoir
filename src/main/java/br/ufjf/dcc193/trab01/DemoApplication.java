package br.ufjf.dcc193.trab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		SedeRepository srep = ctx.getBean(SedeRepository.class);
		// Sede s1 = new Sede();
		// s1
		// 	.setNomeFantasia("Sede 1")
		// 	.setBairro("bairro sede 1")
		// 	.setCidade("cidade sede 1")
		// 	.setEnderecoWeb("www.sede1.com")
		// 	.setFederacao("federacao sede 1")
		// 	.setTelefone("123123123");
		// Sede s2 = new Sede();
		// s2
		// 	.setNomeFantasia("Sede 2")
		// 	.setBairro("bairro sede 2")
		// 	.setCidade("cidade sede 2")
		// 	.setEnderecoWeb("www.sede2.com")
		// 	.setFederacao("federacao sede 2")
		// 	.setTelefone("321312331");
		// srep.save(s1);
		// srep.save(s2);
		System.out.println(srep.findAll());
	}

}
