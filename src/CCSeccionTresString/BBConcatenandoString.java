package CCSeccionTresString;

public class BBConcatenandoString {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Bryam Talledo";
        String detalle = curso + " con el instructor " + profesor;
        //
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        //
        System.out.println(detalle + (numeroA + numeroB)); //para que sume es mejor ponerle parentesis
        //
        System.out.println(numeroA + numeroB + detalle); //suma primero y luego concatena

        String detalleDos = curso.concat(" con ".concat(profesor)); //lo mismo
        detalleDos = curso.concat(" con ").concat(profesor);
        //
        System.out.println("detalleDos = " + detalleDos);
    }
}
