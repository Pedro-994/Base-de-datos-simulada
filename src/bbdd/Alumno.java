
package bbdd;

import java.util.Scanner;

/**
 *
 * @author pirul
 */
public class Alumno {
            
    private  String Nombre, aPaterno, aMaterno, FN,Matricula,Carrera,Grupo,comparar;
    private static Scanner entrada2 = new Scanner(System.in); 
    private static String dato;
    
    public void imprimeDatos(){ //getter
        
        System.out.print(" "+Nombre+ "\t\t"+aPaterno+"\t\t"+aMaterno+"\t\t"+FN+"\t    \t"+Matricula+"\t  \t  \t"+Carrera+"\t  \t  \t"+Grupo);

    }
    
    public void Alta(){ //setter
        
        System.out.print("Nombre: ");
        Nombre = entrada2.nextLine();
        System.out.print("Apellido Paterno: ");
        aPaterno = entrada2.nextLine();
        System.out.print("Apellido Materno: ");
        aMaterno = entrada2.nextLine();
        System.out.print("F N: ");
        FN = entrada2.nextLine();
        System.out.print("Matricula: ");
        Matricula = entrada2.nextLine();
        System.out.print("Carrera: ");
        Carrera = entrada2.nextLine();
        System.out.print("Grupo: ");
        Grupo = entrada2.nextLine();
    
    }
    
    
    public static void consulta(int atributo){
        
        switch(atributo){
            case 1:
                System.out.print("Nombre: ");
                dato = entrada2.nextLine();
                break;
            case 2:
                System.out.print("Apellido Paterno: ");
                dato = entrada2.nextLine();
                break;
            case 3:
                System.out.print("Apellido Materno: ");
                dato = entrada2.nextLine();
                break;
            case 4:
                System.out.print("F N: ");
                dato = entrada2.nextLine();
                break;
            case 5:
                System.out.print("Matricula: ");
                dato = entrada2.nextLine();
                break;
            case 6:
                System.out.print("Carrera: ");
                dato = entrada2.nextLine();
                break;
            case 7:
                System.out.print("Matricula: ");
                dato = entrada2.nextLine();
                break;
            default:
            System.out.println("Opcion Incorrecta");
        }
    }
    
    
    public String atributoAcomparar(int atributo){
        switch(atributo){
            case 1:
                return Nombre;
            case 2:
                return aPaterno;
           
            case 3:
                return aMaterno;
            case 4:
                return FN;
            case 5:
                return Matricula;
            case 6:
                return Carrera;
            case 7: 
                return Grupo;
            default:
                return "Error";
        }
    }
    
    
    public void busqueda(int atributo){
        String a;
        a = atributoAcomparar(atributo);
        int cont = 0;
            if (dato.length()!=0){
                for(int i = 0; i<dato.length();i++){
                    if(a.charAt(i)==dato.charAt(i))
                        cont++;            
                }
                    if(cont == dato.length())
                        imprimeDatos();
            }else
                System.out.println("No se ingreso busqueda");
            
    }
}
    
