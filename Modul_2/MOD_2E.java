import javax.swing.JOptionPane;
public class MOD_2E {
    public static void main(String[] args) {
        String panjang, lebar;
        int luas;

        panjang = javax.swing.JOptionPane.showInputDialog("Masukkan Panjang : ");
        int pj = Integer.parseInt(panjang);
        lebar = javax.swing.JOptionPane.showInputDialog("Masukkan Lebar : ");
        int lb = Integer.parseInt(lebar);
        luas = pj * lb;
        javax.swing.JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luas);
    }
}

