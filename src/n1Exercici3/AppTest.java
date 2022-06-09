package n1Exercici3;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    
    App app;
    
    public AppTest() {
    }
    
    public void inicialitzador(){
        
        app = new App();
    }
    

    //Indiquem que esperem un error del tipu que volem en aquest metode
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAfegirLlista() {
        
        inicialitzador();
        
        try { 
            
            app.afegirLlista();
            fail("No és el tipo d'excepció esperada");
            
        } catch(ArrayIndexOutOfBoundsException error) {
            
            assertEquals(error, app.afegirLlista());  

        }
        
    }
    
}