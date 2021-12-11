@us_008
Feature: US_008 Ana Sayfadaki sifre bolumu guncellenebilir olmalidir.

  @tc_001
  Scenario: TC_001 Sifre degistirilirken eski sifre kullanilmamalidir.
    When Kullanici Gmi Bank sayfasina gider
    Then Sign In butonuna tiklar.
    Then Username ve password bilgilerini girer.
    Then Kendi hesap sayfasindaki password secenegine tiklar.
    Then Mevcut sifresini ve yeni sifresini girer.
    And Mevcut sifre ile ayni yeni sifre girdiginde New password should be different from the current one. uyarisi alir.
    And  Sayfayi kapatir.

    @tc_002
  Scenario: TC_002 Yeni sifre en az 1 kucuk harf icermeli ve guvenlik seviye tablosunun kullanıma gore degistigi gorulmelidir.
    When Kullanici Gmi Bank sayfasina gider
    Then Sign In butonuna tiklar.
    Then Username ve password bilgilerini girer.
    Then Kendi hesap sayfasindaki password secenegine tiklar.
    Then Yeni sifrede en az bir tane kucuk harf kullanir.
    Then Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.
    And  Sayfayi kapatir.