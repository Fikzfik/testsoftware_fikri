package ya;
import java.util.Arrays;
public class Ala {
    public static void main(String [] Args){
        
        int [][] a = new int [3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a.length; j++) {
               a[i][j] = (int)(Math.random() * 5 );
            }
        }
        int [][] b = new int [3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a.length; j++) {
               b[i][j] = (int)(Math.random() * 5 );
            }
        }
        System.out.println(StringtoArrays(a));
        int [][] c = new int [3][3];
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        iniInt(10);
        iniFloat(11.1f);
        iniDouble(23.3d);
        int [] Array1 = new int [5]; 
        int [] Array = {1,2,3,4,5,6};
        for (int angka : Array){
            System.out.println(angka);
        }
        Arrays.fill(Array1,5);
        System.out.println(Arrays.toString(Array1));
    }
    public static void iniInt(int ya){
        System.out.println("Ini int = " + ya);
    }
    public static void iniFloat(float ya){
     System.out.println("Ini float = " + ya);
    }
    public static void iniDouble(double ya){
     System.out.println("Ini double = " + ya);
    }
    
    
}
