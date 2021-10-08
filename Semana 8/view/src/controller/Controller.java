/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Datos;
import model.Funcionario;
import model.Registrar;
import view.Consultar;
import view.Registro;
import view.RegistroProduccion;

/**
 *
 * @author DELL
 */
public class Controller  implements ActionListener {
   private Datos dato;
   private Funcionario funcionario;
   private Registrar registrar;
   private Consultar consultar;
   private Registro registro;
   private RegistroProduccion registroProduccion;

    public Controller() { 
    }
    public Controller(Datos dato, Funcionario funcionario, Registrar registrar, Consultar consultar, Registro registro, RegistroProduccion registroProduccion) {
        this.dato = dato;
        this.funcionario = funcionario;
        this.registrar = registrar;
        this.consultar = consultar;
        this.registro = registro;
        this.registroProduccion = registroProduccion;
        this.consultar.jButtCon.addActionListener(this);
        this.registro.jButtRegistrar.addActionListener(this);
        this.registroProduccion.jButtConsultar.addActionListener(this);
        this.registroProduccion.jButtoRegistrar.addActionListener(this);       
    }   
   public void iniciar (){
      consultar.setTitle("");
      consultar.setLocationRelativeTo(null);
       consultar.pack();
   }
    @Override
   public void actionPerformed(ActionEvent e){
       
       if ( consultar.jButtCon == e.getSource()) {            
           Datos da =new Datos();
           da.funcio();
       } 
       if (e.getSource()==registro.jButtRegistrar) {
           Registrar re = new Registrar();
           re.impri();
       }
         
   }    
}
