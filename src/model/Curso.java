package model;

public class Curso {
	
	private int id_curso;
	private String nombre;
	private int duracion;
	private int id_profe;
	
   public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getId_profe() {
		return id_profe;
	}
	public void setId_profe(int id_profe) {
		this.id_profe = id_profe;
	}

	
	public static void main(String[] args)
		{
		 PlanEntrenam miPlan = new PlanEntrenam ();
		 miPlan.setId_plan("id_plan");
		 miPlan.setNombre("nombre");
		 miPlan.setNivel("nivel");		
}
}
