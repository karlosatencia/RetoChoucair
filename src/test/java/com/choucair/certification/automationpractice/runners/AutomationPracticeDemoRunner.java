package com.choucair.certification.automationpractice.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automationPracticeDemo.feature",
        glue = {"com.choucair.certification.automationpractice.stepsdefinitions"},
        tags = "@ComprarProducto",
        snippets = SnippetType.CAMELCASE
)

public class AutomationPracticeDemoRunner {
}
