package com.github.funthomas424242.gedcoml.test;

import cuke4duke.annotation.Pending;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import static junit.framework.Assert.assertEquals;

@SuppressWarnings({"UnusedDeclaration"})
public class FamilienbuchFeature {
	
    private String fileName;
    private String name;
    
    @Given("^ist die Datei ([A-z]*)$")
    public void theActionIs(String fileName) {
        this.fileName = fileName;
    }
    
    @When("^Wenn ein Abschnitt beginnt mit Person \\{ ([A-z]*)$ und endet mit \\}")
    public void theSubjectIs(String name) {
        this.name = name;
    }
    @Then("^soll eine Person ([^\\.]*).$ ins Familienbuch aufgenommen werden. ")
    public void theGreetingIs(String name) {
        assertEquals(String.format("%s, %s", fileName, name), name);
    }
}