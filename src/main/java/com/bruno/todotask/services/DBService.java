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

		todotaskRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7));
	}
}
