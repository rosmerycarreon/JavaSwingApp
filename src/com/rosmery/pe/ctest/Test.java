
package com.rosmery.pe.ctest;

import com.rosmery.pe.cmodelo.TipoDocumento;
import com.rosmery.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.util.Date;

public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public void insertar() throws SQLException{
        td.setNombre("Registro Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNI");
        td.setFecha(new Date());
        td.setIdTipoDocumento(6);
        
        tdbo.agregarTipoDocumento(td);
    }
    public static void main (String[] args) throws SQLException {
        Test t = new Test();
        t.insertar();
    }
}
