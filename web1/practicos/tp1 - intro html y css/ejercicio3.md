Qué tipos de selectores existen en CSS? Y cuando conviene usar cada uno de ellos?

En css existen tres tipos de selectores:

1. De tipo: Se utiliza directamente el nombre del tag html dentro del archivo css y se colocan sus propiedades. Al utilizar el selector de tipo afectaremos a todos los elementos del mismo tipo

p {
	color: red;
	font-size: 21px;
	font-family: 'Roboto';
}

2. Clase: Se asigna una clase al elemento html utilizando el atributo class="nombre_clase" y luego se lo llama dentro del archivo css utilizando un . y luego el nombre de la clase. Mediante este selector podremos seleccionar multiples elementos que contengan el nombre de la clase y así mejorar nuestro diseño y modularizar los estilos de la pagina. Un archivo html puede contener más de una clase, estas a la hora de crearse se separan con un espacio, Por ejemplo: <p class="parrafo parrafoSecundario">. Este elemento tendrá dos clases, una llamada parrafo, y otra llamada parrafo2.

.parrafo {
	color: red;
	font-size: 21px;
	text-decoration: none;
}

.parrafo2 {
	text-transform: uppercase;
	font-family: Tahoma;
}

También podemos aplicar estilos a más de una clase juntas separandolas por una coma

.parrafo,
.parrafo2 {
	background-color: yellowgreen;
}

3. ID: El selector ID permite modificar un solo elemento html especifico, ya que los id deben ser unicos por pagina web, es decir un elemento que contenga un id en concreto no puede contener el mismo id que otro elemento, Por ejemplo: <h1 id="titulo-main">titulo</h1>. Este selector tiene más utilidad a la hora de utilizar código Javascript.
En css para modificar un elemento ID debemos utilizar el numeral:

#parrafo1 {
	color: lightblue;
}