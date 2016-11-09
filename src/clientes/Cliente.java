package clientes;

import java.util.ArrayList;

/**
 * 
 * @author CrisRodFe
 */

//Clase Cliente donde se introducirán los diferentes parámetros que introduzcamos por teclado.
public class Cliente {    
        String id;
        String nombre;
        String apellido; 
        ArrayList<Telefonos> telefono;
        ArrayList<Emails> email;
                
    Cliente(String id,String nombre,String apellido,ArrayList<Telefonos> telefono, ArrayList<Emails> email){
      this.id=id;
      this.nombre=nombre;
      this.apellido=apellido;
      this.telefono=telefono;
      this.email=email;
    }

    Cliente() {
    }
    
    //Getters y Setters
        /**
         * 
         * @return id 
         */            
        public String getId(){
            return id;
        }
        
        /**
         * 
         * @return nombre
         */
        public String getNombre(){
            return nombre;
        }
        
        /**
         * 
         * @return apellido
         */
        public String getApellido(){
            return apellido;
        }
        
        /**
         * 
         * @return telefono
         */
        public ArrayList<Telefonos> getTelefono(){
            return telefono;
        }
        
        /**
         * 
         * @return email
         */
        public ArrayList<Emails> getEmail(){
            return email;
        }
        
        /**
         * 
         * @param id 
         */
        public void setId(String id){
            this.id=id;
        }
        
        /**
         * 
         * @param nombre 
         */
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        
        /**
         * 
         * @param apellido 
         */
        public void setApellido(String apellido){
            this.apellido=apellido;
        }
        
        /**
         * 
         * @param telefono 
         */
        public void setTelefono(ArrayList<Telefonos> telefono){
            this.telefono=telefono;
        }
        
        /**
         * 
         * @param email 
         */
        public void setEmail(ArrayList<Emails> email){
            this.email=email;
        }
}

