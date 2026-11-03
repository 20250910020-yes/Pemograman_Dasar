import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 100000;
        double bunga = 10;

        System.out.print("Masukan Jangka Waktu (bulan) : ");
        int waktu = input.nextInt();

        for(int i = 1; i <= waktu; i++) {
            saldo = saldo + (saldo * bunga / 100);

            System.out.println("Saldo Bulan " + i + " = " + (long)saldo);
        }
    }
}
