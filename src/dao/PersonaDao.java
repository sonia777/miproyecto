package dao;
import java.util.*;

import model.Persona;

public interface PersonaDao {
	public String tipoPersona (Persona persona);
	public boolean insertarPersona (Persona persona);
	public boolean modificarPersona (int id_dni);
	public boolean eliminarPerona (Persona persona);
	
}


