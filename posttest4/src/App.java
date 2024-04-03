import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import POKTAN.*;

public class App {
    static ArrayList<poktan> data = new ArrayList<>();

    static void tambah(String nama, String ketua, String alamat) {
        poktan dt = new poktan(nama, ketua, alamat);
        data.add(dt);
    }

    static void lihat() {
        for (int i = 0; i < data.size(); i++) {
            poktan dt = data.get(i);
            System.out.println("\nNO DATA : " + (i + 1));
            System.out.println("nama kelompok tani          : " + dt.getNamaPoktan());
            System.out.println("nama ketua kelompok tani    : " + dt.getKetuaPoktan());
            System.out.println("alamat kelompok tani        : " + dt.getAlamat() + "\n");
        }
    }

    static void ubah(int index, String nama, String ketua, String alamat) {
        for (int i = 0; i < data.size(); i++) {
            poktan dt = data.get(i);
            if (index - 1 == i) {
                dt.setNamaPoktan(nama);
                dt.setKetuaPoktan(ketua);
                dt.setAlamat(alamat);
            }
        }
    }

    static void hapus(int index) {
        data.remove(index - 1);
    }

    public static void main(String[] args) throws IOException {
        String nama, ketua, alamat;
        int pilih, index;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("\n======== Menu =========");
            System.out.println("1. lihat kelompok tani");
            System.out.println("2. tambah kelompok tani");
            System.out.println("3. ubah kelompok tani");
            System.out.println("4. hapus kelompok tani");
            System.out.println("5. absen poktan");
            System.out.println("6. absen anggota");
            System.out.println("7. absen ketua");
            System.out.println("8. exit");
            System.out.print("silahkan pilih menu : ");
            pilih = Integer.parseInt(br.readLine());

            switch (pilih) {
                case 1:
                    lihat();
                    break;

                case 2:
                    System.out.print("\nmasukkan nama kelompok tani     : ");
                    nama = br.readLine();

                    System.out.print("masukkan nama ketua kelompok tani : ");
                    ketua = br.readLine();

                    System.out.print("alamat kelompok tani              : ");
                    alamat = br.readLine();

                    tambah(nama, ketua, alamat);
                    break;

                case 3:
                    lihat();
                    System.out.print("\npilih nomor data yang ingin diubah :");
                    index = Integer.parseInt(br.readLine());

                    System.out.print("masukkan nama kelompok tani       : ");
                    nama = br.readLine();

                    System.out.print("masukkan nama ketua kelompok tani : ");
                    ketua = br.readLine();

                    System.out.print("alamat kelompok tani              : ");
                    alamat = br.readLine();
                    ubah(index, nama, ketua, alamat);
                    break;
                case 4:
                    lihat();
                    System.out.print("\npilih nomor data yang ingin dihapus : ");
                    index = Integer.parseInt(br.readLine());
                    hapus(index);
                    break;
                case 5:
                    poktan pk = new poktan("barokah", "udin", "api-api");
                    pk.absen();
                    break;
                case 6:
                    Anggota ag = new Anggota("ucup", 25);
                    ag.absen();
                    break;
                case 7:
                    Ketua kt = new Ketua("udin", 35);
                    kt.absen();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nsilahkan pilih menu yang benar!!\n");
                    break;
            }
        }
    }
}