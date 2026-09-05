public class Main{
    public static void main(String[] args) {
        Member mb01 = new Member("J0403251156", "Michael", "Bogor", "081211112222");
        genreBuku gb01 = new genreBuku("GB01", "Pemrograman");
        Buku bk01 = new Buku("TPLBK01", "How to Code Easily", "Mark Burger", 2026, "Tersedia", gb01);

        mb01.pinjamBuku(bk01);
        mb01.tampilkanBuku();
        bk01.tampilkanPeminjam();
    }
}