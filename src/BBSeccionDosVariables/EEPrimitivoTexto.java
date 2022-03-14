package BBSeccionDosVariables;

public class EEPrimitivoTexto {

    public static void main(String[] args) {
        //CHAR -> solo una letra
        char caracter = '\u0040'; //se usa doble comiilla cuando ponemos string
        char decimal = 64; // @
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("Decima = caracter " + (decimal == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        //VAR
        var decimalDos = 64;
        System.out.println("decimalDos = " + decimalDos);
    }
}
