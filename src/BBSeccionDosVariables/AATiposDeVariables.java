package BBSeccionDosVariables;

public class AATiposDeVariables {

    public static void main(String[] args) {
        /*
        * STRING
        * */
        String saludar = "Hola mundo desde Java"; //String


        /*
         * Number
         * */
        int numeroUno = 10; //entero -> primitivo
        Integer numeroDos = 10;

        /*
         * BOOLEAN
         * */
        boolean valor = true;

        /*
         * VAR
         * */
        var numeroTres = 23;
        var saludoDos = "Hola dos";

        //atajo : sout -> System.out.println(); 👇
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        System.out.println("numeroUno = " + numeroUno);
    }
}
