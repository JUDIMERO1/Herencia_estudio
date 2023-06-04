
package figuras;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class test {
    public static void main(String[] args) {
         
        Elipse eli = new Elipse(3, 1, "Amarillo");
        circulo cir = new circulo(1, "negro");
        cuadrado cua = new cuadrado(1.5f, "azul");
        rectangulo rec = new rectangulo(3, 1, "naranja");
        
        eli.mostrardatos();
        System.out.println("\n");
        cir.mostrardatos();
        System.out.println("\n");
        cua.mostrardatos();
        System.out.println("\n");
        rec.mostrardatos();
                
    }
}
