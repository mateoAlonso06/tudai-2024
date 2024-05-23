# Css parte 2 (Herencia y cascada)

1. ¿Que significa herencia y cascada en el contexto de css?

## Herencia
- Es el mecanismo mediante el cual determinadas propiedades de un elemento padre se transmiten a sus elementos hijos.
- Todos los elementos de un documento HTML heredan todas las propiedades heredables de su padre (excepto el elemento raiz, que no tiene padre)

### La herencia nos permite:
- Entender como se definen las reglas visuales de aquellos elementos que no definimos explicitamente en el codigo
- Escribir menos codigo redundante
- Escribir codigo limpio y reutilizable

## Cascada
- La cascada es el mecanismo que controla el resultado final cuando se aplican varias declaraciones CSS contrapuestas (colisiones) al mismo elemento.
- La cascada utiliza un orden de prioridad analizando tres conceptos a la hora de resolver colisiones
1-Importancia
2-Especificidad
3-Orden

2. ¿Cómo se vincula el DOM con los conceptos de herencia y cascada?
El dom se integra en el concepto de herencia y cascada por el hecho de que estamos siempre haciendo referencia a los estilos de los elementos HTML y como su posicion dentro del HTML es importante en tanto a elementos padres, hijos, hermanos, etc...

3. ¿Que es una colision? ¿Cuando se produce y como podemos distinguirla?

Una colision es cuando un mismo elemento recibe mas de una propiedad distinta en 2 o mas reglas css. Por ejemplo:
p {
    color: red;
}

p {
    color: white;
}

4. ¿Como se controla el orden con el que se aplican las declaraciones de estilo CSS?

En caso de que dos reglas tengan la misma importancia y especificidad, la regla que aparece "ultima" en el codigo CSS tiene mayor prioridad.

