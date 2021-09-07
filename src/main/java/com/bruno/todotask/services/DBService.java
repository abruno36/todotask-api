package com.bruno.todotask.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.todotask.domain.TodoTask;
import com.bruno.todotask.repositories.TodoTaskRepository;

@Service
public class DBService {

	@Autowired
	private TodoTaskRepository todotaskRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		TodoTask t1 = new TodoTask(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("27/08/2022"), false);
		TodoTask t2 = new TodoTask(null, "Exame", "Exame laboratório Vila Mariana", sdf.parse("27/08/2022"), true);
		TodoTask t3 = new TodoTask(null, "Reunião", "Reunião novo projeto", sdf.parse("30/08/2022"), false);
		TodoTask t4 = new TodoTask(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("30/08/2022"), true);
		TodoTask t5 = new TodoTask(null, "Academia", "Caminhar durante 30 minutos pela manhã", sdf.parse("01/09/2022"), true);
		TodoTask t6 = new TodoTask(null, "Reunião", "Daily diária pela manhã", sdf.parse("30/08/2022"), true);
		TodoTask t7 = new TodoTask(null, "Reunião", "Reunião Open Bank", sdf.parse("06/09/2021"), false);
		TodoTask t8 = new TodoTask(null, "Consulta Dr Victor", "Consulta encaixe - reavaição dos exames", sdf.parse("11/09/2021"), false);
		TodoTask t9 = new TodoTask(null, "Padaria", "Comprar pão doce e pão normal", sdf.parse("06/09/2022"), false);
		TodoTask t10 = new TodoTask(null, "Acompanhamento das entradas", "Analise das atividades", sdf.parse("08/07/2021"), false);
		TodoTask t11 = new TodoTask(null, "Sala de Vídeo", "Avaliar sala para apresentação do Open Bank", sdf.parse("09/09/2021"), false);
		TodoTask t12 = new TodoTask(null, "reunião Flavio e Marcio", "Avaliar pontos de estudo", sdf.parse("09/09/2021"), false);

		todotaskRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12));
	}
}
