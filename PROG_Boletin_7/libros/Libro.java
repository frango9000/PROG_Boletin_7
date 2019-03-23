/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author fsancheztemprano
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    
    public boolean prestamo(){
        if(numEjemplares <= numPrestados){
            return false;
        }else{
            numPrestados++;
            return true;
        }
    }
    public boolean devolucion(){
        if(numPrestados==0){
            return false;
        }else{
            numPrestados--;
            return true;
        }
    }
    public void libroToString(){
        System.out.println("Libro: "+titulo+"\nAutor: "+autor+"\nCantidad de ejemplares: "+numEjemplares+"\nCantidad prestados: "+numPrestados);
    }
    
}
