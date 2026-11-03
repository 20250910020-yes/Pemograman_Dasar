import javax.swing.JOptionPane;

public class TUGAS_MOD2 {
    public static void main(String[] args) {
        String MP, UTS, UAS;
        double nilaiMP, nilaiUTS, nilaiUAS, nilaiAkhir;

        MP = JOptionPane.showInputDialog("Masukkan Nilai MP: ");
        nilaiMP = Double.parseDouble(MP);
        UTS = JOptionPane.showInputDialog("Masukkan Nilai UTS: ");
        nilaiUTS = Double.parseDouble(UTS);
        UAS = JOptionPane.showInputDialog("Masukkan Nilai UAS: ");
        nilaiUAS = Double.parseDouble(UAS);
        nilaiAkhir = (6 * nilaiMP + 2 * nilaiUTS + 2 * nilaiUAS) / 10;

        JOptionPane.showMessageDialog(null,
            "NILAI AKHIR PEMOGRAMAN DASAR\n" +
            "Nilai MP: " + nilaiMP + "\n" +
            "Nilai UTS: " + nilaiUTS + "\n" +
            "Nilai UAS: " + nilaiUAS + "\n" +
            "Nilai Akhir: " + nilaiAkhir);
    }
}


