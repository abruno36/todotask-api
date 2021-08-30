package com.bruno.todotask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bruno.todotask.domain.TodoTask;

@Repository
public interface TodoTaskRepository extends JpaRepository<TodoTask, Integer> {

	@Query("SELECT obj FROM TodoTask obj WHERE obj.finalizado = false ORDER BY obj.dataParaFinalizar ASC")
	List<TodoTask> findAllOpen();

	@Query("SELECT obj FROM TodoTask obj WHERE obj.finalizado = true ORDER BY obj.dataParaFinalizar ASC")
	List<TodoTask> findAllClose();
}
