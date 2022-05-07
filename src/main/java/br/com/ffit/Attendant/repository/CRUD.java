package br.com.ffit.Attendant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ffit.Attendant.model.Atendente;


public interface CRUD extends JpaRepository<Atendente, Long>{

}
