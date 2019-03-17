
package bbdd;

import java.util.Scanner;

/**
 *
 * @author pirul
 */
public class Alumno {
            
    private  String Nombre, aPaterno, aMaterno, FN,Matricula,Carrera,Grupo;
    private static Scanner entrada2 = new Scanner(System.in); 
    private static String dato;
    
    public void imprimeDatos(){ //getter
        
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido Paterno: "+aPaterno);
        System.out.println("Apellido Materno: "+aMaterno);
        System.out.println("F N: "+FN);
        System.out.println("Matricula: "+Matricula);
        System.out.println("Carrera: "+Carrera);
        System.out.println("Grupo: "+Grupo);

    }
    
    public void Alta(){ //setter
        
        System.out.println("Nombre: ");
        Nombre = entrada2.nextLine();
        System.out.println("Apellido Paterno: ");
        aPaterno = entrada2.nextLine();
        System.out.println("Apellido Materno: ");
        aMaterno = entrada2.nextLine();
        System.out.println("F N: ");
        FN = entrada2.nextLine();
        System.out.println("Matricula: ");
        Matricula = entrada2.nextLine();
        System.out.println("Carrera: ");
        Carrera = entrada2.nextLine();
        System.out.println("Grupo: ");
        Grupo = entrada2.nextLine();
    
    }
    
    
    public static void consulta(int atributo){
        switch(atributo){
            case 1:
                System.out.println("Nombre: ");
                dato = entrada2.nextLine();
                break;
            case 2:
                System.out.println("Apellido Paterno: ");
                dato = entrada2.nextLine();
                break;
            case 3:
                System.out.println("Apellido Materno: ");
                dato = entrada2.nextLine();
                break;
            case 4:
                System.out.println("F N: ");
                dato = entrada2.nextLine();
                break;
            case 5:
                System.out.println("Matricula: ");
                dato = entrada2.nextLine();
                break;
            case 6:
                System.out.println("Carrera: ");
                dato = entrada2.nextLine();
                break;
            case 7:
                System.out.println("Grupo: ");
                dato = entrada2.nextLine();
                break;

            default:
            System.out.println("Opcion Incorrecta");
        }
    }
    
    
    public void busqueda(){
        
        int cont = 0;
            if (dato.length()!=0){
                for(int i = 0; i<dato.length();i++){
                    if(Nombre.charAt(i)==dato.charAt(i))
                        cont++;            
                }
                    if(cont == dato.length())
                        imprimeDatos();
            }else
                System.out.println("No se ingreso busqueda");
            
           
    }
}
    
