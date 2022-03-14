package BBSeccionDosVariables;

public class JJTipoAString {

    public static void main(String[] args) {
        int otroNumeroInt = 100;
        String otroNumeroStr;
        //otroNumeroInt= Integer.toString(otroNumeroInt);
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
    }
}
