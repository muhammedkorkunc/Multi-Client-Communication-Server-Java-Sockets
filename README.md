# 🌐 Multi-Client Team Communication Server & Client Architecture (Java Sockets)

### Çoklu İstemci Destekleyen Proje Ekibi İletişim Sunucusu ve GUI İstemci Sistemi

Bu depo; Fatih Sultan Mehmet Vakıf Üniversitesi Bilgisayar Mühendisliği **Bilgisayar Ağları (Computer Networks)** dersi kapsamında geliştirilen; soket programlama (Socket Programming), çoklu iş parçacığı (Multi-threading), uçtan uca dosya transferi, anlık mesajlaşma ve proje anahtarı (Project Key) bazlı grup odası mimarisini barındırır.

---

## 🛠️ Sistem Özellikleri & Mimari Bileşenler

| Modül / Özellik               | Açıklama & Ağ Katmanı                                                                                            |
| :---------------------------- | :--------------------------------------------------------------------------------------------------------------- |
| **Soket Sunucusu (Server)**   | TCP/IP tabanlı çoklu istemci bağlantılarını paralel iş parçacıklarında (Threads) yöneten ana sunucu hattı.       |
| **Grup & Proje Yönetimi**     | Tekil proje anahtarı (Project Key) üretimi; anahtarla projeye katılma ve proje ekibi üyelerinin senkronizasyonu. |
| **Dosya Aktarım Motoru**      | TXT, JPG, PNG, PDF ve ikili (binary) formatta dosyaların soket akışları üzerinden kayıpsız iletimi.              |
| **Özel & Ortak Sohbet**       | Proje üyelerinin genel grup kanalında veya seçili üyelerle birebir anlık mesajlaşabilmesi.                       |
| **Zengin Arayüz (Swing GUI)** | Modern kullanıcı listesi (`Item_People`), profil kartları, emoji desteği ve BlurHash görüntü yükleme desteği.    |
| **Canlı Durum Takibi**        | Sunucuya bağlı aktif takım arkadaşlarının gerçek zamanlı tespiti ve listelenmesi.                                |

---

## 📂 Paket ve Dizin Hiyerarşisi

- `src/Main/` : İstemci ve sunucu ana giriş noktaları.
- `src/component/` : Sohbet gövdesi (`Chat_Body`), mesaj baloncukları (`Chat_Left`, `Chat_Right`), dosya ve resim bileşenleri.
- `src/event/` : Olay dinleyicileri (EventChat, EventImageView, PublicEvent).
- `src/form/` : Ana pencere (`Home`), sohbet panelleri (`Chat`), sol/sağ menüler.
- `src/swing/` : Özelleştirilmiş modern Swing bileşenleri (Avatar, kaydırma çubukları, yuvarlak ilerleme çubukları, BlurHash).
- `korumali_rapor/` : Çift katmanlı doğrulanmış yazar filigranına sahip teknik proje raporu.

---

## 🔒 Copyright & License / Telif Hakkı Bildirimi

Bu projedeki tüm Java kaynak kodları, ağ protokolleri, arayüz tasarımları ve proje raporu **Proprietary (Tescilli / Tüm Hakları Saklıdır)** lisansına tabidir.

```text
Copyright (c) 2026 Muhammed Emin Korkunç. All Rights Reserved.

Yazarın açık yazılı izni olmaksızın kısmen veya tamamen kopyalanması,
dağıtılması, çoğaltılması veya ticari/akademik amaçla izinsiz kullanımı kesinlikle yasaktır.
```

👨‍💻 Geliştirici / Author
Muhammed Emin Korkunç

GitHub: @muhammedkorkunc

LinkedIn: Muhammed Emin Korkunç

Email: muhammedemin.korkunc@gmail.com
