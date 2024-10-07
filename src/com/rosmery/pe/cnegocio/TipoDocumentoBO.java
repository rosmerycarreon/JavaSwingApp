
package com.rosmery.pe.cnegocio;

import java.sql.Connection;
import com.rosmery.pe.cdatosdao.TipoDocumentoDao;
import com.rosmery.pe.cmodelo.TipoDocumento;
import com.rosmery.pe.db.conexion;
import java.sql.SQLException;

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
}
