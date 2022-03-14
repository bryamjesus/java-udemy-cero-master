package CCSeccionTresString;

public class GGMetodosStringUno {

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
        System.out.println("nombre.charAT() = " + nombre.charAt(1)); //hace un array de la palabra y el numero es como el indice
        System.out.println("nombre.charAT(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //exclue si ponemos 1 o ea empieza desde el r ya que r en la matriz
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2,5));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
    }
}
