#language:es
#author: Andres Pinzon

Característica: Búsqueda y compra de un celular en Mercado Libre
  Como usuario de Mercado Libre
  Quiero buscar un celular por categorías y rango de precio
  Para poder agregarlo al carrito e iniciar sesión con mi cuenta de Google

  @busquedaCelularMercadoLibre
  Escenario: Buscar un celular, agregarlo al carrito e iniciar sesión con Google
    Dado que el usuario está en la página principal de Mercado Libre
    Cuando navega a través de las categorías , selecciona un telefono y se autentica para realizar la compra
      | valormin |valormax| usuarios                   |clave        |
      | 700000   |1000000 | correoautoprub@gmail.com   |Andres12345! |
    Entonces el usuario debe estar autenticado y ver el producto en el carrito
