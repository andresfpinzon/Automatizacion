#language:es
#author: Andres Pinzon

Característica: Búsqueda y compra de un celular en Mercado Libre
  Como usuario de Mercado Libre
  Quiero buscar un celular por categorías y rango de precio
  Para poder agregarlo al carrito e iniciar sesión con mi cuenta de Google

  @busquedaCelularMercadoLibre
  Escenario: Buscar un celular, agregarlo al carrito e iniciar sesión con Google
    Dado que el usuario está en la página principal de Mercado Libre
    Cuando navega a través de las categorías Tecnología, Celulares y Teléfonos y aplica un filtro por precio maximo y minimo
      | valormin |valormax|
      | 700000   |1000000 |
    Y selecciona un celular de la lista de resultados
    Y da clic en el botón Agregar al carrito
    Y da clic en el botón Ingresar
    Y selecciona la opción Continuar con Google
    Y elige la cuenta de Google deseada
    Entonces el usuario debe estar autenticado y ver el producto en el carrito
