public class tipeData {
    public static void main(String[] args) {
        
        String namaSiswa = "Valen";
        char jenisKelamin = 'P';
        int usia= 15;
        double beratBadan = 40.87;
        float tinggiBadan = 155.54f;
        boolean statusSiswa = true;

        String namaGuru, alamat, mapel;
        namaGuru = "Pak Ayat";
        alamat ="Malang";
        mapel ="Informatika";

        int nilaiMatematika = 90;
        int nilaiProduktif=100;
        int nilaiInformatika = 98;

        int hasil = (nilaiMatematika+nilaiProduktif+nilaiInformatika)/3;

        System.out.println("Rata-rata Nilai: "+hasil);


        
        
        System.out.println("===BIODATA SISWA===");
        System.out.println("Nama Siswa: "+namaSiswa);
        System.out.println("Usia Siswa: "+usia);
        System.out.println("Jenis Kelamin :"+jenisKelamin);
        System.out.println("Nama Wali Kelas: "+namaGuru);

    }
}

