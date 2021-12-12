package com.bankProject.stepDefinitions;

import com.bankProject.pages.*;
import com.bankProject.utilities.*;
import io.cucumber.java.en.*;
import java.util.*;
import static org.testng.AssertJUnit.*;

public class US008Step {

    MainPage mainPage = new MainPage();
    AccountPage accountPage = new AccountPage();
    PasswordPage passwordPage = new PasswordPage();

    @When("Kullanici Gmi Bank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankURL"));
    }

    @Then("Sign In butonuna tiklar.")
    public void sign_in_butonuna_tiklar() {
        mainPage.accountIcon.click();
        mainPage.signIn.click();
    }

    @Then("Username ve password bilgilerini girer.")
    public void username_ve_password_bilgilerini_girer() {
        accountPage.usernameBox.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));
        accountPage.passwordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
        ReusableMethods.waitForVisibility(accountPage.signInButton, 10);
        accountPage.signInButton.click();
    }

    @Then("Kendi hesap sayfasindaki password secenegine tiklar.")
    public void kendi_hesap_sayfasindaki_password_secenegine_tiklar() {
        ReusableMethods.waitForClickablility(accountPage.accountIcon , 10);
        accountPage.accountIcon.click();
        accountPage.passwordInAccountIcon.click();
    }

    @Then("Mevcut sifresini ve yeni sifresini girer.")
    public void mevcut_sifresini_ve_yeni_sifresini_girer() {
        passwordPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
        passwordPage.newPasswordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
        passwordPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
    }

    @Then("Mevcut sifre ile ayni yeni sifre girdiginde New password should be different from the current one. uyarisi alir.")
    public void mevcut_sifre_ile_ayni_yeni_sifre_girdiginde_new_password_should_be_different_from_the_current_one_uyarisi_alir() {
        assertTrue("New password should be different from the current one. isn't displayed"
                , passwordPage.newPasswordShouldBeDifferentFromTheCurrentOne.isDisplayed());
    }


    @Then("Yeni sifrede en az bir tane {string} kullanir.")
    public void yeniSifredeEnAzBirTaneKullanir(String kucukHarf) {
        passwordPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
        passwordPage.newPasswordBox.sendKeys(kucukHarf);


    }

    @Then("Yeni sifrenin guvenlik seviye tablo rengi kirmizi olur.")
    public void yeniSifreninGuvenlikSeviyeTabloRengiKirmiziOlur() {
        assertTrue("Parola guclulugu kirmizi seviyede degil", passwordPage.passwordStrengthRed.isDisplayed());

    }

    @And("Sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("Guvenlik seviyesi tablo rengi turuncu olur.")
    public void guvenlikSeviyesiTabloRengiTuruncuOlur() {
        assertTrue("Parola guclulugu turuncu seviyede degil!" , passwordPage.passwordStrengthOrange.isDisplayed());

    }



}
