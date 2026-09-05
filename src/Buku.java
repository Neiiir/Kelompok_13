import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunterbit;
    private String status;
    private genreBuku genre;
    private List<Member> daftarPeminjam;

    public Buku(String idBuku, String judul, String penulis, int tahunterbit, String status, genreBuku genre){
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunterbit = tahunterbit;
        this.status = status;
        this.genre = genre;
        this.daftarPeminjam = new ArrayList<>();
    }

    public void tambahPeminjam(Member mb){
        if(!daftarPeminjam.contains(mb)){
            daftarPeminjam.add(mb);
            mb.pinjamBuku(this);
        }
    }

    public void kurangiPeminjam(Member mb){
        if(daftarPeminjam.contains(mb)){
            daftarPeminjam.remove(mb);
            mb.kembalikanBuku(this);
        }
    }

    public String getidBuku(){
        return idBuku;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public int gettahunterbit(){
        return tahunterbit;
    }

    public String getstatus(){
        return status;
    }

    public String getGenre(){
        return genre.getGenre();
    }

    public void tampilkanPeminjam(){
        System.out.println("Daftar Peminjam " + ":");
        for(Member mb: daftarPeminjam){
            for (int i = 0; i < daftarPeminjam.size(); i++) {
                System.out.println((i+1)+ ". " + mb.getidMember() + " - " + mb.getnama() + " - " + getJudul());
            }
        }
    }
}