package br.com.ffit.Attendant.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Atendente {
	@Id
	private Long id;
	private String usuario;
	private String nome;
	private String senha;
	private String cpf;
	private String email;
}
