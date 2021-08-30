package com.bruno.todotask.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bruno.todotask.domain.TodoTask;
import com.bruno.todotask.services.TodoTaskService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/todotask")
public class TodoTaskResource {

	@Autowired
	private TodoTaskService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<TodoTask> findById(@PathVariable Integer id) {
		TodoTask obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/open")
	public ResponseEntity<List<TodoTask>> listOpen() {
		List<TodoTask> list = service.findAllOpen();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/close")
	public ResponseEntity<List<TodoTask>> listClose() {
		List<TodoTask> list = service.findAllClose();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping
	public ResponseEntity<List<TodoTask>> listAll() {
		List<TodoTask> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<TodoTask> create(@RequestBody TodoTask obj) {
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
     
	@PutMapping(value = "/{id}")
	public ResponseEntity<TodoTask> update(@PathVariable Integer id, @RequestBody TodoTask obj) {
		TodoTask newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
}