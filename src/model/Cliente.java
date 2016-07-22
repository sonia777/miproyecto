package model;

public class Cliente extends Persona {
	private int cod_cliente;
	private int fechaini;
	private boolean estado; 
	
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public int getFechaini() {
		return fechaini;
	}
	public void setFechaini(int fechaini) {
		this.fechaini = fechaini;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
   
}
