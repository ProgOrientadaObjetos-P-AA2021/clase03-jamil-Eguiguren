/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;


public class Ejecutor {
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        // p.version = 10;
        int valor = 11;
        p.establecerVersion(valor);
        System.out.println(p.obtenerVersion());
    }
}
