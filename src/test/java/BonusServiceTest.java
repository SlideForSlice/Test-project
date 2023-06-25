import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // call main method
        long actual = service.calculate(amount, registered);

        // compare expected result and actual result

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // call main method
        long actual = service.calculate(amount, registered);

        // compare expected result and actual result

        assertEquals(expected, actual);
    }


}