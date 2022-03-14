package BBSeccionDosVariables;

public class CCPrimitivosNumeros {

    public static void main(String[] args) {
        //BYTE
        byte numeroByte = 8;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte correspondiente en byte a " + Byte.BYTES);
        System.out.println("Tipo byte correspondiente en bite a " + Byte.SIZE);
        System.out.println("MAX." + Byte.MAX_VALUE);
        System.out.println("MIN." + Byte.MIN_VALUE);

        //SHORT
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo byte correspondiente en byte a " + Short.BYTES);
        System.out.println("Tipo byte correspondiente en bite a " + Short.SIZE);
        System.out.println("MAX." + Short.MAX_VALUE);
        System.out.println("MIN." + Short.MIN_VALUE);

        //INT
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo byte correspondiente en byte a " + Integer.BYTES);
        System.out.println("Tipo byte correspondiente en bite a " + Integer.SIZE);
        System.out.println("MAX. " + Integer.MAX_VALUE);
        System.out.println("MIN. " + Integer.MIN_VALUE);

        //LONG
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo byte correspondiente en byte a " + Long.BYTES);
        System.out.println("Tipo byte correspondiente en bite a " + Long.SIZE);
        System.out.println("MAX. " + Long.MAX_VALUE);
        System.out.println("MIN. " + Long.MIN_VALUE);

        /**
         * **********DECIMALES************
         */
        //FLOAT
        float realFloat = 1.3f; //con coma no con punto
        realFloat = 2.12e3f; //la e es de exponente y  el numero de al lado es la cantidad del exponente
        realFloat = 1.5e4f;// e4 -> 10^4
        realFloat = 1.5e-10f;//0.00000000015f
        System.out.println("realFloat = " + realFloat);
        System.out.println("MAX" + Float.MAX_VALUE);
        System.out.println("Min" + Float.MIN_VALUE);

        //DOUBLE
        double realDouble = 3.4028235e39;
        System.out.println("realDouble = " + realDouble);
    }
}
