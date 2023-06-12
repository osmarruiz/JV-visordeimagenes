/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visordeimagenes;

/**
 *
 * @author osmar
 */
public class CFoto {
   private String nombre;
   private String descripcion;
   
   public CFoto(){
   }
   public String getNombre(){
       return nombre;
   }
   public String getDescripcion(){
       return descripcion;
   }
   public void setNombre(String in_Nombre){
       this.nombre = in_Nombre;
   }
   public void setDescripcion(String in_Descripcion){
       this.descripcion = in_Descripcion;
   }
}
