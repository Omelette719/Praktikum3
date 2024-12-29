package soal2;
import java.util.*;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public void tampilkanDetail(HashMap<Integer, String> daftarBulan) {
        System.out.print("Negara " + nama + " mempunyai ");
        switch (jenisKepemimpinan.toLowerCase()) {
            case "presiden":
                System.out.print("Presiden");
                break;
            case "perdana menteri":
                System.out.print("Perdana Menteri");
                break;
            case "monarki":
                System.out.print("Raja");
                break;
            default:
                System.out.print(jenisKepemimpinan);
        }
        System.out.println(" bernama " + namaPemimpin);
        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + daftarBulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
        System.out.println();
    }
}
