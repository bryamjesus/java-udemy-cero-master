package CCSeccionTresString;

public class DDTestRendimientoConcatenar {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //esta preparado para concatenar bastantes string

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); //500 => 7 || 1000 => 11 || 10000 => 278, 217
            //c += a + b +"\n";  // 500 => 64 || 1000 => 55 || 10000 => 160, 200
            sb.append(a).append(b).append("\n"); // 500 => 1 || 1000 => 1 || 10000 => 7, 8
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio); //
        System.out.println("c = " + c); //
        System.out.println("sb.toString() = " + sb.toString()); //
    }

}
