package praktikum.sesi10;

public class Main {
    public static void main(String[] args) {
        //Membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //membuat objek persegi dan mengisi properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        //membuat objek lingkaran dan mengisi properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        //membuat objek persegi panjang dan mengisi properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        //membuat objek segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;

        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
