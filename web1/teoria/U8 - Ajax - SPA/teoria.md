---------------------------------------
Single Page Application (SPA)
- Es un tipo de apicación web
- Nunca se recarga completamente el navegador
- Los recursos se cargan parcial y dinámicanete cuando lo requiera la página

- Si una pagina no utiliza SPA no significa que es algo malo

---------------------------------------
¿Qué es AJAX? Asynchornus Javascript and XML
Es la tecnica frontend que es base de las aplicaciones web modernas

- No es un lenguaje o tecnologia
- Es una tecnica que combina un set de tecnologias conocidas, para hacer mejorar la experiencia de usuario en las paginas web

---------------------------------------
Hoy en dia entro en desuso la palabra AJAX y nos referimos a ellas como SPA. Las SPA utilizan AJAX para su construcción.
---------------------------------------
Entonces. ¿Que es AJAX?
- Es una técnica de carga asincrona de contenido dinámico y datos del server
- Permite cambios dinámicos del lado del cliente
- Mejora la experiencia de usuario
---------------------------------------
Ventajas:
- Mejora experiencia de usuario
- Mejora la velocidad
- Disminuye el volumen de datos que se transfieren
- No hace recargar todo el contenido, la pagina se vuelve más dinamica
- Mas facil escalar porque solo se agrega parte del contenido
- La peticion puede fallar desventaja o ventaja de acuerdo como se mire
- Mas amigable con el usuario y no confunde con la carga pendiente
- Uso de contenido y datos de otras paginas/aplicaciones

Desventajas:
- Puede fallar, y agrega complejidad
- Sensible a conexión
- Curva de aprendizaje y capacitación
---------------------------------------
Vamos a utilizar dos tecnicas para crear SPA mediante AJAX

- Partial render de páginas
    - Carga un fragmento HTML y lo inserta en nuestro html
- Servicio REST
    - Consulta un objeto JSON y lo procesa del lado del cliente con Javascript
---------------------------------------
Partial render:
Cuando cargamos nuestra pagina cargamos un html inicial y dependiendo de las acciones generadas por el usuario se van a ir cargando los contenidos de forma parcial
---------------------------------------
Ajax en ES7

Se incorpora la interfaz fetch() para llamados ajax

let promise = fetch(url);
promise.then(responde => ...do something)

o la version corta:
fetch(url).then(responde => ...do something)

El uso más simple de fetch() toma un argumento (la ruta del recurso que se quiere traer) y el resultado es una promesa que contiene la respuesta (un objeto Response)
---------------------------------------
Promesas (Son un objeto en JS)
JavaScript es de un solo hilo (mono-thread), es decir, dos porciones de secuencia de comandos no se pueden ejecutar al mismo tiempo. Solamente puede ejecutar uno después del otro

- ES6 introduce promises (promesas en castellano)
- Son un objeto que representa la terminación o el fracaso de una operación asíncrona.
    - Es la forma de implementar asincronismo con JS

    Un paquete que adentro va a tener el resultado asincrónico (en el futuro). Cuando llega lo tenes que desenvolver

