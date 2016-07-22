package dao;
import java.util.*;

public interface AdminDao {
	public String mostrarDatos (AdminDao admin);
	public boolean insertar (AdminDao admin);
	public String modificarAdmin (AdminDao admin);
	public boolean eliminarAdmin (AdminDao admin);
	
}
