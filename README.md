# Gestión de Listas Dinámicas con ArrayList (Repaso 11)

Programa en Java que introduce el uso del framework de colecciones para gestionar conjuntos de datos de tamaño variable de forma eficiente.

## 🚀 Funcionalidades
* **Almacenamiento Dinámico:** Utiliza `ArrayList` para permitir que la lista crezca o decrezca según las necesidades del programa, a diferencia de los arrays estáticos.
* **Interfaz de Lista:** Implementa la interfaz `List`, siguiendo las buenas prácticas de programación orientada a interfaces para mayor flexibilidad.
* **Captura de Datos Secuencial:** Emplea un bucle `for` para recolectar múltiples entradas de texto del usuario de manera organizada.
* **Recorrido de Colecciones:** Utiliza el bucle *for-each* para iterar sobre la lista y mostrar los elementos almacenados de forma clara y concisa.

## 🛠️ Estructura técnica
El código destaca por el uso de genéricos y colecciones de Java:
* **Generics (`ArrayList<String>`)**: Asegura la seguridad de tipos, garantizando que la lista solo contenga objetos de tipo cadena de texto.
* **`List<String>`**: Uso del tipo de referencia de la interfaz para promover el desacoplamiento (permite cambiar la implementación a `LinkedList` fácilmente en el futuro).
* **Método `add()`**: Operación fundamental de las colecciones para insertar elementos al final de la estructura.
* **Iteración mejorada**: El bucle *for-each* abstrae el manejo de índices, reduciendo la posibilidad de errores y mejorando la legibilidad.