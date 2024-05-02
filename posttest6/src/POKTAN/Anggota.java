package POKTAN;

public final class Anggota extends poktan implements poktanDoing{
    protected final String jabatan = "Anggota";
    public Anggota(String nama, int umur){
        super(nama,umur);
    }

    @Override
    public final void absen(){
        System.out.println(jabatan+" berhasil absen"); 
    }

    @Override
    public void setNamaPoktan(String namapoktan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNamaPoktan'");
    }

    @Override
    public void setKetuaPoktan(String ketuapoktan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setKetuaPoktan'");
    }

    @Override
    public void setAlamat(String Alamat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAlamat'");
    }

    @Override
    public String cariketua(String nama) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cariketua'");
    }

    @Override
    public char cariketua(char nama) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cariketua'");
    }

    @Override
    public void tambahAnggota() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambahAnggota'");
    }

}
