import java.util.ArrayList;
import java.util.List;

public class Member {
    private String idMember;
    private String nama;
    private String alamat;
    private String noTelp;
    private List<Buku> daftarBukuPinjaman;

    public Member(String idMember, String nama, String alamat, String noTelp){
        this.idMember = idMember;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.daftarBukuPinjaman = new ArrayList<>();
    }

    public void pinjamBuku(Buku bk){
        if(!daftarBukuPinjaman.contains(bk)){
            daftarBukuPinjaman.add(bk);
            bk.tambahPeminjam(this);
        }
    }

    public void kembalikanBuku(Buku bk){
        if(daftarBukuPinjaman.contains(bk)){
            daftarBukuPinjaman.remove(bk);
            bk.kurangiPeminjam(this);
        }
    }

    public String getidMember(){
        return idMember;
    }

    public String getnama(){
        return nama;
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Matkul " + nama + ":");
        for(Buku bk: daftarBukuPinjaman){
            for (int i = 0; i < daftarBukuPinjaman.size(); i++) {
                System.out.println((i + 1) + ". " + bk.getidBuku() + " - " + bk.getJudul() + " - "  + bk.getPenulis() + " - " + bk.gettahunterbit() + " - " + bk.getGenre());
            }
        }
    }
}