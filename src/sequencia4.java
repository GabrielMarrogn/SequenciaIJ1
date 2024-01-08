import java.text.DecimalFormat;

public class sequencia4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;

        DecimalFormat decimal = new DecimalFormat("0.#");
        for(double i = 0; i <=2; i = i+0.2){
            double a1 = a + i;
            double b1 = b + i;
            double c1 =c + i;
            System.out.println("I=" +decimal.format(i) +" J=" +decimal.format(a1));
            System.out.println("I=" +decimal.format(i) +" J=" +decimal.format(b1));
            System.out.println("I=" +decimal.format(i) +" J=" +decimal.format(c1));
        }
    }
}
