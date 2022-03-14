package CCSeccionTresString;

public class FFValidarUnString {

    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println(esNulo);
        //System.out.println(curso.toUpperCase()) //esto es un error;
        if (esNulo) {
            curso = " "; //"Programacion Java";
            
        }
        
        boolean esVacio = curso.length() == 0;
        System.out.println("es vacio " + esVacio);
        
        boolean esVacioDos = curso.isEmpty();
        System.out.println("es vacio 2 " + esVacioDos);
        
        boolean esBlanco = curso.isBlank(); //este gestiona hasta los espacio
        System.out.println("es blanco " + esBlanco);
        
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al ".concat(curso));
        }
        
        //System.out.println(curso.toUpperCase());
        //System.out.println("Bienvenido al ".concat(curso)); //tambien sale error si es que la variable se queda en nulo
        //System.out.println("Bienvenido al "+ curso); //aca no da error
    }
}
