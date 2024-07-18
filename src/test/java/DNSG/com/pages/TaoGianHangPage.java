package DNSG.com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class TaoGianHangPage {
    private String URLPAGETAOGIANHANG = "https://saigon-business.erp.meu-solutions.com/thong-tin-tai-khoan/doanh-nghiep/gian-hang";

    //My Account
    By myaccount = By.xpath("//div[1]/main/div/div/section/div/div/div/div/span");
    By ThongTinTaiKhoan = By.xpath("//li[contains(text(),'Thông tin tài khoản')]");
    By Thongtingianhang = By.xpath("//div[1]/ul/div[2]/div/div[2]/span");
    By buttonChinhSuGianHang = By.xpath("//div/div[2]/div/div[3]/button");
    By GuiDuyet = By.xpath("//div/div[2]/div/div[3]/button[2]");
    //By inputEmail = By.xpath("//input[@id='email']");
   // By inputPassword = By.xpath("//form/div[3]/div/input");

    public void TaogianhangUser(){
        WebUI.clickElement(myaccount);
        WebUI.clickElement(ThongTinTaiKhoan);
        WebUI.clickElement(Thongtingianhang);
        WebUI.clickElement(buttonChinhSuGianHang);
        WebUI.clickElement(GuiDuyet);
        WebUI.sleep(2);
    }

    By pageQuanLyGianHang = By.xpath("//div/ul/div[6]/div/div[2]/span");
    By btnDuyetGianHang = By.xpath("//div/div[2]/div/div[2]/div/div/div[7]/div/button");
    By btnPheDuyet = By.xpath("//div/div/main/div/div[2]/div[7]/button[1]");
    By logout = By.xpath("//div[1]/main/div/header/div/div/button");
    By inputEmail1 = By.xpath("//input[@id='email']");
    By inputPassword1 = By.xpath("//form/div[3]/div/input");
    public void DuyetGianHang(){
        WebUI.clickElement(pageQuanLyGianHang);
        WebUI.clickElement(btnDuyetGianHang);
        WebUI.sleep(2);
        WebUI.scrollToElementWithJS(btnPheDuyet);
        WebUI.sleep(2);
        WebUI.clickElement(btnPheDuyet);
        WebUI.sleep(10);
        WebUI.clickElement(logout);


    }
    public void verifyTextDuyetgianhang(){

        WebUI.clickElement(myaccount);
        WebUI.clickElement(ThongTinTaiKhoan);
        WebUI.clickElement(Thongtingianhang);
    }
    By textStatusduyet=By.xpath("//main/div/div/div/div[2]/div/div[1]/div[1]/div[2]");
    public void verifyTextduyet(String textStatusDuyetthanhcong) {
    boolean TextStatusduyet = WebUI.getTextElement(textStatusduyet).equals(textStatusDuyetthanhcong);
    Assert.assertTrue(TextStatusduyet, "Fail");
//    By TrangthaiGianHang =By.xpath("//main/div/div/div/div[2]/div/div[1]/div[1]/div[2]");
//    public void verifySttGianHang(String Status) {
//        boolean StatusGH = WebUI.getTextElement(TrangthaiGianHang).equals(Status);
//        Assert.assertTrue(StatusGH, "fail");
   }


}

