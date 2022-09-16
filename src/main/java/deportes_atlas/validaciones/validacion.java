/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deportes_atlas.validaciones;
public class validacion{
    
    public static boolean ValidaPassword(String pass){
        boolean validaMayu = false;
        boolean validaNum = false;
        if(pass.length()>5){
            for(int x=0;x<pass.length();x++){
                if(!Character.isUpperCase(pass.charAt(x))){
                    validaMayu = true;
                }            
                else if(!Character.isDigit(pass.charAt(x))){
                    validaNum = true;
                }
            }
            return validaMayu==true && validaNum==true;
        }
        else{
            return false;
        }       
    }
    
    public static boolean ValidarDv(String rut, String dv){
        boolean Validacion=false;
        char Dv;
        if(rut.length()==8 || rut.length()==7){
            if(rut.contains(".")){
                rut = rut.replace(".","");
            }
            if(rut.contains("-")){
                rut = rut.replace("-", "");                
            }
            int rutAux = Integer.parseInt(rut);
            Dv = dv.charAt(0);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                Validacion = true;
            }   
        }
        return Validacion;
    }
    
}
