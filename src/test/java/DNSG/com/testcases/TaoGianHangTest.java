package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.TaoGianHangPage;
import org.testng.annotations.Test;
import quangtester.com.helpers.ExcelHelper;

public class TaoGianHangTest extends BaseTest {
    LoginPage loginPage;
    TaoGianHangPage taoGianHangPage;
    ExcelHelper excelHelper;

    @Test(priority = 1)
    public void TaoGianHang(){
        loginPage = new LoginPage();
        taoGianHangPage = new TaoGianHangPage();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        taoGianHangPage.TaogianhangUser();
    }

    @Test(priority = 2)
    public void DuyetGianHang(){
        loginPage = new LoginPage();
        taoGianHangPage = new TaoGianHangPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        taoGianHangPage.DuyetGianHang();
//
//        taoGianHangPage.verifyTextDuyetgianhang();
//        taoGianHangPage.verifyTextduyet("Đang hiển thị");
   }
   @Test(priority = 3)
    public void checkStatusBooth(){
       loginPage = new LoginPage();
       taoGianHangPage = new TaoGianHangPage();
       loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
       taoGianHangPage.verifyTextDuyetgianhang();
       taoGianHangPage.verifyTextduyet("Trạng thái:\n" +
               "Đang hiển thị");
       //taoGianHangPage.verifySttGianHang("Trạng thái: Đang hiển thị");

   }
}
