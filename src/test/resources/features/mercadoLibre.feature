#Author: Carlos Enrique Sarmiento Aguilera
@tag
Feature: Inicio Sesión y busqueda de productos de categoria adultos en Mercado Libre

  @CP001
  Scenario Outline: Seleccionar pais
    Given Ingresar a la pagina
    When Seleccionar pais <pais>
    Then Verificar que se ha ingresado al pais correcto

    Examples: 
      | pais       |
      | "Colombia" |

  @CP007
  Scenario Outline: Validar que no se pueda crear una cuenta con un e-mail ya registrado
    Given Ingresar a la pagina
    When Seleccionar pais y crear cuenta <email><pais>
    Then Verificar alerta de que la cuenta ya existe

    Examples: 
      | email                            | pais       |
      | "sarmiento-carlos91@hotmail.com" | "Colombia" |

  @CP008
  Scenario Outline: validar que se genere un pop-up de alerta
    Given Ingresar a la pagina
    When Seleccionar pais y Buscar producto con referencia para Adultos <producto><pais>
    Then Verificar que se visualice un pop-up de alerta por el contenido buscado

    Examples: 
      | producto    | pais       |
      | "caveryect" | "Colombia" |

  @CP010
  Scenario Outline: validar pop-up por busqueda de la palabra adulto
    Given Ingresar a la pagina
    When Seleccionar pais y Buscar producto con la palabra Adulto <palabra><pais>
    Then Verificar que se visualice un pop-up de alerta por el contenido buscado

    Examples: 
      | palabra  | pais       |
      | "Adulto" | "Colombia" |

  @CP011
  Scenario Outline: validar filtro de adultos
    Given Ingresar a la pagina
    When Seleccionar paisy Buscar producto con las letras xxx <letras><pais>
    Then Verificar que no se genere pop-up hasta filtrar por categoria

    Examples: 
      | letras | pais       |
      | "xxx"  | "Colombia" |

  @CP012
  Scenario Outline: validar pop-up por busqueda de la palabra adulto
    Given Ingresar a la pagina
    When Seleccionar pais y Buscar producto con referencia para Adultos <producto><pais>
    Then Verificar que se reinicie busqueda al no aceptar pop-up

    Examples: 
      | producto    | pais       |
      | "caveryect" | "Colombia" |
