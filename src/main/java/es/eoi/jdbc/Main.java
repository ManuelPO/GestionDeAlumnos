package es.eoi.jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String dato;

        do {
            System.out.println("GESTION INSTITUTO V1");
            System.out.println("--------------------");
            System.out.println("1-Listado Alumnos");
            System.out.println("2-Busca Alumno (DNI)");
            System.out.println("3-Crear Alumno");
            System.out.println("4-Modificar Alumno");
            System.out.println("5-Eliminar Alumno");
            System.out.println("0-SALIR");
            System.out.println("--------------------");
            System.out.println();
            System.out.print("Selecciona gestion: ");
            dato = entrada.readLine();


        }while(!dato.equals("0"));
    }

}
