public class Main {
    public static void main(String[] args) {
        sentencia_si();
        System.out.println("############");
        sentencia_mientras();
        System.out.println("############");
        sentencia_mientras();
        System.out.println("############");
        sentencia_for();
        System.out.println("############");
        sentencia_switch();
    }

    public static void sentencia_si() {
        String estacion = "primavera";

        if (estacion.equals("primavera")) {
            System.out.println("Es primavera");
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación");
        }
    }

    public static void sentencia_mientras() {
        int contador = 10;
        while (contador > 0) {
            System.out.println("Contador vale: " + contador);
            contador--;
        }
    }

    public static void sentencia_hacer_mientras(){
        int contador = -10;
        do {
            System.out.println("Contador vale: " + contador);
            contador--;
        } while (contador > 0 );
    }

    public static void sentencia_for(){
        int[] valores = new int[]{18, 5, 87, 64, 17};

        for (int i=0; i< valores.length;i++){
            System.out.println("Valor: [" + i +"] -> "+ valores[i]);
        }
    }

    public static void sentencia_switch(){
        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.printf(estacion);
        }
    }


}