package n1Exercici2;


public class CalculoDni {

    
    public static void main(String[] args) {
        
        
        //PROVES
        
        char lletra1 = calcularDni(4565763);
        System.out.println("la lletra del dni 1 �s " +lletra1);
        
        char lletra2 = calcularDni(4975287);
        System.out.println("la lletra del dni 2 �s " +lletra2);
        
        char lletra3 = calcularDni(6547283);
        System.out.println("la lletra del dni 3 �s " +lletra3);
        
        char lletra4 = calcularDni(48032930);
        System.out.println("la lletra del dni 4 �s " +lletra4);
        
        char lletra5 = calcularDni(46416896);
        System.out.println("la lletra del dni 5 �s " +lletra5);
        
        char lletra6 = calcularDni(45792829);
        System.out.println("la lletra del dni 6 �s " +lletra6);
        
        char lletra7 = calcularDni(45792329);
        System.out.println("la lletra del dni 7 �s " +lletra7);
        
        char lletra8 = calcularDni(434922298);
        System.out.println("la lletra del dni 8 �s " +lletra8);
       
        char lletra9 = calcularDni(457926589);
        System.out.println("la lletra del dni 9 �s " +lletra9);
        
        char lletra10 = calcularDni(345654659);
        System.out.println("la lletra del dni 10 �s " +lletra10); 
        
    }
    
    
     public static char calcularDni(int numero){
     
        
        String lletrasDni="TRWAGMYFPDXBNJZSQVHLCKE";

        int resultado = numero % 23;

        char letra = lletrasDni.charAt(resultado);

        return letra;
        
    }
    
}
