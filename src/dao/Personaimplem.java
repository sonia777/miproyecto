package dao;

import java.sql.ResultSet;

import model.Persona;

public class Personaimplem  { 

//	@Override
//	public String tipoPersona(Persona persona) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean insertarPersona(Persona persona) {
//		
//		
//		boolean insertarPersona=  false;
//		try{
//			StringBuilder sql= new StringBuilder();
//			sql.append("INSERT FROM producto WHERE id = ").append(id);
//			this.conn.execute(sql.toString());
//		}catch(Exception e){
//		}
//		return insertarPersona;
//	}
//		
//		
//		
//	@Override
//	public boolean modificarPersona(int id_dni ) {
//
//			//this.conn = FactoryConnectionDb.open(FactoryConnectionDb.PGSQL);
//			Persona pers= new Persona();
//			StringBuilder sql= new StringBuilder();
//			sql.append("SELECT * FROM producto WHERE id * ").append(id_dni);
//			try{
//			ResultSet rs= this.conn.query(sql.toString());
//				while(rs.next()){
//					pers.setId_dni(rs.getInt("id_dni"));
//					pers.setNombre(rs.getString("nombre"));
//					pers.setApellido(rs.getString("apellido"));
//					pers.setEdad(rs.getInt("edad"));
//				}
//			}catch(Exception e){
//			}finally{
//				this.conn.close(); //crear la clase conn que es de conexion//
//			}
//			return false;		
//		}
//		
//
//	@Override
//	public boolean eliminarPerona(Persona persona) {
//		boolean eliminarPersona=  false;
//		try{
//			StringBuilder sql= new StringBuilder();
//			sql.append("DELETE FROM producto WHERE id = ").append(id);
//			this.conn.execute(sql.toString());
//		}catch(Exception e){
//		}
//		return eliminarPersona;
//	}

}
