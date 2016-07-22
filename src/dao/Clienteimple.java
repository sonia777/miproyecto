package dao;

import java.util.ArrayList;

public class Clienteimple implements ClienteDao {

	@Override
	public ArrayList<ClienteDao> getAll(){
		ArrayList<ClienteDao> cliente = new ArrayList<ClienteDao>();
		
		return cliente;
		
	}

	@Override
	public boolean insertarCliente(ClienteDao cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String modificarCliente(ClienteDao cliente) {
		

		
		
		
		
		return null;
	}

	@Override
	public boolean eliminarCliente(ClienteDao cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClienteDao getCliente(Integer cod_cliente) {
		// TODO Auto-generated method stub
		return null;
	}
   
}
