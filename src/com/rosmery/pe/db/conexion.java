
package com.rosmery.pe.db;
import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    private static Connection con = null;
    private static String usuario = "tienda_virtual";
    private static String clave = "1234560";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try{
            //cargar el controlador JDBC
            Class.forName("oracle.jdbc.OracleDriver");
            
            //establecer la coneccion con la base de datos
            con = DriverManager.getConnection(url,usuario,clave);
            con.setAutoCommit(false);
            System.out.println("rosmery......");
            
            if(con != null){
                 System.out.println("Conexion Exitosa");
        }else{
                System.out.println("Conexion Fallida");
            }
            
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    };
    public void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error: al cerrar la conexion "+e.getMessage());
        }
    }
    public static void main(String[] arg){
        conexion con = new conexion();
        conexion.getConnection();
    }
}
