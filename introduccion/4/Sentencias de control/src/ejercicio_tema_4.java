public class ejercicio_tema_4 {
    public static void main(String[] args) {
        punto_uno(-15);
        System.out.println("##############");
        punto_dos();
        System.out.println("##############");
        punto_tres();
        System.out.println("##############");
        punto_cuatro();
        System.out.println("##############");
        punto_cinco("invierno");
        System.out.println("##############");
    }

    public static void punto_uno(int numerolf){
        if(numerolf < 0){
            System.out.println("Es negativo");
        }else if (numerolf > 0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es neutro");
        }
    }

    public static void punto_dos(){
        int numeroWhile =0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void punto_tres(){
        int numeroWhile =0;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile < 3);
    }

    public static void punto_cuatro(){
        for (int numeroFor =0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void punto_cinco(String estacion){
        switch (estacion){
            case "verano":
                System.out.println("Estás en verano");
                break;
            case "otoño":
                System.out.println("Estás en otoño");
                break;
            case "primavera":
                System.out.println("Estas en primavera");
                break;
            case "invierno":
                System.out.println("Estás en invierno");
                break;
            default:
                System.out.println("Estación invalida");
        }
    }
}
