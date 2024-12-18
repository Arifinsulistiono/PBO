package praktikum.Quiz2;

abstract class Animal {
    protected String nama;
    protected String sifat;
    protected int ukuran;

    // Setter dan Getter untuk atribut
    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }

    public void setUkuran(int ukuran) { this.ukuran = ukuran; }
    public int getUkuran() { return ukuran; }

    public void setSifat(String sifat) { this.sifat = sifat; }
    public String getSifat() { return sifat; }
}

// Interface untuk kemampuan tambahan
interface BisaJalan {
    void setBisaJalan(boolean bisaJalan);
    boolean getBisaJalan();
}

interface BisaTerbang {
    void setBisaTerbang(boolean bisaTerbang);
    boolean getBisaTerbang();
}

// Class Mamalia sebagai subclass dari Animal
class Mamalia extends Animal implements BisaJalan {
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    // Constructor
    public Mamalia(String nama) {
        this.nama = nama;
    }

    // Setter dan Getter untuk kemampuan berjalan
    @Override
    public void setBisaJalan(boolean bisaJalan) { this.bisaJalan = bisaJalan; }
    @Override
    public boolean getBisaJalan() { return bisaJalan; }

    public void setJumlahKaki(int jumlahKaki) { this.jumlahKaki = jumlahKaki; }
    public int getJumlahKaki() { return jumlahKaki; }

    public void setJenisMamalia(String jenisMamalia) { this.jenisMamalia = jenisMamalia; }
    public String getJenisMamalia() { return jenisMamalia; }
}

// Class Aves sebagai subclass dari Animal
class Aves extends Animal implements BisaTerbang {
    private String jenisAves;
    private boolean bisaTerbang;

    // Constructor
    public Aves(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) { this.bisaTerbang = bisaTerbang; }
    @Override
    public boolean getBisaTerbang() { return bisaTerbang; }

    public void setJenisAves(String jenisAves) { this.jenisAves = jenisAves; }
    public String getJenisAves() { return jenisAves; }
}

// Subclass Ayam dari Aves
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) { this.jenisAyam = jenisAyam; }
    public String getJenisAyam() { return jenisAyam; }

    public void setBisaDiadu(boolean bisaDiadu) { this.bisaDiadu = bisaDiadu; }
    public boolean getBisaDiadu() { return bisaDiadu; }
}

// Subclass Merpati dari Aves
class Merpati extends Aves {
    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }
}

public class Hewan {
    public static void main(String[] args) {
        Mamalia mamalia = new Mamalia("Singa");
        mamalia.setJenisMamalia("Karnivora");
        mamalia.setJumlahKaki(4);
        mamalia.setBisaJalan(true);

        System.out.println("Mamalia: " + mamalia.getNama());
        System.out.println("Jenis: " + mamalia.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + mamalia.getJumlahKaki());
        System.out.println("Bisa Jalan: " + mamalia.getBisaJalan());

        // Contoh penggunaan Aves (Ayam)
        Ayam ayam = new Ayam("Ayam Bangkok", 5);
        ayam.setJenisAyam("Petarung");
        ayam.setBisaDiadu(true);

        System.out.println("\nAves Ayam: " + ayam.getNama());
        System.out.println("Jenis Ayam: " + ayam.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());

        // Contoh penggunaan Merpati
        Merpati merpati = new Merpati("Merpati Putih", 2);
        merpati.setBisaTerbang(true);

        System.out.println("\nAves Merpati: " + merpati.getNama());
        System.out.println("Bisa Terbang: " + merpati.getBisaTerbang());
    }
}
