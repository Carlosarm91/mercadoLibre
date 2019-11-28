package com.carlos.app.Mercado_libre.pageObjects;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com/")
public class pageObjects_Mercado extends PageObject {

	String compare = "", confirmar = "", cuentaExiste = "", txtAdulto = "";
	String txt_pais = "//li[";
	String txt_confirmarPais = "//html";
	String txt_crearCuenta = "/html[1]/body[1]/header[1]/div[1]/div[1]/nav[2]/a[1]";
	String txt_nombre = "//input[@id='firstName']";
	String txt_apellido = "//input[@id='lastName']";
	String txt_email = "//input[@id='email']";
	String txt_clave = "//input[@id='password']";
	String txt_btnCrearCuenta = "/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/div[2]/button[1]";
	String txt_cuentaExiste = "//span[@class='text__title']";
	String txt_campoBuscar = "//input[@placeholder='Buscar productos, marcas y más…']";
	String txt_btnBuscar = "//button[@class='nav-search-btn']";
	String txt_pop_up = "//h2[contains(@class,'modal__title')]";
	String txt_pop_up2 = "//h2[contains(text(),'Ver resultados para Adultos')]";
	String txt_masCategorias = "//label[@class='see-more-category-filter see-more-filter']";
	String txt_categoriaAdultos = "//label[@class='adults__label']";
	String txt_cerrarPopup = "//label[contains(@class,'adults__modal-close')]";

	public void pais(String pais) {
		for (int i = 1; i <= 18; i++) {
			txt_pais += i + "]";
			compare = find(By.xpath(txt_pais)).getText();
			if (compare.equalsIgnoreCase(pais)) {
				find(By.xpath(txt_pais)).click();
				i = 19;
			}
			txt_pais = "//li[";
		}
	}

	public void confirmarPais() {
		confirmar = find(By.xpath(txt_confirmarPais)).getAttribute("lang");
		String[] part = confirmar.split("-");
		assertEquals("CO", part[1]);
	}

	public void btnCrearCuenta() {
		find(By.xpath(txt_crearCuenta)).click();
	}

	public void campoNombre() {
		find(By.xpath(txt_nombre)).sendKeys("ca");
		;
	}

	public void campoApellido() {
		find(By.xpath(txt_apellido)).sendKeys("sa");
		;
	}

	public void campoEmail(String email) {
		find(By.xpath(txt_email)).sendKeys(email);
		;
	}

	public void campoClave() {
		find(By.xpath(txt_clave)).sendKeys("A2B3C4");
		;
	}

	public void clicCrearCuenta() {
		find(By.xpath(txt_btnCrearCuenta)).click();
	}

	public void cuentaExiste() throws InterruptedException {
		Thread.sleep(2000);
		cuentaExiste = find(By.xpath(txt_cuentaExiste)).getText();
		cuentaExiste = cuentaExiste.substring(0, 9);
		assertEquals("Ya existe", cuentaExiste);
	}

	public void campoBuscar(String busqueda) {
		find(By.xpath(txt_campoBuscar)).sendKeys(busqueda);
	}

	public void btnBuscar() {
		find(By.xpath(txt_btnBuscar)).click();
	}

	public void popupAdulto() throws InterruptedException {
		Thread.sleep(2000);
		if (find(By.xpath(txt_pop_up)).isVisible())
			txtAdulto = find(By.xpath(txt_pop_up)).getText();
		if (find(By.xpath(txt_pop_up2)).isVisible())
			txtAdulto = find(By.xpath(txt_pop_up2)).getText();
		txtAdulto = txtAdulto.substring(20, txtAdulto.length());
		assertEquals("Adultos", txtAdulto);
	}

	public void masCategorias() throws InterruptedException {
		Thread.sleep(2000);
		find(By.xpath(txt_masCategorias)).click();
	}

	public void categoriaAdultos() throws InterruptedException {
		Thread.sleep(2000);
		find(By.xpath(txt_categoriaAdultos)).click();
	}

	public void cerrarPopup() {
		find(By.xpath(txt_cerrarPopup)).click();
	}

	public void limpiarBusqueda() throws InterruptedException {
		Thread.sleep(2000);
		String cl = find(By.xpath(txt_campoBuscar)).getText();
		assertEquals("", cl);
	}
}
