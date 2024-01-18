package ez;
import java.util.Scanner;
public class Array {
    private static int jumlah(int n){
        int hasil = 0;
        if (n==0) {
            return 0;
        }else{
            System.out.println(n);
            hasil= n+jumlah(n-1);
            
        }
        
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai ");
        int o = 0;
        int x = input.nextInt();
        int a = jumlah(x);
        System.out.println(a);    
    
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        System.out.println("Angka Pertama");
//        int f = input.nextInt();
//        System.out.println("Angka Kedua");
//        int b = input.nextInt();
//        System.out.println("Looping Berapa Kali?");
//        int n = input.nextInt();
//        int c = 0;
//        System.out.print(f + " ");
//        System.out.print(b + " ");
//        for (int i = 0; i <= n ; i++) {
//            c=f+b;
//            f=b;
//            b=c;
//            
//            System.out.print(b + " ");
//        }
        
        
//        int[] angka = new int[10000];
//        int total=0;
//        System.out.println("Masukkan Nilai Awal");
//        int nawal= input.nextInt();
//        System.out.println("Masukkan Nilai Akhir");
//        int nakhir= input.nextInt();
//        do {
//            total+=nawal;
//            nawal++;
//        }while(nawal<=nakhir);
//        System.out.println(total);
    }
   }   
