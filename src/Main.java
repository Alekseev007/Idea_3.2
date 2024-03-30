public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kilograms = 98;
        double meters = 1.87;
        System.out.println(service.calculate(kilograms, meters));
        }
    }