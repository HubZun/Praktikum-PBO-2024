package POKTAN;

public class Ketua extends poktan {
    public Ketua(String nama, int umur){
        super(nama,umur);
    }
    
    @Override
    public void absen(){
        System.out.println("Ketua berhasil absen");
    
    }

    public String nama(String nama){
        return nama;
    }
}
