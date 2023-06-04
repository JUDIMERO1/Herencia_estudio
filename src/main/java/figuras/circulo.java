
package figuras;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class circulo extends FigurasGeometricas {
    private  int diametro;

    public circulo(int diametro, String color) {
        super(color);
        this.diametro = diametro;
    }

    public void mostrardatos(){
        System.out.println("El color del circulo es : "+getColor()+ "\nEl diametro del circulo es de : "+diametro+"cm");
    } 
    
    
}
