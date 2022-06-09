package n1Exercici1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MesTest {
    
    Mes mes;
    

    /*Metode constructor per inicialitzar la clase on estan els metodes, 
    també per evitar errors alhora de executar com per exemple nullPointerException
    */
    public void testMes(){
        
        mes = new Mes();
        
        ////AFEGIIIR TAMBE A LA CLASE TEST!!
        mes.afegirMesos();
        
    }
    
    
    @Test
    public void testTotalMesos() {
       
        ///Cridem el metode inicialitzador de la clase que volem testejar
        testMes();
        int esperado = 12;
        assertEquals(esperado, mes.totalMesos());
        
        
    }

    
    @Test
    public void testDetectarLlistaBuida() {
        
        testMes();
        boolean esperado = false;
        //Esperem llista plena (osigui llistaBuida = false) comparem això amb el que ens retorna el metode
        assertEquals(esperado, mes.detectarLlistaBuida());
        
    }
    
    
    @Test
    public void testIdentificarPosicio() {
        
        testMes();
        int esperado = 7;
        //Comparem la posició esperada del element amb la que ens torna el metode
        assertEquals(esperado, mes.identificarPosicio("Agost"));
    }

   
    
}
