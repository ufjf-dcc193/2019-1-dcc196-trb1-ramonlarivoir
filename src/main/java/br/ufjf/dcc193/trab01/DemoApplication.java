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
		AtividadeRepository arep = ctx.getBean(AtividadeRepository.class);
		Sede s1 = new Sede();
		s1
			.setNomeFantasia("Sede 1")
			.setBairro("bairro sede 1")
			.setCidade("cidade sede 1")
			.setEnderecoWeb("www.sede1.com")
			.setFederacao("federacao sede 1")
			.setTelefone("123123123");
		srep.save(s1);
		Sede s2 = new Sede();
		s2
			.setNomeFantasia("Sede 2")
			.setBairro("bairro sede 2")
			.setCidade("cidade sede 2")
			.setEnderecoWeb("www.sede2.com")
			.setFederacao("federacao sede 2")
			.setTelefone("321312331");
		srep.save(s2);
		Sede s3 = new Sede();
		s3
			.setNomeFantasia("Sede 3")
			.setBairro("bairro sede 3")
			.setCidade("cidade sede 3")
			.setEnderecoWeb("www.sede3.com")
			.setFederacao("federacao sede 3")
			.setTelefone("2324543");
		srep.save(s3);
		Membro m1 = new Membro();
		m1
			.setNome("membro 1")
			.setFuncao("função membro 1")
			.setEmail("email membro 1")
			.setDataEntrada("12/12/2012")
			.setDataSaida("12/12/2012")
			.setOngMembro(srep.findAll().get(0));
		mrep.save(m1);
		Membro m2 = new Membro();
		m2
			.setNome("membro 2")
			.setFuncao("função membro 2")
			.setEmail("email membro 2")
			.setDataEntrada("12/12/2012")
			.setDataSaida("12/12/2012")
			.setOngMembro(srep.findAll().get(1));
		mrep.save(m2);
		Membro m3 = new Membro();
		m3
			.setNome("membro 3")
			.setFuncao("função membro 3")
			.setEmail("email membro 3")
			.setDataEntrada("12/12/2012")
			.setDataSaida("12/12/2012")
			.setOngMembro(srep.findAll().get(0));
		mrep.save(m3);
		Atividade a1 = new Atividade();
		a1
			.setTitulo("titulo atividade 1")
			.setDescricao("roin rhoncus consequat porttitor. Pellentesque ullamcorper euismod augue, in aliquam nulla iaculis id. Sed vehicula porta mi vel efficitur. Quisque.")
			.setOngAtividade(srep.findAll().get(0))
			.setDataInicio("12/12/2012")
			.setDataFim("12/12/2012")
			.setHorasAssistencial(5)
			.setHorasExecutiva(10)
			.setHorasFinanceira(15)
			.setHorasJuridica(20);
		arep.save(a1);
		Atividade a2 = new Atividade();
		a2
			.setTitulo("titulo atividade 2")
			.setDescricao("Donec a lorem ultricies, sodales ligula a, accumsan mi. Aliquam nisi urna, ultricies egestas dolor ac, vestibulum feugiat justo. Maecenas.")
			.setOngAtividade(srep.findAll().get(0))
			.setDataInicio("12/12/2012")
			.setDataFim("12/12/2015")
			.setHorasAssistencial(32)
			.setHorasExecutiva(13)
			.setHorasFinanceira(144)
			.setHorasJuridica(43);
		arep.save(a2);
		Atividade a3 = new Atividade();
		a3
			.setTitulo("titulo atividade 3")
			.setDescricao("Integer cursus faucibus tellus. Phasellus ac bibendum turpis, et eleifend ipsum. Etiam vel tellus vestibulum, aliquet odio at, finibus lacus.")
			.setOngAtividade(srep.findAll().get(1))
			.setDataInicio("12/12/2011")
			.setDataFim("12/12/2016")
			.setHorasAssistencial(54)
			.setHorasExecutiva(54)
			.setHorasFinanceira(71)
			.setHorasJuridica(12);
		arep.save(a3);
	}

}
