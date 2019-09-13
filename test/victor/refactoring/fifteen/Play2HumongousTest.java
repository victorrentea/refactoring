package victor.refactoring.fifteen;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Play2HumongousTest {
    @InjectMocks
    private Play2Humongous target;
    @Test
    public void test1() {
        int result;
        if (true) {
            result = target.bigForTrue("1");
        } else {
            result = target.bigForFalse("1");
        }
        assertEquals(1, result);
    }

}
