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
            result = target.humongousMethod("1", true);
        } else {
            result = target.humongousMethod("1", false);
        }
        assertEquals(1, result);
    }

}
