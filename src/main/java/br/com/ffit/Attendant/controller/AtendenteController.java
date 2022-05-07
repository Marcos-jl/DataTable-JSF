package br.com.ffit.Attendant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ffit.Attendant.model.Atendente;
import br.com.ffit.Attendant.repository.CRUD;


@RestController
@RequestMapping("/atendentes")
public class AtendenteController {
	@Autowired
	private CRUD repository;
	
	@GetMapping
	public List<Atendente> mostrar(){
		return repository.findAll();
	}
	
	@PostMapping
	public void inserir(@RequestBody Atendente atendente) {repository.save(atendente);
	}

	@PutMapping
	public void atualizar(@RequestBody Atendente atendente) {
		repository.save(atendente);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id){
		repository.deleteById(id);
	}

	@GetMapping("/{id}")
	public void filtrar(@PathVariable Long id){
		repository.findById(id);
	}
}
