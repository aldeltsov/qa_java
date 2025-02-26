import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Mock
    Animal animal;

    @Spy
    Feline felineSpy = new Feline();

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline(animal);
        feline.eatMeat();
        Mockito.verify(animal).getFood("Хищник");
    }

    @Test
    public void testGetFelineFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetOneFelineKitten() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testGetMoreFelineKittens() {
        Feline feline = new Feline();
        int kittensCount = 10;
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}