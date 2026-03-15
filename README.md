## Minesweeper (Mayın Tarlası)

Mayın Tarlası, oyuncunun gizli mayınların bulunduğu bir oyun tahtasında güvenli kareleri açmaya çalıştığı bir bulmaca oyunudur. Oyunun amacı, mayın bulunan karelere basmadan tüm güvenli kareleri açmaktır.

Oyuncu bir kare seçtiğinde:

* Eğer karede **mayın varsa oyun sona erer**.
* Eğer karede **mayın yoksa**, karede o hücrenin çevresindeki (üst, alt, sağ, sol ve çapraz) mayın sayısı gösterilir.
* Eğer çevresinde hiç mayın yoksa, komşu boş kareler otomatik olarak açılır.

Oyuncu tüm mayın olmayan kareleri açtığında oyunu kazanır.

Bu projede Mayın Tarlası oyunu **Java dili kullanılarak geliştirilmiştir** ve temel olarak iki boyutlu bir dizi üzerinde mayınların rastgele yerleştirilmesi ve komşu hücrelerin kontrol edilmesi mantığıyla çalışır.
