package com.capgemini.doug.cukes.integration;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * RunCukes class used for running integration (build) 
 * cucumber tests.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"~@Ignore"}
)
public class RunCukesTest {}