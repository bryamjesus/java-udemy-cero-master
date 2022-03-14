package CCSeccionTresString;

public class GGMetodosString {

    public static void main(String[] args) {
        String nombre = "Bryam";
        
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLoweCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Bryam")); //los \es para quitar las comillas
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"bryam\") = " + nombre.equalsIgnoreCase("bryam"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Bryam"));
        System.out.println("nombre.equals(\"Aaron\") = " + nombre.compareTo("Bryan"));
        System.out.println("nombre.charAT() = " + nombre.charAt(4)); //hace un array de la palabra y el numero es como el indice
    }
}
