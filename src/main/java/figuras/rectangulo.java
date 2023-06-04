
package figuras;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class rectangulo  extends FigurasGeometricas {
    private int longitud;
    private int anchura;

    public rectangulo(int longitud, int anchura, String color) {
        super(color);
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public void mostrardatos(){
        System.out.println(" El color del rectangulo es  : "+ getColor()+
                "\nLa longitud  es de : "+longitud+"cm"+
        "\nLa anchura es de : "+ anchura+"cm");
    }
    
    
}
