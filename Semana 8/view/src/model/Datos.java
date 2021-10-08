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
public class Datos{
    
    public  void funcio(){   
       Funcionario fun1 = new Funcionario("Jose",1,"01/05/2021","Lavado basico",5);
       Funcionario fun2 = new Funcionario("Jesus",2,"02/06/2021", "Lavado especial",8);
       Funcionario fun3 = new Funcionario("Ana", 3,"03/07/2021", "Desinfección básica",9);
       Funcionario fun4 = new Funcionario("Romel", 4,"05/04/2021", "Desinfección avanzada",2);
       Funcionario fun5 = new Funcionario("Ingrid",5,"21/02/2021", "Combos", 4, 1);
       Registrar re = new Registrar();
       re.impri();
       fun1.imprimir1();
       fun2.imprimir1();
       fun3.imprimir1();
       fun4.imprimir1();
       fun5.imprimir2();
    }
  
    
}
