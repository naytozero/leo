
package humanos;

public class HUMANOS {

    
    public static void main(String[] args) {
       Persona per = new Persona ();
       per.Nombre ="jorge";
       per.Apellido="san mateo";
       per.años= 15;
       per.Correo ="mateo@gmail.com";
       per.numero = 943593543;
       
       System.out.println("EL NOMBRE DE LA PERSONA ES "+per.Nombre);
       System.out.println("el apellido de la persona"+per.Apellido);
       System.out.println("los años de la persona es "+per.años);
       System.out.println("EL CORREO ES "+per.Correo);
       System.out.println("SU NUMERO DE CELULAR ES "+per.numero);
       
    }
    
}
