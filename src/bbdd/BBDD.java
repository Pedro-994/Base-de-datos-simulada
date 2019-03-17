package bbdd;

import java.util.Scanner;

/**
 *
 * @author pirul
 */
public class BBDD {
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        Alumno[] alumnos = new Alumno[10];     
        int contador = 0,opc=0;
        
        System.out.println("Bienvenido\n");
        do{
            System.out.println("¿Que deseas Realizar?.");
            System.out.println("1.-Alta\n2.-Consulta\n3.-Salir\n");
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    if (contador<10){
                        alumnos[contador] = new Alumno();
                        alumnos[contador].Alta();
                        contador++;
                    }else
                        System.out.println("\nRegistro lleno\n");
                    break;
                case 2:
                    if(contador==0)
                        System.out.println("No se a almacenado ningun registro");
                    else
                    {
                        System.out.println("¿Por medio de que atributo desea realizar la busqueda?");
                        int atributo;
                        do{
                            System.out.println("1.- Nombre\n2.- aPaterno\n3._ aMaterno\n4.- FN\n5.- Matricula\n6.- Carrera\n7.- Grupo");
                            atributo = entrada.nextInt();
                             Alumno.consulta(atributo);
                             System.out.print("Nombre\t\t aPaterno\t\t aMaterno\t\t FN\t\t Matricula\t\t Carrera\t\t Grupo\n");
                             for (int i = 0; i<contador;i++){
                                 alumnos[i].busqueda(atributo);
                                 System.out.println("");
                             }
   
                        }while(atributo<1 || atributo>7);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            
            }
        }while(opc!=3);
        System.out.println("Programa finalizado");
    }
}
