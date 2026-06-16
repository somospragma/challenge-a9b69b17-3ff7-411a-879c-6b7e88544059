# Implementación de Patrones GRASP en un Sistema de Gestión de Pedidos

El sistema de gestión de pedidos de una tienda en línea necesita mejorar su estructura y responsabilidades de los componentes para ser más eficiente y mantenible. Se requiere implementar los patrones GRASP de Experto en Información y Creador para asignar responsabilidades de manera adecuada y asegurar que la creación de objetos se realice de forma controlada y eficiente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Patrones GRASP |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Responsabilidades

**Objetivo:** Identificar las responsabilidades de los componentes del sistema de acuerdo a los patrones GRASP.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el sistema de gestión de pedidos y determina qué componente debería ser el Experto en Información para los datos de los pedidos.
- Identifica el componente responsable de crear nuevos pedidos de acuerdo al patrón Creador.

**Entregable:** Mapa de responsabilidades de los componentes del sistema.

<details>
<summary>Pistas de conocimiento</summary>

- Los patrones GRASP ayudan a asignar responsabilidades de manera que el sistema sea más coherente y mantenible.
- El patrón Experto en Información sugiere que los datos deben estar encapsulados en el componente que tiene más conocimiento sobre ellos.

</details>

### Fase 2: Implementación del Patrón Experto en Información

**Objetivo:** Implementar el patrón Experto en Información para los datos de los pedidos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Modifica el componente identificado en la fase anterior para que encapsule los datos de los pedidos y proporcione métodos para acceder y modificar estos datos.

**Entregable:** Componente modificado que implementa el patrón Experto en Información.

<details>
<summary>Pistas de conocimiento</summary>

- El patrón Experto en Información implica que un componente debe tener la responsabilidad exclusiva sobre ciertos datos.
- Proporciona métodos públicos para acceder y modificar los datos, pero mantén la lógica interna encapsulada.

</details>

### Fase 3: Implementación del Patrón Creador

**Objetivo:** Implementar el patrón Creador para la creación de nuevos pedidos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Modifica el componente identificado en la fase anterior para que sea responsable de crear nuevos pedidos, siguiendo el patrón Creador.

**Entregable:** Componente modificado que implementa el patrón Creador.

<details>
<summary>Pistas de conocimiento</summary>

- El patrón Creador sugiere que un componente específico debería ser responsable de la creación de objetos.
- Este componente debe tener el conocimiento necesario para crear los objetos de la manera correcta.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el patrón GRASP de Experto en Información y cómo se aplica en este reto?
- **paraQueSirve**: ¿Para qué sirve el patrón GRASP de Creador en la creación de nuevos pedidos?
- **comoSeUsa**: ¿Cómo se usa el patrón Experto en Información para encapsular los datos de los pedidos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar el patrón Experto en Información?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación del patrón Creador en la creación de nuevos pedidos?

## Criterios de Evaluacion

- Identificación correcta del componente Experto en Información.
- Implementación del patrón Experto en Información para encapsular los datos de los pedidos.
- Identificación correcta del componente Creador.
- Implementación del patrón Creador para la creación de nuevos pedidos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
