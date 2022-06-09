package n1Exercici2;



import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class CalculoDniTest {
    
    CalculoDni calculoDni;
    
    private final int numeroDni;
    private final char lletra;
    
    
    //Constructor amb num dni i la lletra en concret
    //La cadena del lletras ja está al metoode
    public CalculoDniTest(int numeroDni, char lletra) {
      
        this.numeroDni = numeroDni;
        this.lletra = lletra;
        
        calculoDni = new CalculoDni();
    }
    
    
    @Parameterized.Parameters
    public static Collection calcularLletra(){
        
        return Arrays.asList(new Object[][] {
         { 4565763, 'X' },
         { 4975287, 'L' },
         { 6547283 ,  'B' },
         { 48032930 , 'Y'},
         { 46416896 , 'K'},
         { 45792829 , 'J'},
         { 45792329 , 'L'},
         { 434922298  , 'A'},
         { 457926589 ,  'Q'},
         { 345654659 ,  'X'},
                
      });
        
     }
    
    
    @Test
    public void testCalcularDni() {
        
        System.out.println("Dni a calcular " +numeroDni);
        assertEquals(lletra, calculoDni.calcularDni(numeroDni));
        
    }
    
}