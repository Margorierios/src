public class Primero {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos", 9.0, 8.5, 7.5);
        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Nota 1: " + e1.getNota1());
        System.out.println("Nota 2: " + e1.getNota2());
        System.out.println("Nota 3: " + e1.getNota3());
        e1.setNota2(9.5);
        System.out.println("\nDespués de corregir nota 2: " + e1.getNota2());
    }
}
