package CCSeccionTresString;

public class AACreandoObjetoStringEnLaLiteral {

    public static void main(String[] args) {
        //Maneras de crear un string
        String curso = "Programacion Java";
        String cursoDos = new String("programacion java");

        boolean esIgual = curso == cursoDos; //false por la manera de llamar; aca esta comprandndo el objeto o la manera
        System.out.println("curso == cursoDos = " + esIgual);

        esIgual = curso.equals(cursoDos); //aca esta comparando el valor para eso es el equals
        System.out.println("curso.equals(cursoDos) =" + esIgual);

        esIgual = curso.equalsIgnoreCase(curso); //aca compara sin importar si es mayuscula
        System.out.println("curso.equalsIgnoreCase(curso) = " + esIgual);

        String cursoTres = "Programacion Java";
        esIgual = curso == cursoTres;
        System.out.println("curso == cursoTres = " + cursoTres);
    }
}
