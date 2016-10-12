package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

//Atributos
	private Usuario creador;
	private List<Usuario> participantes = new ArrayList<Usuario>();
	private Muro muroGrupo;
	private String nombre;
	
//getters and setters
	public Usuario getCreador() {
		return creador;
	}
	public void setCreador(Usuario creador) {
		this.creador = creador;
	}
	public List<Usuario> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<Usuario> participantes) {
		this.participantes = participantes;
	}
	public Muro getMuroGrupo() {
		return muroGrupo;
	}
	public void setMuroGrupo(Muro muroGrupo) {
		this.muroGrupo = muroGrupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
}
