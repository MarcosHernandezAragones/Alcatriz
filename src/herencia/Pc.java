/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author daw-A
 */
public class Pc extends Equipo{
    
    private String sistema;
    private String tipo;

    public Pc(String sistema, String tipo, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.sistema = sistema;
        this.tipo = tipo;
    }
    
    
    
    
}
