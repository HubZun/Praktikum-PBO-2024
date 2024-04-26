package POKTAN;

public abstract class poktan {
    private String namaPoktan, ketuaPoktan, alamat;

    protected poktan(String namaPoktan, String ketuaPoktan, String alamat) {
        this.namaPoktan = namaPoktan;
        this.ketuaPoktan = ketuaPoktan;
        this.alamat = alamat;
    }

    protected poktan(String nama, int umur) {
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

    public abstract void setNamaPoktan(String namapoktan);

    public abstract void setKetuaPoktan(String ketuapoktan);

    public abstract void setAlamat(String Alamat);

    protected abstract void absen();

    protected abstract String cariketua(String nama);

    protected abstract char cariketua(char nama);
}
