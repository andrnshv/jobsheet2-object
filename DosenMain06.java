public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 ds1 = new Dosen06();
        ds1.idDosen = "8845";
        ds1.nama = "Dedy Irvan";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2005;
        ds1.bidangKeahlian = "Sistem Informasi";
        ds1.tampilInformasi();
        ds1.hitungMasaKerja(2025);
        System.out.println();
        ds1.ubahKeahlian("Data Analisis");
        ds1.tampilInformasi();
        System.out.println();

        Dosen06 ds2 = new Dosen06("14900", "Alva Jonathan", false, 1998, "Ilmu Komputer");
        ds2.tampilInformasi();
        ds2.hitungMasaKerja(2007);
        System.out.println();
        ds2.ubahKeahlian("Sistem Informasi");
        ds2.tampilInformasi();
        System.out.println();
    }
}
