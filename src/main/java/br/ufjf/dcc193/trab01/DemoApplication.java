package br.ufjf.dcc193.trab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		SedeRepository srep = ctx.getBean(SedeRepository.class);
		MembroRepository mrep = ctx.getBean(MembroRepository.class);
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
		// Membro m1 = new Membro();
		// m1
		// 	.setNome("membro 1")
		// 	.setFuncao("função membro 1")
		// 	.setEmail("email membro 1")
		// 	.setDataEntrada("12/12/2012")
		// 	.setDataSaida("12/12/2012")
		// 	.setOngMembro(srep.findAll().get(1));
		// mrep.save(m1);
		System.out.println(srep.findAll());
		System.out.println(mrep.findAll());
	}

}
