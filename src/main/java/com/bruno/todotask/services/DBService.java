package com.bruno.todotask.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.todotask.domain.TodoTask;
import com.bruno.todotask.repositories.TodoTaskRepository;

@Service
public class DBService {

	@Autowired
	private TodoTaskRepository todotaskRepository;

	public void instanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		TodoTask t1 = new TodoTask(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("27/08/2022 10:40", formatter), false);
		TodoTask t2 = new TodoTask(null, "Exame", "Exame laboratório Vila Mariana",
				LocalDateTime.parse("27/08/2022 09:40", formatter), true);
		TodoTask t3 = new TodoTask(null, "Reunião", "Reunião novo projeto",
				LocalDateTime.parse("30/08/2022 09:00", formatter), false);
		TodoTask t4 = new TodoTask(null, "Meditar", "Meditar durante 30 minutos pela manhã",
				LocalDateTime.parse("30/08/2022 07:00", formatter), true);
		TodoTask t5 = new TodoTask(null, "Academia", "Caminhar durante 30 minutos pela manhã",
				LocalDateTime.parse("01/09/2022 13:00", formatter), true);
		TodoTask t6 = new TodoTask(null, "Reunião", "Daily diária pela manhã",
				LocalDateTime.parse("30/08/2022 07:00", formatter), true);

		todotaskRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}
}
