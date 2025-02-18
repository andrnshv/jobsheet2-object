public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 4;
        mk1.jumlahJam = 9;
        mk1.tampilkanInformasi();
        mk1.tambahJam(2);
        mk1.kurangiJam(12);

    MataKuliah06 mk2 = new MataKuliah06("DB", "Basisdata", 4, 6);
    mk2.tampilkanInformasi();
    mk2.tambahJam(2);
    mk2.kurangiJam(2);
    mk2.tampilkanInformasi();
    }
}
