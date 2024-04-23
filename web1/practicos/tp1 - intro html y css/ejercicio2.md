Para qué sirven los estilos web y cómo se aplican los estilos al contenido de una página web?

Los estilos web son estilos más bien css (cascading style sheet). Mediante este lenguaje podremos estilizar y dar formato a nuestras paginas web permitiendonos desde cambiar el layout de la página como de cambiar los colores, tamaños, etc... de los elementos html, mediante el uso de propiedades css.

Existen tres formas de agregar estilo css a nuestro archivo html, estas son:
1 - Archivo externo: La más recomendada, porque al crear un archivo aparte con las propiedades css podremos realizar una mejor codificación y posterior mantenimiento de la página. Este enlace se incluye dentro del head de la siguiente forma: 
<head>
	<link rel="stylesheet" href="styles.css">
</head>
2 - Archivo interno: Se agrega dentro del head una etiqueta style de apertura y cierre <style></style> donde alojaremos todas las propiedades css. No es recomendable utilizarlo de esta forma ya que el contenido dentro de la etiqueta puede extenderse mucho y generar un archivo html por demás extenso
3 - En linea: Los estilos en linea permiten modificar directamente el estilo de una etiqueta html como un atributo por Ejemplo: <p style="color: red; font-size: 20px;">contenido...</p>. No es recomendable utilizar los estilos en linea ya que su uso se dificulta cuando tenemos que utilizar multiples propiedades y vuelve el código dificil de mantener

