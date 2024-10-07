package com.rosmery.pe.cdatosdao;
import com.rosmery.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
        

public class TipoDocumentoDao {
    
    private String Mensaje;
    //primer metodo - INSERTAR TIPO DOCUMENTO A LA BD
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
       PreparedStatement ps = null;
       String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE, SIGLA, ESTADO, ORDEN, ID_TIPO_DOCUMENTO) "
       + "VALUES(?,?,?,?,?) ";
       
    try {
        ps = conn.prepareStatement(sql);
        ps.setString(1,tipoDocumento.getNombre() );
        ps.setString(2,tipoDocumento.getSigla());
        ps.setString(3,tipoDocumento.getEstado());
        ps.setInt(4,tipoDocumento.getOrden());
        ps.setInt(5,tipoDocumento.getIdTipoDocumento());
       
        ps.execute();
        ps.close();
        Mensaje = "El tipoDocumento fue creado correctamente ";
    } catch(Exception e) {
    Mensaje = "Alto! error al crear tipo documento." +e.getMessage();
            System.out.println(e.getMessage());
    }
    
    return Mensaje;
    }
}
