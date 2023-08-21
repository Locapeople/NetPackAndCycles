import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IWantToRestServiceTest {
    @Test
    public void SampleTest1() {
        IWantToRestService service = new IWantToRestService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int result;
        int expected = 3;

        result = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(result, expected);
    }
}
