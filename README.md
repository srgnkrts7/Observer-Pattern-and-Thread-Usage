# Observer Pattern and Thread Usage

Bu projede, bellekte (A, B, C, D, E gibi) 5 adet firmaya ait hisse senetlerinin değerlerinin tutulduğu bir veri yapısı olduğu düşünülmüştür. Gözlemci tasarım desenine uygun olarak farklı firmaların hisse senetlerinin değerlerindeki değişimlerden haberdar olmak isteyen gözlemci nesneler bulunmaktadır.

Subject/Observee tarafındaki bir iş parçası (thread) belli zaman aralıklarında firmalara ait hisse senedi değerlerini rastgele bir şekilde güncelleyecektir.Uygulama çıktısını sonuçlar.txt isimli bir metin dosyasına yazdırılmıştır.
