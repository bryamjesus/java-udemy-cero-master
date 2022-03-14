package CCSeccionTresString;

public class HHMetodosStringDos {

    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("a")); // bota el indice en el que se encuetra lo que nosotos pongamos
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf("a")); //bota el indice pero la ultima que encuentre
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("z"));//-1
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("lenguas")); //true o false si es que se encuentra
        System.out.println("trabalenguas.starWith() = " + trabalenguas.startsWith("lenguas")); //si comienza con dicha palabra -> true o false
        System.out.println("trabalenguas.endWith() = " + trabalenguas.endsWith("lenguas")); //si termina con dica palabra
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  trabalenguas    ".trim()); //quita los espacios
    }
}
