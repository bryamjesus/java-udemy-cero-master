package BBSeccionDosVariables;

public class KKConversionTipos {

    public static void main(String[] args) {
        int i = 10000;
        //short s = i; //habnria perdidta de datos
        short s = (short) i; // aca estamos forzando en la conversion
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
    }
}
