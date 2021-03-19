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
public class Servidor extends Equipo{
    private String sistema;
    private String fecha;

    public Servidor(String sistema, String fecha, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.sistema = sistema;
        this.fecha = fecha;
    }
    
    
}
