package BBSeccionDosVariables;

public class FFPrimitivosBoolean {

    public static void main(String[] args) {
        //BOOLEAN
        boolean datoLogico = false;
        datoLogico = Boolean.TRUE;

        System.out.println("datoLogico = " + datoLogico);

        /**
         * ***********************EJEMPLOS*****************************
         */
        double d = 98765.43e-3;//98.76543
        float f = 1.92345e2f;//12345.00
        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);
        //
        boolean esIgual = 3 - 2 == 1; //== es para comprar
        System.out.println("esIgual = " + esIgual);

    }
}
