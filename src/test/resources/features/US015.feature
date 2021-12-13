@US_015
Feature: Sistem, kullanıcının kendi hesabını yönetmesine izin vermelidir.

  Scenario: TC_1501 Kullanıcı tüm hesap türlerini ve o hesaplardaki bakiyeyi görmelidir.

    When Kullanici GMI Bank sayfasina gider
    Then Sag ustte bulunan insan figurune tiklar ve ardindan Sign In butonuna tiklar
    And  Acilan formda Username textbox'ini ve New password textbox'ini dogru bir sekilde doldurur
    Then Ardindan Sign in butonuna tiklar
    And  Giris yaptiktan sonra sag ustte bulunan My Operations ikonuna tiklar ve ardindan Manage Accounts butonuna tiklar
    And  Acilan sayfanin Accounts sayfasi oldugunu test eder
    And  Accounts tablosunda Balance sutununun gorunurlugunu test eder
    And  Sayfayi kapatir