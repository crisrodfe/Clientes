/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author CrisRodFe
 */

 class Telefonos implements Comparable<Telefonos>  {
        public Long telef;
        public String suma;
        
       
        @Override
        public int compareTo(Telefonos tlf){
            return tlf.telef.compareTo(telef);//Ordenará los datos añadidos al ArrayList teléfonos de mayor a menor.
        }
}