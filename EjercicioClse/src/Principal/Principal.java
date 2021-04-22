/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Smart
 */
public class Principal {
    public static void main(String[] args) {
     InstitucioneEducativa ob = new InstitucioneEducativa(); 
        ob = new InstitucioneEducativa();     
        ob.establecerNombre("Juan");
        ob.establecerTipoInstitucion("Tecnico");
        ob.establecerNumeroAlumnos(15);
        ob.establecerNumeroDocentes(10);
        ob.establecerNumeroSedes(5);
        
        System.out.printf("%s\n%s\n%d\n%d\n%d\n",
                ob.obtenerNombre(),
                ob.obtenerTipoInstitucion(),
                ob.obtenerNumeroAlumnos(),
                ob.obtenerNumeroDocentes(),
                ob.obtenerNumeroSedes());
       
    }
    
    
    
}
