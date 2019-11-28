package com.carlos.app.Mercado_libre.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/features/mercadoLibre.feature", glue= {"com.carlos.app.Mercado_libre"})
public class Runner_Mercado {

}

