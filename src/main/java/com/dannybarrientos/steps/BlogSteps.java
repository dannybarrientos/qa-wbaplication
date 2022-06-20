package com.dannybarrientos.steps;

import com.dannybarrientos.pages.BlogPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class BlogSteps {
    @Page
    private BlogPage blog;

    @Step
    public void openBlog() {
        blog.open();
        blog.cookiesAccepted();
    }

    @Step
    public boolean searchArticle(String s) {

        return blog.searchArticle(s);
    }
    @Step
    public boolean shouldArticleOpen(String s) {
        return blog.shouldArticleOpen(s);
    }
}
