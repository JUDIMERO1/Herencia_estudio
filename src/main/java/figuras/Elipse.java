
package figuras;

/**
 *
 * @author JUAN D MELENDEZ
 */
public class Elipse extends FigurasGeometricas {
    
    private int EjeMayor;
    private int EjeMenor;

    public Elipse(int EjeMayor, int EjeMenor, String color) {
        super(color);
        this.EjeMayor = EjeMayor;
        this.EjeMenor = EjeMenor;
    }
    
    public void mostrardatos(){
        
        System.out.println(" El color de la elipse es : "+ getColor()+
        "\nEl eje mayor tiene : "+EjeMayor+"cm"+
        "\n El eje menor tiene : "+ EjeMenor+ "cm");
    }
}
