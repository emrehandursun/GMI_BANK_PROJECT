package com.bankProject.stepDefinitions;

import com.bankProject.pages.AccountPage;
import com.bankProject.pages.MainPage;
import com.bankProject.pages.PasswordPage;
import com.bankProject.utilities.ConfigReader;
import com.bankProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_015_StepDefinations {

    MainPage mainPage = new MainPage();
    AccountPage accountPage = new AccountPage();
    PasswordPage passwordPage = new PasswordPage();

    @When("Kullanici GMI Bank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("GMIBankURL"));
    }

    @Then("Sag ustte bulunan insan figurune tiklar ve ardindan Sign In butonuna tiklar")
    public void sag_ustte_bulunan_insan_figurune_tiklar_ve_ardindan_sign_in_butonuna_tiklar() {
        accountPage.accountIcon.click();
        accountPage.signIn.click();
    }

    @Then("Acilan formda Username textbox'ini ve New password textbox'ini dogru bir sekilde doldurur")
    public void acilan_formda_username_textbox_ini_ve_new_password_textbox_ini_dogru_bir_sekilde_doldurur() {
        accountPage.usernameBox.sendKeys(ConfigReader.getProperty("GMIBankValidUsername"));
        accountPage.passwordBox.sendKeys(ConfigReader.getProperty("GMIBankValidPassword"));
    }

    @Then("Ardindan Sign in butonuna tiklar")
    public void ardindan_sign_in_butonuna_tiklar() {
        accountPage.signInButton.click();
    }

    @Then("Giris yaptiktan sonra sag ustte bulunan My Operations ikonuna tiklar ve ardindan Manage Accounts butonuna tiklar")
    public void giris_yaptiktan_sonra_sag_ustte_bulunan_my_operations_ikonuna_tiklar_ve_ardindan_manage_accounts_butonuna_tiklar() {
        accountPage.myOperationsIcon.click();
        accountPage.manageAccountsButton.click();
    }

    @Then("Acilan sayfanin Accounts sayfasi oldugunu test eder")
    public void acilan_sayfanin_accounts_sayfasi_oldugunu_test_eder() {
        Assert.assertTrue(accountPage.accountsSayfasiYazisiElementi.isDisplayed());
    }

    @Then("Accounts tablosunda Balance sutununun gorunurlugunu test eder")
    public void accounts_tablosunda_balance_sutununun_gorunurlugunu_test_eder() {
        Assert.assertTrue(accountPage.balanceSutunuYazisiElementi.isDisplayed());
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
