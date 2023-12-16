package com.agencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.models.Usuario;
import com.agencia.repositories.UsuarioRepository;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository cr;

	@GetMapping("/allclients")
	public List<Usuario> getAllUsuarios() {

		return cr.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
		Usuario usuario = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not Found"));

		return ResponseEntity.ok(usuario);

	}

	@PostMapping("/saveclient")
	public Usuario saveUsuario(@RequestBody Usuario client) {

		return cr.save(client);

	}

	@PutMapping("/{id}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioUpdated) {
		Usuario usuario = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not Found"));

		usuario.setName(usuarioUpdated.getName());
		//usuario.setBirthDate(usuarioUpdated.getBirthDate());

		return ResponseEntity.ok(usuario);

	}

	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable Long id) {
		Usuario usuario = cr.findById(id).orElseThrow(() -> new RuntimeException(id + "Not Found"));
		cr.delete(usuario);

	}

}


