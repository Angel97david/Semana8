/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaderoEstrella;

import controller.Controller;
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
public class Main {
    public static void main(String[] args) {
         new RegistroProduccion().setVisible(true);
         
         Consultar con = new Consultar();
         Registro regi = new Registro();
         RegistroProduccion regiPro =new RegistroProduccion();
         Datos dat =new Datos();
         Funcionario func=new Funcionario();
         Registrar regist = new Registrar();
  
         Controller cont = new Controller(dat, func, regist, con,regi , regiPro);
         cont.iniciar(); 
    }

    
}
