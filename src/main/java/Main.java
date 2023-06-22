public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // подтотавливаем данные:

        long amount = 100;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:

        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        // Если true - PASS
        // Если false - FALL

        boolean passed = expected == actual;

        // выводим результат

        System.out.println(passed);
    }
}
