package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
	
	private String texto;
	private boolean meGusta;
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public boolean isMeGusta() {
		return meGusta;
	}
	public void setMeGusta(boolean meGusta) {
		this.meGusta = meGusta;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}


}
