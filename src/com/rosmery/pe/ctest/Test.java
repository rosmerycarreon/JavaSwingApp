
package com.rosmery.pe.ctest;

import com.rosmery.pe.cmodelo.TipoDocumento;
import com.rosmery.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    //insertar tipo documento
    public void insertar() throws SQLException, ParseException{
        td.setNombre("Registro Unico de Contribuyente");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("RUC");
        td.setFechaRegistro("08-10-2024");
        td.setFechaActualiza("08-10-2023");
        
        tdbo.agregarTipoDocumento(td);
    }

    //eliminar
     public void eliminar() throws SQLException, ParseException{
        td.setIdTipoDocumento(11);
        tdbo.eliminarTipoDocumento(td);
    }
    //modificar tipo de documento
     public void modificar() throws SQLException, ParseException{
        td.setNombre("Registro Unico de XD");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("RUC");
        td.setFechaRegistro("08-10-2024");
        td.setFechaActualiza("08-10-2023");
        
        td.setIdTipoDocumento(12);
        tdbo.modificarTipoDocumento(td);
     }
    public static void main(String[] args) throws SQLException, ParseException{
        Test t = new Test();
       // t.insertar();
        //t.eliminar();
        t.modificar();
    }
}
