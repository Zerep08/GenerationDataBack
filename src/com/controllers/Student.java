package com.controllers;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {
	
	@Column(name="programa")
	private String programa;
	
	
	@NotNull(message="Es requerido")
	@Min(value=0, message="Debe ser minimo 0 o mayor")
	@Column(name="cohort")
	private Integer cohort;
	
	@NotNull(message="Es requerido")
	@Min(value=0, message="Debe ser minimo 0 o mayor")
	@Id
	@Column(name="genID")
	private Integer genID;
	
	@NotNull(message="Es requerido")
	@Size(min=1, message="Agregar minimo 1 caracter")
	@Column(name="nombre")
	private String nombre;
	
	@NotNull(message="Es requerido")
	@Size(min=1, message="Agregar minimo 1 caracter")
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="calle_numero")
	private String calleNumero;
	
	@Column(name="colonia")
	private String colonia;
	
	@Column(name="municipio")
	private String municipio;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="telefono")
	private String telefono;
	
	@NotNull(message="Es requerido")
	@Size(min=1, message="Agregar minimo 1 numero")
	@Column(name="celular")
	private String celular;
	
	@Column(name="whats")
	private String whats;
	
	@NotNull(message="Es requerido")
	@Size(min=1, message="Agregar minimo 1 numero")
	@Email(message="Ingresa un email valido")
	@Column(name="mail1")
	private String mail1;
	
	@Email(message="Ingresa un email valido")
	@Column(name="mail2")
	private String mail2;
	
	@Email(message="Ingresa un email valido")
	@Column(name="mail3")
	private String mail3;
	
	@Email(message="Ingresa un email valido")
	@Column(name="mail4")
	private String mail4;
	
	@Column(name="facebook")
	private String face;
	
	@Column(name="instagram")
	private String ins;
	
	@Column(name="linkedin")
	private String linkedin;
	
	@Column(name="twitter")
	private String twit;
	
	@Column(name="pasatiempo")
	private String pasatime;
	
	@Column(name="Q_ve_redes_sociales")
	private String rdsSociales;

	public Student(){
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}



	public Integer getCohort() {
		return cohort;
	}

	public void setCohort(Integer cohort) {
		this.cohort = cohort;
	}

	public Integer getGenID() {
		return genID;
	}

	public void setGenID(Integer genID) {
		this.genID = genID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCalleNumero() {
		return calleNumero;
	}

	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getWhats() {
		return whats;
	}

	public void setWhats(String whats) {
		this.whats = whats;
	}

	public String getMail1() {
		return mail1;
	}

	public void setMail1(String mail1) {
		this.mail1 = mail1;
	}

	public String getMail2() {
		return mail2;
	}

	public void setMail2(String mail2) {
		this.mail2 = mail2;
	}

	public String getMail3() {
		return mail3;
	}

	public void setMail3(String mail3) {
		this.mail3 = mail3;
	}

	public String getMail4() {
		return mail4;
	}

	public void setMail4(String mail4) {
		this.mail4 = mail4;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getTwit() {
		return twit;
	}

	public void setTwit(String twit) {
		this.twit = twit;
	}

	public String getPasatime() {
		return pasatime;
	}

	public void setPasatime(String pasatime) {
		this.pasatime = pasatime;
	}

	public String getRdsSociales() {
		return rdsSociales;
	}

	public void setRdsSociales(String rdsSociales) {
		this.rdsSociales = rdsSociales;
	}

	@Override
	public String toString() {
		return "Student [programa=" + programa + ", cohort=" + cohort
				+ ", genID=" + genID + ", nombre=" + nombre + ", apellido="
				+ apellido + ", calleNumero=" + calleNumero + ", colonia="
				+ colonia + ", municipio=" + municipio + ", estado=" + estado
				+ ", telefono=" + telefono + ", celular=" + celular
				+ ", whats=" + whats + ", mail1=" + mail1 + ", mail2=" + mail2
				+ ", mail3=" + mail3 + ", mail4=" + mail4 + ", face=" + face
				+ ", ins=" + ins + ", linkedin=" + linkedin + ", twit=" + twit
				+ ", pasatime=" + pasatime + ", rdsSociales=" + rdsSociales
				+ "]";
	}


	
	

}
