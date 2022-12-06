public class Main {
    public static void main(String[] args) {
        int numeroIf = 7;
        int numeroWhile = -21;
        String estacion = "Verano";

        if (numeroIf > 0){
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es igual a 0");
        }

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        }while (numeroWhile > 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Estacion invalida");


        }
    }
}