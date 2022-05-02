public class Main {

    public static void main(String[] args) {

        int sum = 100;
        int amount = 3000;
        boolean isPaid = true;


        if (isPaid) {
            sum = amount + sum;
        } else {
            sum = sum;
        }
        int bonus;
        if (amount >= 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }
        sum = sum + bonus;

        System.out.println("На счету:" + sum);
        System.out.println("Бонусные рубли:" + bonus);

    }
}