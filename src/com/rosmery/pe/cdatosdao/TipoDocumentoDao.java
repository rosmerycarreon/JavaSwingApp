package com.rosmery.pe.cdatosdao;
import com.rosmery.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
    
    //Cuarto listar tipo documento
    public void listarTipoDocumento(Connection conn, JTable table){
        System.out.println("aquiiii");
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;

        String[] columnas = {"ID","NOMBRE","SIGLA","ESTADO","ORDEN","FECHA_REGISTRO","FECHA_ACTUALIZA"};
        model = new DefaultTableModel(null,columnas);

        String sql = "SELECT * FROM TIPO_DOCUMENTO";
        String[] datosTP = new String[7];

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                TipoDocumento td = new TipoDocumento();
               
                td.setIdTipoDocumento(resultSet.getInt("ID_TIPO_DOCUMENTO"));
                td.setNombre(resultSet.getString("NOMBRE"));
                td.setSigla(resultSet.getString("SIGLA"));
                td.setOrden(resultSet.getInt("ORDEN"));
                td.setEstado(resultSet.getString("ESTADO"));
                td.setFechaRegistro(resultSet.getString("FECHA_REGISTRO"));
                td.setFechaActualiza(resultSet.getString("FECHA_ACTUALIZA"));

                datosTP[0] = td.getIdTipoDocumento()+"";
                datosTP[1] = td.getNombre()+"";
                datosTP[2] = td.getSigla()+"";
                datosTP[3] = td.getOrden()+"";
                datosTP[4] = td.getEstado()+"";
                datosTP[5] = td.getFechaRegistro()+"";
                datosTP[6] = td.getFechaActualiza()+"";
                model.addRow(datosTP);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            System.out.println(e.getMessage());
        }
}
}
