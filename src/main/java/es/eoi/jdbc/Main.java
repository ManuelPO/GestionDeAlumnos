package es.eoi.jdbc;

import es.eoi.jdbc.service.StudentService;

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
            System.out.print("Seleciona gestion: ");
            dato = entrada.readLine();

            gestiones(dato);

        }while(!dato.equals("0"));
    }

    public static void gestiones(String dato){
        switch (dato){
            case "1":
                StudentService.findAll();
                break;
            case "2":
                StudentService.findById();
                break;
            case "3":
                StudentService.create();
                break;
            case "4":
                StudentService.update();
                break;
            case "5":
                StudentService.delete();
                break;
            default:
                System.out.println();
        }
    }
}
