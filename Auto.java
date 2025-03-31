public class Auto {
    private String marca;
    private int combustible;
    
    public Auto(String pmarca, int pcombustible) {
        marca = pmarca;
        combustible = pcombustible;
    }
    
    public Auto() {
        // Constructor vacío
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getCombustible() {
        return combustible;
    }
    
    public void setMarca(String marcarecibida) {
        marca = marcarecibida;
    }
    
    public void setCombustible(int pcombustible) {
        combustible = pcombustible;
    }
    
    public void circular(int km) {
        combustible = combustible - 2 * km;
    }
    
    public void cargar(int litros) {
        combustible = combustible + litros;
    }
}