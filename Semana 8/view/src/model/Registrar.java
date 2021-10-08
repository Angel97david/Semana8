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
public class Registrar {
    private String funcionario = "";  
    private String tipoServicio="";
    private String fecha="";
    public Registrar(){
    }
    public Registrar (String tipoServicio,String funcionario,String fecha){
        this.fecha=fecha;
        this.tipoServicio=tipoServicio;
        this.funcionario=funcionario;
    }
    public void impri(){
        System.out.println("Tipo de Servicio "+tipoServicio+"\nOperario "+funcionario+"\nFecha"+fecha);
        
    }
    
}
