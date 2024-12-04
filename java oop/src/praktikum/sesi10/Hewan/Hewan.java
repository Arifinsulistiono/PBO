package praktikum.sesi10.Hewan;

public class Hewan {
    protected String suara;

        public Hewan(){
            this.suara="suara";
        }

        public void cetak(){
            System.out.println("Hewan Bersuara"+suara);

        }
}

class Mamalia extends Hewan{
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak="beranak";

    }
    public void cetak(){
        System.out.println("Mamalia Berkembang Biak"+berkembangbiak);

    }
}

class Sapi extends Mamalia{
    private String nama;
    private String umur;

    public Sapi(){
        suara="Hemoh..";
        berkembangbiak="Beranak";
        this.nama="Sopi";
        this.umur="1";
    }
    public void cetak(){
        System.out.println("======== Data Hewan Mamalia Sapi ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+berkembangbiak);
           System.out.println("Nama           :"+nama);
            System.out.println("Umur           :"+umur);
    }
}
class Kambing extends Mamalia{
    private String nama;
    private String umur;

    public Kambing(){
        suara="Embek....";
        berkembangbiak="Beranak";
        this.nama="SI Liang";
        this.umur="2";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Mamalia Kambing ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+berkembangbiak);
           System.out.println("Nama           :"+nama);
            System.out.println("Umur           :"+umur);
    }

}
class Unggas extends Hewan{
    protected String berkembangbiak;

    public Unggas(){
        this.berkembangbiak="Bertelur";
    }

    public void cetak(){
        System.out.println("Bertelur");
    }
}
class Burung extends Unggas{
    private String jenis;
    private String ciri;

        public Burung(){
            suara="Mbekur....";
            berkembangbiak="Bertelur";
            this.jenis="Merpati";
            this.ciri="Bulu Putih";
        }

        public void cetak(){
        System.out.println("======== Data Hewan Unggas Burung ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+berkembangbiak);
           System.out.println("Nama           :"+jenis);
            System.out.println("Umur           :"+ciri);
        }
}
class Ayam extends Unggas{
    private String jenis;
    private String ciri;

        public Ayam(){
            suara="Petok-Petok....";
            berkembangbiak="Bertelur";
            this.jenis="Ayam Kampung";
            this.ciri="Bulu Bercorak Putih Hitam";
        }

        public void cetak(){
        System.out.println("======== Data Hewan Unggas Ayam ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+berkembangbiak);
           System.out.println("Nama           :"+jenis);
            System.out.println("Umur           :"+ciri);
        }
}
class Ikan extends Hewan{
    protected String napas;

    public Ikan(){
        this.napas="Insang";
    }

    public void cetak(){
        System.out.println("Insang");
    }
}
class Gurame extends Ikan{
    private String Ciri;
    private String Berat;

        public Gurame(){
            suara="-----";
            napas="Insang";
            this.Ciri="Berwarna Hitam";
            this.Berat="2";
        }

        public void cetak(){
        System.out.println("======== Data Hewan Ikan Gurame ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+napas);
           System.out.println("Nama           :"+Ciri);
            System.out.println("Umur           :"+Berat+" Kg");
        }
}

class Lele extends Ikan{
    private String Ciri;
    private String Berat;

        public Lele(){
            suara="-----";
            napas="Insang";
            this.Ciri="Berwarna Hitam Keputihan";
            this.Berat="3";
        }

        public void cetak(){
        System.out.println("======== Data Hewan Ikan Lele ========");
         System.out.println("Suara         :"+suara);
          System.out.println("Berkembang Biak:"+napas);
           System.out.println("Nama           :"+Ciri);
            System.out.println("Umur           :"+Berat+" Kg");
        }
}
class Pewarisan {
    public static void main(String[] args) {
        Sapi sp1 = new Sapi();
        sp1.cetak();
                    System.out.println("");
                        Kambing kmb1 = new Kambing();
                        kmb1.cetak();
        System.out.println("");
            Burung brg1 = new Burung();
            brg1.cetak();
                System.out.println("");
                        Ayam aym1 = new Ayam();
                        aym1.cetak();
        System.out.println("");
            Gurame grm1 = new Gurame();
            grm1.cetak();
                System.out.println("");
                        Lele ll1 = new Lele();
                        ll1.cetak();        
    } 
}