import java.util.Scanner;

public class POST_TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, Kelas, NIM, Prodi, Fakultas, Universitas;
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama Lengkap : ");
        nama = input.nextLine();
        System.out.print("Kelas : ");
        Kelas = input.nextLine();
        System.out.print("NIM : ");
        NIM = input.nextLine();
        System.out.print("Program Studi : ");
        Prodi = input.nextLine();
        System.out.print("Fakultas : ");
        Fakultas = input.nextLine();
        System.out.print("Universitas : ");
        Universitas = input.nextLine();

        System.out.println("\n===== KARTU TANDA MAHASISWA =====");
        System.out.println("Nama\t : " + nama);
        System.out.println("Kelas\t : " + Kelas);
        System.out.println("NIM\t : " + NIM);
        System.out.println("Program Studi\t : " + Prodi);
        System.out.println("Fakultas\t : " + Fakultas);
        System.out.println("Universitas\t : " + Universitas);
        input.close();
    }
}
