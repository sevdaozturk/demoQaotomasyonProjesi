# Form Doğrulama Senaryoları

## Geçersiz e-posta ile gönderim
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Ahmet" adı girilir
* "Yılmaz" soyadı girilir
* "ahmet@" e-posta girilir
* Submit butonuna tıklanır
* E-posta hata mesajı kontrol edilir

## Başarıyla form gönderme (farklı kadın ismi)
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Elif" adı girilir
* "Çetin" soyadı girilir
* "elif.cetin@example.com" e-posta girilir
* Cinsiyet olarak "Female" seçilir
* "5112223344" telefon numarası girilir
* Submit butonuna tıklanır
* Başarı popup'ı kontrol edilir

## Farklı e-posta sağlayıcısı ile başarı
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Merve" adı girilir
* "Aydın" soyadı girilir
* "merve.aydin@gmail.com" e-posta girilir
* Cinsiyet olarak "Female" seçilir
* "5500000011" telefon numarası girilir
* Submit butonuna tıklanır
* Başarı popup'ı kontrol edilir

## Geçersiz telefon numarası girilir (harf içeriyor)
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Can" adı girilir
* "Tuna" soyadı girilir
* "can.tuna@example.com" e-posta girilir
* Cinsiyet olarak "Male" seçilir
* "abc5550000" telefon numarası girilir
* Submit butonuna tıklanır
* Telefon alanı hata mesajı kontrol edilir

## Geçersiz karakterli ad girilir
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "123@!" adı girilir
* "Yılmaz" soyadı girilir
* "test@example.com" e-posta girilir
* Cinsiyet olarak "Male" seçilir
* "5321002003" telefon numarası girilir
* Submit butonuna tıklanır
* Ad alanı hata mesajı (veya engelleme) kontrol edilir

## Sadece zorunlu alanlarla başarı gönderimi
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Ali" adı girilir
* "Demir" soyadı girilir
* "ali.demir@example.com" e-posta girilir
* Cinsiyet olarak "Male" seçilir
* "5320000000" telefon numarası girilir
* Submit butonuna tıklanır
* Başarı popup'ı kontrol edilir

## Telefon alanı boş bırakılır
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Ali" adı girilir
* "Vural" soyadı girilir
* "ali.vural@example.com" e-posta girilir
* Cinsiyet olarak "Male" seçilir
* Submit butonuna tıklanır
* Başarı popup'ı görünmemeli, validasyon kontrol edilir

## Tüm alanlar geçerli bilgilerle doldurulur
* "https://demoqa.com/automation-practice-form" adresine gidilir
* "Ayşe" adı girilir
* "Kaya" soyadı girilir
* "ayse.kaya@example.com" e-posta girilir
* Cinsiyet olarak "Female" seçilir
* "5551234567" telefon numarası girilir
* Submit butonuna tıklanır
* Başarı popup'ı kontrol edilir
