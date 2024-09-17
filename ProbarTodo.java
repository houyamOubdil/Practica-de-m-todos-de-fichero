/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author liberadosecretaria1
 */

// ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡P R E G U N T A     E N     L A      L Í N E A     19 / 95 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class ProbarTodo {
     public static void main(String[] args) throws IOException {
      
        File fichero = new File ("C:\\Users\\liberadosecretaria1\\Directory(prueba)\\Lisa"); // Para que es el .txt que me sacan en la ruta a la hora de copiarla?
        File directory = new File ("C:\\Users\\liberadosecretaria1\\Directory(prueba)");
        
        // Comprobar la existencia de los ficheros y directorios, si no existen: Crearlas.
        if(fichero.exists()){
            System.out.println("Este archivo ya existe :)");
        }else{
            System.out.println("Lo sientimos este archivo no existe, espera un momento y te lo creamos: " +"  ¡¡  " + "Done :) " + "!!");
            fichero.createNewFile();
        }
                System.out.println(" ");
        
        if(directory.exists()){
            System.out.println("Este directorio ya existe :)");
        }else{
            System.out.println("Lo sientimos este directorio no existe, espera un momento y te lo creamos: " + "  ¡¡ DONE !!");
            directory.mkdir();
        }
                System.out.println(" ");

        // Comprobar si es un fichero: 
        System.out.println("Is it a file? : " );
       if(fichero.isFile()== true ){
            System.out.println("Yes it is a File");
        }else{
        System.out.println("No is not a File ");
        }
               System.out.println(" ");
               
        // Comprobar si está ocultado: 
        System.out.println("Is the file hidden? ");
        if (fichero.isHidden()== true) {
            System.out.println("The file is hidden");
        } else {
            System.out.println("The file isn't hidden.");
        }
        System.out.println("Is the directory hidden? ");
        if (fichero.isHidden()== true) {
            System.out.println("The directory is hidden");
        } else {
            System.out.println("The directory isn't hidden.");
        }
            System.out.println("");
            
       // Comprobar si se pueden leer, escribir y ejecutar:
       //Read file:
       System.out.println("can this file be read?");
       if(fichero.canRead()== true){
           System.out.println("Yeah!! you can read it :) ");
       }else{
         System.out.println("We're sorry you can't read this file :( ");
       }
               System.out.println(" ");

       // Read directory: 
       System.out.println("can this directory be read?");
       if(directory.canRead()== true){
           System.out.println("Yeah!! you can read it :) ");
       }else{
         System.out.println("We're sorry you can't read this directory :( ");
       }
               System.out.println(" ");

       // Write file: 
       System.out.println("Is this file writable??");
       if(fichero.canWrite()== true){
           System.out.println("Yeah!! you can write it :) ");
       }else{
         System.out.println("We're sorry you can't write this file :( ");
       }
               System.out.println(" ");

       //Write directory: 
       System.out.println("Is this directory writable?");
       if(directory.canWrite()== true){
           System.out.println("Yeah! you can write in this directory :) ");
       }else{
           System.out.println("We're sorry, you can't write in this directory :( ");
       }
               System.out.println(" ");

       //Execute file: 
       System.out.println("Can this file be executed?? ");
       if (fichero.canExecute()== true){
           System.out.println("Of course you can execute it!!  ");
       }else{
           System.out.println("we`re sorry you can't execute this file. ");
       }
               System.out.println(" ");

       //Execute directory: 
       System.out.println("Can this directory be executed?? " );
       if(directory.canExecute()== true){
           System.out.println("Yeah sure you can excute it!! ");
       }else{
           System.out.println("We're sorry, you can't execute this directory. ");
       }
               System.out.println(" ");

       // Indicar la ruta absoluta del fichero: 
       System.out.println("The absolute path of the: ");
       System.out.println("File is: " + fichero.getAbsolutePath());
       System.out.println("Directory is: " + directory.getAbsolutePath());
       System.out.println("path: " + fichero.getPath()); // Cual es la diferencia entre getPath y getAbsolutePath??
               
               System.out.println(" ");

       //Indicar el nombre del fichero y el directorio: 
       System.out.println("The file's name is: " + fichero.getName());
       System.out.println("The directory's name is: " + directory.getName());
       
               System.out.println(" ");

       // Indicar el nombre del directorio padre: 
       System.out.println("The name of the file's parent directory is: " + fichero.getParent());
       System.out.println("The name of the directory's parent directory is: " + directory.getParent());
       
               System.out.println(" ");
               
        // Guardar en un Array de file todo los directorios hijos, solo con directorios:
        System.out.println("Rutas de los objetos file dentro del array: ");
        File lista[] = directory.listFiles();
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
            System.out.println("");
            
        //Guardar en un array de String los directorios hijos, solo con dioreectorios:
        System.out.println("Nombre de los objetos String dentro de un array: ");
        String Lista[] = directory.list();
        for (int i = 0; i < Lista.length; i++){
            System.out.println(Lista[i]);
        }
        
            System.out.println("");
            
        // Eliminar el fichero: 
        System.out.println("I wanna delete this file: ");
        if (fichero.delete()== true){
            System.out.println("The file has been deleted successfully :) ");
        }else{
            System.out.println("We're sorry we can't delete this file in the moment. Try again please.");
        }
            System.out.println("");
            
        File file = new File("C:\\Users\\liberadosecretaria1\\New Directory\\New file.txt");
        File directorio = new File("C:\\Users\\liberadosecretaria1\\New Directory");
        System.out.println("I wanna delete this directory: ");
        if (directory.delete()== true){
            System.out.println("The directory has been deleted successfully :) ");
        }else{
            System.out.println("We're sorry we can't delete this directory in the moment. Try again please.");
        }
            System.out.println("");
            
        // Cambiar el nombre del fichero o el directorio:
        // NO SÉ COMO HACERLO.
}
     
}
