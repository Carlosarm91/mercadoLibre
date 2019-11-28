package com.carlos.app.Mercado_libre.definitions;

import com.carlos.app.Mercado_libre.steps.steps_Mercado;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class definitions_Mercado {

	@Steps
	steps_Mercado steps_Mercado;
	
	@Given("^Ingresar a la pagina$")
	public void ingresar_a_la_pagina() throws Exception {
	 steps_Mercado.ingresar_a_la_pagina();
	}

	@When("^Seleccionar pais \"([^\"]*)\"$")
	public void seleccionar_pais(String pais) throws Exception {
		steps_Mercado.seleccionar_pais(pais);
	}

	@Then("^Verificar que se ha ingresado al pais correcto$")
	public void verificar_que_se_ha_ingresado_al_pais_correcto() throws Exception {
		steps_Mercado.verificar_que_se_ha_ingresado_al_pais_correcto();
	}
	
	@When("^Seleccionar pais y crear cuenta \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_pais_y_crear_cuenta(String email, String pais) throws Exception {
	    steps_Mercado.seleccionar_pais_y_crear_cuenta(email, pais);
	}
	
	@Then("^Verificar alerta de que la cuenta ya existe$")
	public void verificar_alerta_de_que_la_cuenta_ya_existe() throws Exception {
	   steps_Mercado.verificar_alerta_de_que_la_cuenta_ya_existe();
	}

	@When("^Seleccionar pais y Buscar producto con referencia para Adultos \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_pais_y_Buscar_producto_con_referencia_para_Adultos(String producto, String pais) throws Exception {
	    steps_Mercado.seleccionar_pais_y_Buscar_producto_con_referencia_para_Adultos(producto,pais);
	}
	
	@Then("^Verificar que se visualice un pop-up de alerta por el contenido buscado$")
	public void verificar_que_se_visualice_un_pop_up_de_alerta_por_el_contenido_buscado() throws Exception {
	   steps_Mercado.verificar_que_se_visualice_un_pop_up_de_alerta_por_el_contenido_buscado();
	}

	@When("^Seleccionar pais y Buscar producto con la palabra Adulto \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_pais_y_Buscar_producto_con_la_palabra_Adulto(String palabra, String pais) throws Exception {
	  steps_Mercado.seleccionar_pais_y_Buscar_producto_con_la_palabra_Adulto(palabra, pais);
	}
	
	@When("^Seleccionar paisy Buscar producto con las letras xxx \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_paisy_Buscar_producto_con_las_letras_xxx(String letras, String pais) throws Exception {
	    steps_Mercado.seleccionar_paisy_Buscar_producto_con_las_letras_xxx(letras, pais);
	}
	
	@Then("^Verificar que no se genere pop-up hasta filtrar por categoria$")
	public void verificar_que_no_se_genere_pop_up_hasta_filtrar_por_categoria() throws Exception {
	  steps_Mercado.verificar_que_no_se_genere_pop_up_hasta_filtrar_por_categoria();
	}

	@Then("^Verificar que se reinicie busqueda al no aceptar pop-up$")
	public void verificar_que_se_reinicie_busqueda_al_no_aceptar_pop_up() throws Exception {
	    steps_Mercado.verificar_que_se_reinicie_busqueda_al_no_aceptar_pop_up();
	}
		
}
