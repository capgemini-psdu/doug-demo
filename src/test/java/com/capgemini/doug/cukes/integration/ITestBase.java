package com.capgemini.doug.cukes.integration;

import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;

import com.capgemini.doug.Application;
import com.capgemini.doug.cukes.TestBase;

/**
 * TestBase class used specifically for integration (build) tests. 
 * Contains all common methods/variables between the feature files for the 
 * integration phase only.
 */
@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
@IntegrationTest
public class ITestBase extends TestBase {

}