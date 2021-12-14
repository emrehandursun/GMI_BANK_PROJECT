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
  Scenario Outline: TC_002 Yeni sifre en az 1 kucuk harf icermeli ve guvenlik seviye tablosunun kullanıma gore degistigi gorulmelidir.
    When Kullanici Gmi Bank sayfasina gider
    Then Sign In butonuna tiklar.
    Then Username ve password bilgilerini girer.
    Then Kendi hesap sayfasindaki password secenegine tiklar.
    Then Yeni sifrede en az bir tane "<kucuk harf>" kullanir.
    Then Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.
    And  Sayfayi kapatir.
    Examples:
      | kucuk harf |
      | d          |
      | den        |
      | deneme     |


  @tc_003
  Scenario Outline: TC_003 Yeni sifre en az 1 buyuk harf icermeli ve guvenlik seviye tablosunun kullanıma gore degistigi gorulmelidir.
    When Kullanici Gmi Bank sayfasina gider
    Then Sign In butonuna tiklar.
    Then Username ve password bilgilerini girer.
    Then Kendi hesap sayfasindaki password secenegine tiklar.
    Then Yeni sifrede en az bir tane "<kucuk harf>" kullanir.
    Then Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.
    Then Yeni sifrede en az bir tane "<buyuk harf>" kullanir.
    Then Guvenlik seviyesi tablo rengi turuncu olur.
    And  Sayfayi kapatir.
    Examples:
      | kucuk harf | buyuk harf |
      | d          | D          |
      | den        | DEN        |
      | deneme     | DENEME     |


  @tc_004
  Scenario Outline: TC_004 Yeni sifre en az 1 rakam  icermeli ve guvenlik seviye tablosunun kullanıma gore degistigi gorulmelidir.
    When Kullanici Gmi Bank sayfasina gider
    Then Sign In butonuna tiklar.
    Then Username ve password bilgilerini girer.
    Then Kendi hesap sayfasindaki password secenegine tiklar.
    Then Yeni sifrede en az bir tane "<kucuk harf>" kullanir.
    Then Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.
    Then Yeni sifrede en az bir tane "<buyuk harf>" kullanir.
    Then Guvenlik seviyesi tablo rengi turuncu olur.
    Then Yeni sifrede en az bir tane "<rakam>" kullanir.
    Then Guvenlik seviyesi tablo rengi sari olur.
    And  Sayfayi kapatir.
    Examples:
      | kucuk harf | buyuk harf | rakam |
      | d          | D          | 1     |
      | den        | DEN        | 123   |
      | deneme     | DENEME     | 12345 |


    @tc_005
    Scenario Outline: TC_005 Yeni şifre en az 1 özel karakter içermeli ve güvenlik seviye tablosunun kullanıma göre değiştiği görülmelidir.
      When Kullanici Gmi Bank sayfasina gider
      Then Sign In butonuna tiklar.
      Then Username ve password bilgilerini girer.
      Then Kendi hesap sayfasindaki password secenegine tiklar.
      Then Yeni sifrede en az bir tane "<kucuk harf>" kullanir.
      Then Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.
      Then Yeni sifrede en az bir tane "<buyuk harf>" kullanir.
      Then Guvenlik seviyesi tablo rengi turuncu olur.
      Then Yeni sifrede en az bir tane "<rakam>" kullanir.
      Then Guvenlik seviyesi tablo rengi sari olur.
      Then Yeni sifrede en az bir tane "<ozel karakter>" kullanir.
      Then Guvenlik seviyesi tablo rengi acik yesil olur.
      And  Sayfayi kapatir.

      Examples:
        | kucuk harf | buyuk harf | rakam | ozel karakter |
        | den        | D          | 1     | *         |












