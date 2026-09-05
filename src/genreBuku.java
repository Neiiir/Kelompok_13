public class genreBuku {
    private String idGenre;
    private String namaGenre;

    public genreBuku(String idGenre, String namaGenre){
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
    }

    public String getGenre(){
        return namaGenre;
    }
}
