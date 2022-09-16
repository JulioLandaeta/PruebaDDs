/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package deportes_atlas;
import java.util.Scanner;
import deportes_atlas.DTO.Usuario;
import deportes_atlas.validaciones.validacion;
public class Deportes_ATLAS {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario ito = new Usuario();  
        ito.setNombreUsuario("");
        ito.setPassword(""); 

        System.out.println("ingrese su rut sin dv ni punto ni guion");
        int rut = sc.nextInt();
        System.out.println("ingrese su dv");
        String dv = sc.next();
        boolean valid= validacion.ValidarDv(String.valueOf(rut),dv);
        if(valid==true){
            ito.setRut(rut);
            ito.setDv(dv);
        }
        else{
            System.out.println("Rut no válido");
        }
        
        ito.setFechaNacimiento(" ");
        
        System.out.println(ito.getFechaNacimiento());
    }
    
}