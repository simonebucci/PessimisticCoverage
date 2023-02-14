import it.simonebucci.pessimisticcoverage.PessimisticApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPessimisticApplication {
    @Test
    public void test() {
        PessimisticApplication test = new PessimisticApplication();
        String output = test.getHour();
        assertEquals("9:54 AM", output);
    }
}
