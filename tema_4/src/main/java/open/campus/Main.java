package open.campus;

public class Main {
    public static void main(String[] args) {
        int numeroIf= 6;
        if (numeroIf<0){
            System.out.println("es negativo");
        } else if (numeroIf==0){
            System.out.println("es 0");
        } else System.out.println("es positivo");

        int numeroWhile=1;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile+1;
        }

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile>3);


        for (int numeroFor=0; numeroFor<3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion= "INVIERNO";
        switch (estacion){
            case "VERANO":
                System.out.println("es verano "); break;
            case "OTOÑO":
                System.out.println("es otoño"); break;
            case "PRIMAVERA":
                System.out.println("es primavera"); break;
            case "INVIERNO":
                System.out.println("es invierno"); break;
            default:
                System.out.println("no se usó una variable par estación");
        }

    }
}