package Usuarios;

import java.util.Scanner;

import Actividades.ActividadSumativa;
import Cursos.Curso;
import Foros.Foro;

public class Profesor extends PersonalAcademico{


    //Metodos
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //code logic
        // Al subir el archivo , se debe verificar que el archivo sea un tipo valido de caso contrario el metodo dara una excepcion al usuario

        try (Scanner sc = new Scanner(System.in)) {
            boolean  continuar = true;
            while (continuar) {

            System.out.println("Ingrese el titulo de la actividad sumativa: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese la descripcion e instrucciones  de la actividad sumativa: ");
            String descripcion = sc.nextLine();
            System.out.println("Los siguientes datos son correctos? Titulo: ' "+titulo+" '" +"\n" + "Descripcion: ' "+descripcion+"'"+"\n"+"Escriba Y si es correcto o N si no es correcto");
            String respuesta = sc.nextLine();

            while (respuesta != "Y" ||  respuesta != "N") {
                System.out.println("Escriba Y  si es correcto o N si no es correcto");
                respuesta = sc.nextLine();
                
            }
            if (respuesta =="Y") {
                continuar=false;
                //code logic se crea un objeto de tipo actividadsumativa y posterior a eso se guardan sus datos como texto o como archivo binario y se guarda el codigo en un archivo de texto como identificador de la actividad

            }
            if (respuesta=="N") {
                continue;
            }
        }   
        } catch (Exception e) {
            // TODO: handle exception
        }
        //Si falla al crear el archivo de actividad se informa al ususario del error.
    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        //code logic
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //code logic
    }
    public void crearNuevoForo(Foro foro){
        //code logic
    }

}
