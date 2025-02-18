public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode:" + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int updateSks) {
        sks = updateSks;
    }

    void tambahJam(int jamTambahan) {
        jumlahJam += jamTambahan;
    }

    void kurangiJam(int penguranganJam) {
        if (penguranganJam > 0 && jumlahJam >= penguranganJam) {
            jumlahJam -= penguranganJam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak valid. Jumlah jam tidak boleh nol atau negatif.");
        }
    }

    public MataKuliah06() {
    }

    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
