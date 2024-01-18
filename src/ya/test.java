package ez;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nomer berapa");
        int ini = in.nextInt();
        switch (ini) {       
        case 1:     System.out.println("Masukkan panjang polindrom ");
        int x = in.nextInt();
        int p=0;
        int [] arr = new int [x];
        for (int i = 0; i < x; i++) {
            System.out.println("ke - "+ (i+1));
            arr[i]=in.nextInt();
        }
        
        for (int i = 0; i < x/2; i++) {
            if (arr[i]==arr[(arr.length-1)-i]) {
                p+=1;
            }
        }
        if (p==arr.length/2) {
            System.out.println("Angka Polindrome");
        }else{
            System.out.println("Bukan angka polindrome");
        }
        break;
        case 2:
            System.out.println("Masukkan jam");
            int jam=in.nextInt();
            int menit=in.nextInt();
            int detik = in.nextInt();
            if (jam>12) {
                System.out.println("AM"+(jam-12)+";"+menit+";"+detik);
            }else{
                System.out.println("PM "+(jam+12)+";"+menit+";"+detik);
            }
        break;
        case 5:
            System.out.println("Masukkan jam");
           int jnow = in.nextInt();
            int mnow = in.nextInt();
            if (mnow%10==0 ) {
                mnow/=10;
                if (mnow%5==0) {
                    
                }else if(mnow%5==0){

                }else if(mnow%4==0){

                }else if(mnow%3==0){

                }else if(mnow%2==0){

                }else if(mnow%1==0){

                }
                
            }
        break;
    }
    }
}
