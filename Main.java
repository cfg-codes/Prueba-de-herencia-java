public class Main {
    public static void main(String[] args) {
        // Declaración, instanciación e inicialización
        Auto nuevoauto = new Auto();
        System.out.println(nuevoauto.getMarca());
        nuevoauto.setMarca("Toyota");
        System.out.println(nuevoauto.getMarca());
        
        nuevoauto = new Auto("Ford", 50);
        System.out.println(nuevoauto.getMarca());
        nuevoauto.circular(15);
        System.out.println(nuevoauto.getCombustible());
        nuevoauto.cargar(50);
        System.out.println(nuevoauto.getCombustible());
        nuevoauto.circular(8);
        System.out.println(nuevoauto.getCombustible());
    }
}