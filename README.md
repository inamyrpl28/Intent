# Intent
Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan halaman.
Intent juga merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.

# Method onCreate() 
adalah kondisi awal saat Activity baru diciptakan, biasanya dilakukan inisialisasi pada tahapan ini. Untuk menginisiasi suatu activity, biasanya dipanggil dengan perintah setContentView(int) untuk resource yang didefinisikan di layout UI, dengan perintah findViewById(int) untuk memanggil widget yang dibutuhkan UI untuk berinteraksi dengan aplikasi.

# Method onStop() 
adalah kondisi saat Activity tidak ditampilkan dilayar (biasanya saat pengguna menekan tombol Home). Ini dapat terjadi, misalnya, ketika aktivitas yang baru diluncurkan menutupi seluruh layar. Sistem juga dapat memanggil onStop() ketika aktivitas telah selesai berjalan, dan akan segera dihentikan.
