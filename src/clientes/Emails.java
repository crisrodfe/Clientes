package clientes;

/**
 *
 * @author CrisRodFe
 */
class Emails implements Comparable<Emails>{
        public String email;  
        @Override
        public int compareTo(Emails em){
            return email.compareTo(em.email);
        }
    }
