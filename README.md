# Single Responsibility
principle ini digunakan untuk mengatur tanggung jawab dari sebuah entitas yang berada di dalam sebuah proyek dalam hal ini adalah sebuah class.

Tanggung jawab (responsibility) berarti bahwa jika suatu class punya 2 (dua) fungsionalitas yang tak memiliki keterkaitan untuk melakukan suatu perubahan, maka kita harus membagi fungsionalitas yang berbeda tersebut dengan cara memisahkannya menjadi dua class yang berbeda.

# Open/Close
Terbuka untuk ditambahkan adalah keadaan ketika sebuah sistem dapat ditambahkan dengan spesifikasi baru yang dibutuhkan. Sedangkan tertutup untuk dimodifikasi adalah agar ketika ingin menambahkan spesifikasi baru, kita tidak perlu mengubah atau memodifikasi sistem yang telah ada.

Secara umum, penggunaan aturan open/close diterapkan dengan memanfaatkan interface dan abstraksi kelas daripada menggunakan sebuah kelas konkret. Penggunaan interface dan abstraksi kelas bertujuan agar dapat mudah diperbaiki setelah pengembangan tanpa harus mengganggu kelas yang mewarisi dan ketika ingin membuat fungsionalitas baru, cukup dengan membuat kelas baru dan mewarisi interface atau abstraksi tersebut.

# Liskov’s substitution
Liskov’s substitution adalah aturan yang berlaku untuk hirarki pewarisan. Hal ini mengharuskan kita untuk mendesain kelas-kelas yang kita miliki sehingga ketergantungan antar klien dapat disubstitusikan tanpa klien mengetahui tentang perubahan yang ada. Oleh karena itu, seluruh SubClass setidaknya dapat berjalan dengan cara yang sama seperti SuperClass-nya.

Aturan pertama, SubClass harus memiliki sifat contravariant dan covariant.
Selanjutnya adalah aturan preconditions dan postconditions.

# Dependency Inversion Principle
Prinsip Dependency Inversion hampir sama dengan konsep layering dalam aplikasi, di mana low-level modules bertanggung jawab dengan fungsi yang sangat detail dan high-level modules menggunakan low-level classes untuk mencapai tugas yang lebih besar. Hal ini bisa dicapai dengan bergantung pada sebuah abstraksi, ketika ada ketergantungan antar kelas seperti interface, daripada referensi langsung ke kelas lainnya.

Apa yang dimaksud dengan high-level modules dan low-level modules? Agar lebih mudah memahaminya, kita dapat mengkategorikan kelas-kelas menjadi sebuah hirarki. High-level modules adalah kelas-kelas yang berurusan dengan kumpulan-kumpulan fungsionalitas. Pada hirarki tertinggi terdapat kelas-kelas yang mengimplementasikan aturan bisnis sesuai dengan desain yang telah ditentukan. Low-level modules bertanggung jawab pada operasi yang lebih detail. Pada level terendah memungkinkan modul ini untuk bertanggung jawab dalam menulis informasi ke database atau menyampaikan pesan ke sistem operasi.

# Interface Segregation Principle
Prinsip ini sendiri bertujuan untuk mengurangi jumlah ketergantungan sebuah class terhadap interface class yang tidak dibutuhkan. Faktanya, class memiliki ketergantungan terhadap class lainnya. Jumlah ketergantungan dari fungsi pada sebuah interface class yang dapat diakses oleh class tersebut harus dioptimalkan atau dikurangi.

Hal ini berarti bahwa class-class yang saling bergantung dapat berkomunikasi dengan menggunakan interface yang lebih kecil, mengurangi ketergantungan pada fungsi-fungsi yang tidak digunakan dan mengurangi coupling. Dengan menggunakan interface yang lebih kecil akan memudahkan dalam implementasi, meningkatkan fleksibilitas dan juga kemungkinan untuk digunakan kembali (reuse).
