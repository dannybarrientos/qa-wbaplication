package com.dannybarrientos.steps;

import com.dannybarrientos.pages.BlogPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class BlogSteps {
    @Page
    private BlogPage blog;

    @Step
    public void openBlog() {
        blog.open();
        blog.cookiesAccepted();
    }

    @Step
    public boolean searchArticle(List<Map<String,String>> dataArticles) {
        return blog.searchArticle(dataArticles.get(0).get("article"));
    }
    @Step
    public boolean shouldArticleOpen(List<Map<String,String>> dataArticles) {
        return blog.shouldArticleOpen(dataArticles.get(0).get("article"));
    }
    @Step
    public boolean shouldPostbyAutor(List<Map<String,String>> dataAuthor) {
        return blog.postbyAutor(dataAuthor.get(0).get("author"));
    }
    @Step
    public void subscribeEmail(List<Map<String,String>> subscribes){
         blog.subscribeEmail(subscribes.get(0).get("email"));
    }
    @Step
    public boolean validationMessage(List<Map<String,String>> subscribes){
        return blog.validationMessageSubcribe(subscribes.get(0).get("message"));
    }
}
