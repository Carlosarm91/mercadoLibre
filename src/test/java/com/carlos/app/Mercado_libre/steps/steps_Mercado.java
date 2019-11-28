package com.carlos.app.Mercado_libre.steps;

import com.carlos.app.Mercado_libre.pageObjects.pageObjects_Mercado;
import net.thucydides.core.annotations.Step;

public class steps_Mercado {

	pageObjects_Mercado pageObjects_Mercado;

	@Step
	public void ingresar_a_la_pagina() throws Exception {
		pageObjects_Mercado.open();
	}

	@Step
	public void seleccionar_pais(String pais) throws Exception {
		pageObjects_Mercado.pais(pais);
	}

	@Step
	public void verificar_que_se_ha_ingresado_al_pais_correcto() throws Exception {
		pageObjects_Mercado.confirmarPais();
	}

	@Step
	public void seleccionar_pais_y_crear_cuenta(String email, String pais) throws Exception {
		pageObjects_Mercado.pais(pais);
		pageObjects_Mercado.btnCrearCuenta();
		Thread.sleep(1000);
		pageObjects_Mercado.campoNombre();
		pageObjects_Mercado.campoApellido();
		pageObjects_Mercado.campoEmail(email);
		pageObjects_Mercado.campoClave();
		pageObjects_Mercado.clicCrearCuenta();
	}

	@Step
	public void verificar_alerta_de_que_la_cuenta_ya_existe() throws Exception {
		pageObjects_Mercado.cuentaExiste();
	}

	@Step
	public void seleccionar_pais_y_Buscar_producto_con_referencia_para_Adultos(String producto, String pais) throws Exception {
		pageObjects_Mercado.pais(pais);
		pageObjects_Mercado.campoBuscar(producto);
		pageObjects_Mercado.btnBuscar();
	}

	@Step
	public void verificar_que_se_visualice_un_pop_up_de_alerta_por_el_contenido_buscado() throws Exception {
		pageObjects_Mercado.popupAdulto();
	}

	@Step
	public void seleccionar_pais_y_Buscar_producto_con_la_palabra_Adulto(String palabra, String pais) throws Exception {
		pageObjects_Mercado.pais(pais);
		pageObjects_Mercado.campoBuscar(palabra);
		pageObjects_Mercado.btnBuscar();
	}

	@Step
	public void seleccionar_paisy_Buscar_producto_con_las_letras_xxx(String letras, String pais) throws Exception {
		pageObjects_Mercado.pais(pais);
		pageObjects_Mercado.campoBuscar(letras);
		pageObjects_Mercado.btnBuscar();
	}

	@Step
	public void verificar_que_no_se_genere_pop_up_hasta_filtrar_por_categoria() throws Exception {
		pageObjects_Mercado.masCategorias();
		pageObjects_Mercado.categoriaAdultos();
		pageObjects_Mercado.popupAdulto();
	}

	@Step
	public void verificar_que_se_reinicie_busqueda_al_no_aceptar_pop_up() throws Exception {
		pageObjects_Mercado.cerrarPopup();
		pageObjects_Mercado.limpiarBusqueda();
	}

}