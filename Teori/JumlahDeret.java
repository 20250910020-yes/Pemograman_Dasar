import java.util.Scanner;

public class JumlahDeret {
    public static void main(String[]args){
        Scanner dt = new Scanner(System.in);
        int i,n, jumlah=0;
        System.out.print("Masukan Banyak Bilangan: ");
        n = dt.nextInt();
        for(i=1; i<=n; i++){
            jumlah += i;
        }
        System.out.println("Jumlah: " + jumlah);
    }
}
