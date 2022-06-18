package com.dannybarrientos.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/search/search_by_article.feature",
        glue = "com.dannybarrientos.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class search_by_articlerRunner {
}
