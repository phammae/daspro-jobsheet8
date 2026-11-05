import java.util.Scanner;

public class Tugas317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jmlToko = sc.nextInt();
            if (jmlToko < 1) {
                System.out.println("Jumlah toko harus minimal 1!");
            }
        } while (jmlToko < 1);

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        String[] infoToko = new String[jmlToko];

        for (int i = 1; i <= jmlToko; i++) {
            System.out.println("Input Toko " + i);

            int jmlPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jmlPelanggan = sc.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jmlPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jmlPelanggan; j++) {
                int jmlBarang;
                do {
                    System.out.print("Jumlah barang dibeli pelanggan " + j + ": ");
                    jmlBarang = sc.nextInt();
                    if (jmlBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jmlBarang < 0);

                totalBarangToko += jmlBarang;
            }

            totalBarangSeluruhToko += totalBarangToko;

            infoToko[i - 1] = "Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("\n=================================");
        System.out.println("REKAP PENJUALAN:");
        for (String ringkasan : infoToko) {
            System.out.println(ringkasan);
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}