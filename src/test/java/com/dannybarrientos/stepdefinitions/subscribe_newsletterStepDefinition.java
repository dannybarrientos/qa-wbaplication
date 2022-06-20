package com.dannybarrientos.stepdefinitions;

import com.dannybarrientos.steps.BlogSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class subscribe_newsletterStepDefinition {
    @Steps
    BlogSteps blog;

    @When("he into the parameter")
    public void heIntoTheParameter(List<Map<String,String>> email) {
        blog.subscribeEmail(email);
    }

    @Then("he should be presented with the message")
    public void heShouldBePresentedWithTheMessage(List<Map<String,String>> message) {
        assertThat(blog.validationMessage(message));
    }
}
