package com.rosmery.pe.cdatosdao;
import com.rosmery.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
        

public class TipoDocumentoDao {
    
    private String Mensaje;
    //primer metodo - INSERTAR TIPO DOCUMENTO A LA BD
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
       PreparedStatement ps = null;
       String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE, SIGLA, ESTADO, ORDEN, FECHA_REGISTRO,FECHA_ACTUALIZA) "
       + "VALUES(?,?,?,?,?,?) ";
       
    try {
        ps = conn.prepareStatement(sql);
        ps.setString(1,tipoDocumento.getNombre() );
        ps.setString(2,tipoDocumento.getSigla());
        ps.setString(3,tipoDocumento.getEstado());
        ps.setInt(4,tipoDocumento.getOrden());
        ps.setString(5,tipoDocumento.getFechaRegistro());
        ps.setString(6,tipoDocumento.getFechaActualiza());
       
        ps.execute();
        ps.close();
        Mensaje = "El tipoDocumento fue creado correctamente ";
    } catch(Exception e) {
    Mensaje = "Alto! error al crear tipo documento." +e.getMessage();
            System.out.println(e.getMessage());
    }
    
    return Mensaje;
    }
    
//Segundo metodo eliminar 
    
    public String eliminarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
       PreparedStatement ps = null;
       String sql = "DELETE FROM TIPO_DOCUMENTO WHERE ID_TIPO_DOCUMENTO = ?";
       
    try {
        ps = conn.prepareStatement(sql);
        ps.setInt(1,tipoDocumento.getIdTipoDocumento());
        ps.execute();
        ps.close();
        Mensaje = "El tipoDocumento fue eliminado correctamente ";
    } catch(Exception e) {
    Mensaje = "Alto! error al eliminar tipo documento." +e.getMessage();
            System.out.println(e.getMessage());
    }
    
    return Mensaje;
    }
 //Tercer metodo modificar 
    
    public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
       PreparedStatement ps = null;
       String sql = "UPDATE TIPO_DOCUMENTO SET NOMBRE = ?, SIGLA = ?, ESTADO = ?, ORDEN = ?, FECHA_REGISTRO = ?,FECHA_ACTUALIZA = ? "
       + "WHERE ID_TIPO_DOCUMENTO = ?";
       
    try {
        ps = conn.prepareStatement(sql);
        ps.setString(1,tipoDocumento.getNombre() );
        ps.setString(2,tipoDocumento.getSigla());
        ps.setString(3,tipoDocumento.getEstado());
        ps.setInt(4,tipoDocumento.getOrden());
        ps.setString(5,tipoDocumento.getFechaRegistro());
        ps.setString(6,tipoDocumento.getFechaActualiza());
       
         ps.setInt(7,tipoDocumento.getIdTipoDocumento());
        ps.execute();
        ps.close();
        Mensaje = "El tipoDocumento fue modificado correctamente ";
    } catch(Exception e) {
    Mensaje = "Alto! error al modificar tipo documento." +e.getMessage();
            System.out.println(e.getMessage());
    }
    
    return Mensaje;
    }
}
