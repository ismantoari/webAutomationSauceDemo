HomeWork:

Buatlah Web UI testing framework dengan menggunakan Java, Gradle, Selenium dan Cucumber. 
Dalam Test Framework tersebut buatlah automation test scenario pada beberapa feature file untuk website https://www.saucedemo.com/ .
Berikut adalah petunjuk pembuatan automation test skenario

A. Buatlah Scenario Login dan Checkout
User login dengan valid email
User melakukan `add to cart` untuk item `Sauce Labs Bolt T-Shirt`
Validasi cart icon pada kanan atas menampilkan jumlah item yang benar
Click cart icon
Click tombol checkout
Isi alamat pengiriman
Click continue
Click Finish
Validasi gambar “Pony Express Sauce Labs” ditampilkan

B. Buatlah Scenario Login dan Sort Item
User login dengan valid email
User redirect ke homepage
Lakukan Sorting barang dengan kriteria “Price (high to low)”
Validasi bahwa item sudah ter sorting dengan baik

Criteria:
Buatlah Framework dengan approach Page Object Model, buatlah Class Class terpisah untuk masing masing Page dan StepDefinitions nya
Buatlah file feature yang terpisah merepresentasikan masing masing Page
Implementasikan Page Object Model
Gunakan Explicit Wait Method
Gunakan Cucumber Hooks
WebDriver Manager di set pada kondisi non headless
Generate report file dalam bentuk HTML dan Json
Push hasil pekerjaan pada repository milik masing masing

=========================================
Pengerjaan Tugas:
Pengerjaan tugas homework ada pada branch Master
Dengan file Feature:
1. Login.feature
2. Sort.feature
3. Atc.feature
4. Chartpage.feature
5. Checkout.feature
6. Informationpage.feature
7. CheckoutOverview.feature
========================================

