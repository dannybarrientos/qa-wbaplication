package com.dannybarrientos.stepdefinitions;


import com.dannybarrientos.steps.BlogSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
public class search_by_articleStepDefinition {

    @Steps
    BlogSteps blog;

    @Given("Danny is browsing the article blog")
    public void dannyIsBrowsingTheArticleBlog() {
        blog.openBlog();
    }

    @When("he selects the article to read article")
    public void heSelectsTheArticleToRead(List<Map<String,String>> dataArticles) {
        blog.searchArticle(dataArticles);

    }

    @Then("he should see information about article")
    public void heShouldSeeInformationAboutArticle(List<Map<String,String>> dataArticles) {
        assertThat(blog.shouldArticleOpen(dataArticles));
    }

    @And("he should see by post by author")
    public void heShouldSeeByPostByAuthor(List<Map<String,String>> dataAuthor){
        assertThat(blog.shouldPostbyAutor(dataAuthor));
    }

}
