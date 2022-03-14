package CCSeccionTresString;

public class CCInmutabilidad {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Bryam Talledo";

        curso.concat(profesor);
        System.out.println("curso = " + curso); //

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado); //
        System.out.println(resultado.equals(curso)); //

        String resultadoDos = curso.transform(c -> {
            return c.concat(" con ").concat(profesor);
        });
        System.out.println("curso con transform pero sigue igual" + curso); //
        System.out.println("resultadoDos = " + resultadoDos); //

        String resultadoTres = resultado.replace("a", "A"); //reemplaza un caracter
        System.out.println("resultado = " + resultadoTres);
    }
}
