package com.dannybarrientos.stepdefinitions;


import com.dannybarrientos.steps.BlogSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;
public class search_by_articlerStepDefinition {

    @Steps
    BlogSteps blog;

    @Given("Danny is browsing the article blog")
    public void dannyIsBrowsingTheArticleBlog() {
        blog.openBlog();
    }

    @When("he selects the article to read <Sort Order>")
    public void heSelectsTheArticleToReadSortOrder() {
        //blog.searchArticle("Why Fintech in Latin America Is Having a Boom");
        blog.searchArticle("What QA automation is all about");

    }

    @Then("he should see information about article")
    public void heShouldSeeInformationAboutArticle() {
        assertThat(blog.shouldArticleOpen("What QA automation is all about"));
    }

    @And("he should see by post by author")
    public void heShouldSeeByPostByAuthor() {
        assertThat(blog.shouldPostbyAutor("Jahzeel Lopez"));
    }

}
