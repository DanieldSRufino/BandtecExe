package br.com.larissa.AgendaDeObjetivos.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

	private List<Usuario> usuarios;
	
	public UsuariosController() {
		this.usuarios = obterTodosUsuarios();
	}
	
	@GetMapping("/usuarios/nome/{nomeUsuario}")
	public ResponseEntity<List <Usuario>> obterPorNome(@PathVariable("nomeUsuario") String nome){
		List<Usuario> usuariosPorNome = new ArrayList<Usuario>();
		for(Usuario u : usuarios) {
			if(u.getNome().equals(nome)) {
				usuariosPorNome.add(u);
			}
		}
		if(usuariosPorNome.isEmpty()) {
		return ResponseEntity.noContent().build();
	} 
		return 	ResponseEntity.ok(usuariosPorNome);
	
	}
	
	
	@GetMapping("/usuarios/idade/{idadeUsuario}")
	public ResponseEntity<List <Usuario>> obterPorIdade(@PathVariable("idadeUsuario") String idade){
		List<Usuario> usuariosPorIdade = new ArrayList<Usuario>();
		for(Usuario u : usuarios) {
			if(u.getIdade().equals(idade)) {
				usuariosPorIdade.add(u);
			}
		}
		if(usuariosPorIdade.isEmpty()) {
		return ResponseEntity.noContent().build();
	} 
		return 	ResponseEntity.ok(usuariosPorIdade);
	
	}
	
	
	private List<Usuario> obterTodosUsuarios(){
		return Arrays.asList(
				new Usuario ("Larissa", 19), 
				new Usuario ("Daniel", 20), 
				new Usuario ("Will", 24), 
				new Usuario("Michelle", 21));
				
	}
}
