/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deportes_atlas.DTO;
/**
 *
 * @author acer
 */
public class Registro_Clubs {
   private int Codigo;
   private String Nombre;
   private String lema;
   private int ValorSuscripcion;
   private String Colores;

    public Registro_Clubs() {
        this.Codigo = 0 ;
        this.Nombre = " ";
        this.lema = " ";
        this.ValorSuscripcion = 0 ;
        this.Colores = " ";
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
   
}
