public class BmiService {
    public int calculate(double kilograms, double meters) {
        double bmi;
        bmi = kilograms / (meters * meters);
        return (int) bmi;
    }
}