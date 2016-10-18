package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;


public class Usuario  implements Comparable<Usuario>{
	
//Atributos
	private long ID = 0;
	private String pw;
	private String nombre;
	private int edad;
	private String email;
	private Muro muroUsuario;
	private List<Usuario> amigos = new ArrayList<Usuario>();
//constructor	
	public Usuario(String nombre,int edad,String pw,String email){
		this.nombre = nombre;
		this.edad = edad;
		this.pw = pw;
		this.email = email;
		ID++;
	}
//geters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Muro getMuroUsuario() {
		return muroUsuario;
	}
	public void setMuroUsuario(Muro muroUsuario) {
		this.muroUsuario = muroUsuario;
	}
	public List<Usuario> getAmigos() {
		return amigos;
	}
	public void setAmigos(Usuario amigo) {
		amigos.add(amigo);
	}

	@Override
	public int compareTo(Usuario o){
		return this.email.compareTo(o.getEmail());
	}
	
}
