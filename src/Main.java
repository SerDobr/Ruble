public class Main {
    public static void main(String[] args) {

        int replenishment = 1200;
        int balance = 100;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int finalbalance = balance + replenishment + bonus;

        System.out.println("Здравствуйте, Ваш баланс cоставляет:" + finalbalance);

    }
}


