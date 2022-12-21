public class Principal {
    public static void main(String[] args) {
        int number = 0;
        int numberWhile = -10;
        int numberDoWhile = 3;
        String estacion = "Invierno";

        verifyPositiveNegativeOr0(number);
        verifyNumberMin3(numberWhile);
        verifyNumberMin3DoWhile(numberDoWhile);
        verifyNumberWithFor();
        switchCase(estacion);
    }

    public static void verifyPositiveNegativeOr0(int number) {
        if (number > 0) {
            System.out.println("el numero es positivo");
        } else if (number < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es 0");
        }
    }

    public static void verifyNumberMin3(int num) {
        while (num < 3) {
            System.out.println(num);
            num ++;
        }
    }

    public static void verifyNumberMin3DoWhile(int num) {
        do {
            System.out.println(num);
            num ++;
        } while (num < 3);
    }

    public static void verifyNumberWithFor() {
        for (int numberFor=0 ; numberFor <= 3 ; numberFor++) {
            System.out.println(numberFor);
        }
    }

    public static void switchCase(String estacion) {
        switch (estacion) {
            case "Invierno":
                System.out.println(estacion);
                break;
            case "Otoño":
                System.out.println(estacion);
                break;
            case "Verano":
                System.out.println(estacion);
                break;
            case "Primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println(estacion);
        }
    }
}
