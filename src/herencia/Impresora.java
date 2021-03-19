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
public class Impresora extends Equipo{
    private String tipo;

    public Impresora(String tipo, String codigo, String ubicacion, double precio, boolean protegido) {
        super(codigo, ubicacion, precio, protegido);
        this.tipo = tipo;
    }
    
    

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
