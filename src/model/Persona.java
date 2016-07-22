package model;

  public abstract class  Persona {

	public Persona() {
		super();
	}
	public int getId_dni() {
		return id_dni;
	}
	public void setId_dni(int id_dni) {
		this.id_dni = id_dni;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	private int id_dni; 
	private String nombre ;
	private String apellido; 
	private int edad; 
	private String domicilio; 

	}

	

