package com.jflores.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jflores.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private List<Usuario> lista;
	
	
	public UsuarioServiceImpl() {
	this.lista = new ArrayList<>();
	this.lista.add(new Usuario(1,"andres","Guzman"));
	this.lista.add(new Usuario(2,"Pepa","Garcia"));
	this.lista.add(new Usuario(3,"Paco","Leon"));
	this.lista.add(new Usuario(4,"Paz","Bermejo"));
	this.lista.add(new Usuario(5,"Aida","Garcia"));
	this.lista.add(new Usuario(6,"Mauricio","Colmenero"));
	this.lista.add(new Usuario(7,"Juan","Gomez"));
	}

	@Override
	public List<Usuario> listar() {
	
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
	Usuario resultado = null;
	for(Usuario usuario: this.lista) {
		if(usuario.getId().equals(id)) {
			resultado = usuario;
			break;
		}
	}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
