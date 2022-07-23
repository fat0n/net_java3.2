public class main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int weight = 70;
        double height = 1.75;

        double bmi = calculate.xz(weight, height);
        System.out.println("BMI= " + bmi);
    }
}
