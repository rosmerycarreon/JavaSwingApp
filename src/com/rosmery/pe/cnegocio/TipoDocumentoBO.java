
package com.rosmery.pe.cnegocio;

import java.sql.Connection;
import com.rosmery.pe.cdatosdao.TipoDocumentoDao;
import com.rosmery.pe.cmodelo.TipoDocumento;
import com.rosmery.pe.db.conexion;
import java.sql.SQLException;
import javax.swing.JTable;

public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        
        try { 
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    //eliminar tipo_documento
       public String eliminarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        
        try { 
            mensaje = tdd.eliminarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    //modificar tipo documento
       public String modificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        c.commit();
        try { 
            tdd.modificarTipoDocumento(c, tipoDocumento);
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
       public void listarTipoDocumento(JTable table){
        Connection c = conexion.getConnection();
        tdd.listarTipoDocumento(c, table);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
