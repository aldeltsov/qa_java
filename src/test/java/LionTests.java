import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void testNotLionIndividual() {
        AtomicReference<Lion> lion = null;
        Exception exception = assertThrows(Exception.class, () -> lion.set(new Lion(feline,"Самей")));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetLionFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline, "Самец");
        assertEquals("Хищник ест мясо", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testGetLionKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, "Самец");
        assertEquals("Один котёнок", 1, lion.getKittens());
    }

}
