**LATIHAN 1**
Eksperimen 1
NotificationService hashCode di OrderService:  411876574
NotificationService hashCode di UserService: 411876574
Apakah hashCode nya SAMA? 411876574 --> hashcodenya sama

Eksperimen 2
Apakah berhasil start? [tidak]
Error message: Execution failed for task ':com.example.springdilab.SpringDiLabApplication.main()'.
> Process 'command 'C:\Users\Lenovo\.jdks\openjdk-25.0.2\bin\java.exe'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights from a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
BUILD FAILED in 3s
3 actionable tasks: 2 executed, 1 up-to-date

setelah dicoba ulang
Apakah sekarang berhasil? [ya]
notification type yang terpakai: @primary

Eskperimen 3
Apakah berhasil start? [tidak]
Error message: Execution failed for task ':com.example.springdilab.SpringDiLabApplication.main()'.
> Process 'command 'C:\Users\Lenovo\.jdks\openjdk-25.0.2\bin\java.exe'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights from a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
BUILD FAILED in 3s
3 actionable tasks: 2 executed, 1 up-to-date

setelah dijalankan ulang
Apakah berhasil start? [ya]
Error message: -

pertanyaan refleksi
1. dengan adanya @SpringBootApplication, spring akan dengan otomatis mengatur konfigurasi dasar, mencari class yang diberi anotasi (@Service, @Controller) lalu menghubungkan objek-objek tersebut tanpa harus menulis kodenya sendiri
2. dengan menggunakan NotificationService bisa membuat kita jadi lebih fleksible, karena nanti tidak akan terikat pada satu jenis implementasi saja (seperti Email). sehingga nanti kalau mau ganti metodenya ke SMS atau ke metode yang lainnya kita tidak perlu mengganti banyak, hanya mengubah sebagian kodenya saja
3. tidak perlu, karena spring mempunya sistem Dependency Injection yang otomatis membuat dan  menghubungkan object sesuai kebutuhan
4. spring tidak kan mengenalinya dan program bisa error


**LATIHAN 2**
pertanyaan refleksi
1. dengan file properties kita bisa mengubah konfigurasi tanpa menyentuh kode rogram, sehingga lebih praktis dan aman
2. denga profile kita tidak perlu mengubah konfigurasi secara manual setiap pindah enviroment, sehingga mengurangi risiko kesalahan seperti salah koneksi ke database production saat masih tahap testing
3. logging.level.root=INFO --> seluruh aplikasi default hanya menampilkan log info level INFO ke atas
   logging.level.com.example=DEBUG --> hanya berlaku untuk package tersebut, sehingga di dalam package itu log DEBUG juga akan tampil
4. karena itu menghasilkan terlalu banyak informasi detail yang tidak selalu diperlukan
5. application-dev.properties, karena spring boot memuat file properties utama terlebih dahulu lalu override nilainya dengan file profile yang sedang aktif