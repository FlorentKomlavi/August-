package com.pw;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Text_Selector {
    String home = "file:///" + System.getProperty("user.dir") + "\\index.html";
    @Test
    public  void    textSelector()
    {
        try (Playwright pw = Playwright.create())
        {
            BrowserType browsertype = pw.chromium();
            Browser browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
            Page page = browser.newPage();
            page.navigate(home);

            page.click("text = Accueil");
            Assertions.assertEquals(page.title(), "Les Legumes du Terroir");
        }
    }
}
