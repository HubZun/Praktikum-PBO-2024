package POKTAN;

public class poktan {
    private String namaPoktan, ketuaPoktan, alamat;

    public poktan(String namaPoktan, String ketuaPoktan, String alamat) {
        this.namaPoktan = namaPoktan;
        this.ketuaPoktan = ketuaPoktan;
        this.alamat = alamat;
    }

    public poktan(String nama, int umur) {
        //TODO Auto-generated constructor stub
    }

    public String getNamaPoktan() {
        return namaPoktan;
    }

    public String getKetuaPoktan() {
        return ketuaPoktan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNamaPoktan(String namapoktan) {
        namaPoktan = namapoktan;
    }

    public void setKetuaPoktan(String ketuapoktan) {
        ketuaPoktan = ketuapoktan;
    }

    public void setAlamat(String Alamat) {
        alamat = Alamat;
    }

    public void absen(){
        System.out.println("poktan berhasil absen");
    }

    public String cariketua(String nama){
        return nama;
    }

    public char cariketua(char nama){
        return nama;
    }
}
