
package figuras;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class cuadrado extends FigurasGeometricas {
    private float longuitud;

    public cuadrado(float longuitud, String color) {
        super(color);
        this.longuitud = longuitud;
    }

    public void mostrardatos(){
        System.out.println("El color del cuadrado es : "+ getColor()+
                "\nLa longitud del cuadrado es de : "+ longuitud+"cm");
    }
    
    
}
