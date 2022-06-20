package com.dannybarrientos.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/subscribe/subscribe_newsletter.feature",
        glue = "com.dannybarrientos.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class subscribe_newsletterRunner {
}
