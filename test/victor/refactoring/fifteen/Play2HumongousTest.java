package victor.refactoring.fifteen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Play2HumongousTest {
    @InjectMocks
    private Play2Humongous target;
    @Test
    public void test1() {
        assertEquals(1, target.humongousMethod("1", true));
    }

}
