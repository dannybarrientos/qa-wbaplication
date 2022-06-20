package com.dannybarrientos.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://blankfactor.com/insights/blog/")
public class BlogPage extends PageObject{

    @FindBy(xpath="//div[@class='posts-list']//h2")
    public List<WebElementFacade> elementItems;

    private static final String stringcontain = "//h2[contains(.,'";
    private static final String strinbtnredmore = "') and @class='heading-4 post-title']/following-sibling::a[@class='btn btn-permalink btn-blue btn-small']";
    private static final String stringTitleArticle = "//h1[contains(text(),'";
    @FindBy(xpath="//h1[@class='heading-3 post-title'")
    public WebElement postTitleArticle;

    @FindBy(xpath="//div[@class='load-more-btn-wrap']")
    public WebElement btnMoreArticle;

    @FindBy(xpath="//div[@class='results']")
    public WebElement resultadoPaginas;

    @FindBy(id="hs-eu-confirmation-button")
    public WebElement continueCookies;

    public boolean searchArticle(String s) {
        return foundArticicle(s);
    }
    public void scrooll(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean foundArticicle(String article){
        if (!searchArticles(article)) {
            scrooll(resultadoPaginas);
            foundArticicle(article);
            return false;
        } else {
            return true;
        }
    }
    public boolean searchArticles(String article) {
        scrooll(resultadoPaginas);
        btnMoreArticle.click();
        for (int i = 0; i< titlesArticle().size(); i++) {
            if (titlesArticle().get(i).equals(article)) {
                $(clickObjet(article)).click();
                return true;
            }
        }
        System.out.println("the pages = " + resultadoPaginas.getText()+" You have "+ titlesArticle().size()+" article");
        return false;
    }

    public List<String> titlesArticle() {
          return elementItems.stream().map(WebElementFacade::getText).collect(Collectors.toList());
    }

    public String clickObjet(String wordSearch) {
        return stringcontain+wordSearch+strinbtnredmore;
    }

    public boolean shouldArticleOpen(String s) {
        return $(stringTitleArticle+s+"')]").getText().equals(s);
    }
    public void cookiesAccepted(){
        continueCookies.click();
    }
}
