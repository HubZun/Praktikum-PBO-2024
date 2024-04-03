package POKTAN;

public class Anggota extends poktan{
    public Anggota(String nama, int umur){
        super(nama,umur);
    }

    @Override
    public void absen(){
        System.out.println("Anggota berhasil absen"); 
    }

}
