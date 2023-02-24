
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre_del_alumno = "Emmanuel Martínez Valdez",
           numero_de_cuenta = "1911774",
           semestre = "segundo";
    String horario = "Lunes y Miercoles "
            +"7:00-9:00 Sistemas"
            + "9:00-10:30 Circuitos"
            + "11:00-12:30 Algoritmos"
            + "  "
            + "Martes y Jueves"
            + "7:00-9:00 Calculo "
            + "10:00-12:30 Programación";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre_del_alumno );
        System.out.println("Su número de cuenta es: " + numero_de_cuenta);
        System.out.println("El semestre que esta cursando es: " + semestre);
        System.out.println("Su horario es: " + horario);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
