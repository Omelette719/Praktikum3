package soal2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> daftarBulan = new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();

            String jenisKepemimpinan = scanner.nextLine();

            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = scanner.nextInt();

                int bulan = scanner.nextInt();

                int tahun = scanner.nextInt();
                scanner.nextLine(); 

                daftarNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        for (Negara negara : daftarNegara) {
            negara.tampilkanDetail(daftarBulan);
        }

        scanner.close();
	}
}
