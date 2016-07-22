package dao;
import java.util.*;

public interface ClienteDao {
	public ArrayList<ClienteDao> getAll ();
	public ClienteDao getCliente (Integer cod_cliente);
	public boolean insertarCliente (ClienteDao cliente);
	public String modificarCliente (ClienteDao cliente);
	public boolean eliminarCliente (ClienteDao cliente);

}
