package ExaExamen2_Lab_HectorVargas;
/**
 *
 * @author Hector
 */
public enum trophy {
    platino(5),Oro(3),plata(2),bronce(1);
    
    public int puntos;
    
    trophy(int puntos) {
        this.puntos = puntos;
    }
}
