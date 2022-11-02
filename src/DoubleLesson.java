public class DoubleLesson {
    public static void main(String[] args) {
        //Вася получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в году.
        //Сколько часов отработает Вася за год и сколько он заработает денег.

        //ему дали отпуск в течении двух недель,он оплачивается 50% зп
        //пересчитайте зарплату за год

        double a = 5.6;
        int b = 12;
        int days = 364;

        System.out.println(a * b * days);
        System.out.println(days * b);

        double cashFromWork = a * b * (days - 14);
        System.out.println(cashFromWork);


        double vocationMoney = a * b * 14 / 2;

        System.out.println(vocationMoney);
        System.out.println(cashFromWork + vocationMoney);






    }
}
