/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Funcionario {
    
    private String nombre = "";
    private int codigo = 0;
    private String tipoServicio = "";
    private int numeroServicios = 0;
    private int combo = 0;
    private String fecha = " ";

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }
    public int getNumeroServicios() {
        return numeroServicios;
    }

    public void setNumeroServicios(int numeroServicios) {
        this.numeroServicios = numeroServicios;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Funcionario() {
    }
    
    public Funcionario(String nombre,int codigo,String fecha ,String tipoServicio,int numeroServicios){
       this.nombre=nombre;
       this.codigo=codigo;
       this.fecha=fecha;
       this.tipoServicio=tipoServicio;
       this.numeroServicios=numeroServicios;
    }

    public Funcionario(String nombre, int codigo,String fecha, String tipoServicio, int numeroServicios, int combo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha=fecha;
        this.tipoServicio = tipoServicio;
        this.numeroServicios = numeroServicios;
        this.combo = combo;
    }
    public  void imprimir1(){
    System.out.println("Nombre del empleado " + nombre + "\nCodigo del empleado " + "\nFecha " + fecha + codigo+
              "\nTipo de servicio : " + tipoServicio + "\nnumero de servicios " + numeroServicios + "\n" );
    
    }
    
    public  void  imprimir2(){
      
      System.out.println("Nombre del empleado " + nombre +"\nFecha " + fecha + "\nCodigo del empleado " + codigo+
              "\nTipo de servicio : " + tipoServicio + "\nnumero de servicios " + numeroServicios
               + "\nCombo numero " + combo + "\n" );
   }
   
}
