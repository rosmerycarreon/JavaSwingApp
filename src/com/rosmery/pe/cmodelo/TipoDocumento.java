
package com.rosmery.pe.cmodelo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
     
public class TipoDocumento {
    private int idTipoDocumento;
    private String nombre;
    private String sigla;
    private String estado;
    private int orden;
    private Date fechaRegistro;
    private Date fechaActualiza;

//    public TipoDocumento(int idTipoDocumento, String nombre, String sigla, String estado, int orden, Date fecha) {
//        this.idTipoDocumento = idTipoDocumento;
//        this.nombre = nombre;
//        this.sigla = sigla;
//        this.estado = estado;
//        this.orden = orden;
//        this.fecha = fecha;
//    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getFechaRegistro() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(fechaRegistro);
    }

    public void setFechaRegistro(String fechaRegistro) throws ParseException  {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        this.fechaRegistro = formato.parse(fechaRegistro);
    }
    public String getFechaActualiza() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(fechaActualiza);
    }
    public void setFechaActualiza(String fechaActualiza) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.fechaActualiza = dateFormat.parse(fechaActualiza);
    }
}
