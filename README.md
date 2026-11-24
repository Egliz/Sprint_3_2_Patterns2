# Design Patterns - 2

El objetivo de este proyecto es aprender a implementar diferentes patrones de diseño, comprendiendo cómo ayudan a organizar el código, reducir el acoplamiento y facilitar su mantenimiento y extensión.

El proyecto está dividido en tres niveles, cada uno dedicado a un patrón de diseño diferente:

- Builder: patrón creacional.
- Observer: patrón de comportamiento.
- Decorator: patrón estructural.

## Estructura del proyecto


```text
src/
├── main/
│   └── java/
│       ├── level_1.fluent_builder_pattern/
│       │   ├── interfaces_with_steps/
│       │   │   ├── BuildStep.java
│       │   │   ├── EntrantPropertiesStep.java
│       │   │   ├── GlutenStep.java
│       │   │   ├── MainCoursePropertiesStep.java
│       │   │   ├── MenuStartStep.java
│       │   │   ├── SupplementStep.java
│       │   │   └── VeganStep.java
│       │   ├── Main.java
│       │   ├── Menu.java
│       │   ├── MenuBuilder.java
│       │   └── Supplement.java
│       │
│       ├── level_2.observer_pattern/
│       │   ├── Main.java
│       │   ├── Observer.java
│       │   ├── StockAgent.java
│       │   └── StockBrokerAgency.java
│       │
│       └── level_3.decorator_pattern/
│           ├── decorations/
│           │   ├── Flavor.java
│           │   ├── Ice.java
│           │   ├── Sugar.java
│           │   └── Tapioca.java
│           ├── BubbleTea.java
│           ├── BubbleTeaDecorator.java
│           ├── LatteBase.java
│           ├── Main.java
│           ├── MatchaBase.java
│           └── TeaBase.java
│
└── test/
    └── java/
        ├── level_1.fluent_builder_pattern/
        │   └── MenuBuilderTest.java
        │
        ├── level_2.observer_pattern/
        │   └── StockAgentTest.java
        │
        └── level_3.decorator_pattern/
            └── BubbleTeaDecoratorTest.java
```

## Tecnologías

- Java 21
- IntelliJ IDEA
- Maven
- JUnit 5
- Git y GitHub



## Instalación y ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Comprobar que está configurado Java 21.
4. Ejecutar los tests unitarios con Maven:

```bash
mvn test
```


---
## Nivel 1 – Builder

### Ejercicio Fluent Builder – Menu

Implementación de un sistema de construcción de menús de restaurante utilizando el patrón Builder con estilo Fluent Builder.

El objetivo es construir diferentes tipos de menús paso a paso, permitiendo configurar sus ingredientes y características sin utilizar constructores largos.

El sistema permite:

- Añadir entrantes, platos principales, postres y bebidas.
- Configurar platos como veganos y/o aptos para celíacos.
- Añadir suplementos al plato principal.
- Crear menús completos, infantiles y medios menús.

Las interfaces limitan las opciones disponibles durante la construcción, garantizando que se sigan los pasos establecidos.

## Nivel 2 – Observer

### Ejercicio Stock Market Notifications

Implementación de un sistema de notificaciones de cambios en la bolsa utilizando el patrón Observer.

El objetivo es que un agente de bolsa (`StockAgent`) notifique automáticamente a las agencias suscritas cuando se produce una subida o bajada en el valor de las acciones.

Se define la interfaz `Observer`, que establece el método común para recibir notificaciones. La clase `StockAgent` mantiene las referencias a sus observadores y permite añadirlos o eliminarlos dinámicamente.

La clase `StockBrokerAgency` implementa la interfaz y muestra por pantalla los mensajes recibidos.

## Nivel 3 – Decorator

### Ejercicio Bubble Tea

Implementación de un sistema de personalización de Bubble Tea utilizando el patrón Decorator.

El objetivo es añadir ingredientes a diferentes bebidas base sin tener que crear una subclase para cada combinación posible.

Se define la interfaz `BubbleTea`, que establece los métodos para obtener la descripción y el coste de la bebida. Las clases `LatteBase`, `MatchaBase` y `TeaBase` representan las bebidas iniciales.

La clase abstracta `BubbleTeaDecorator` permite envolver una bebida existente. Cada decorador concreto añade un ingrediente y su correspondiente suplemento al precio:

- `Ice`: añade 0.25 €.
- `Sugar`: añade 0.30 €.
- `Tapioca`: añade 0.50 €.
- `Flavor`: añade 0.60 € por cada sabor añadido.

Los decoradores permiten combinar diferentes ingredientes y calcular dinámicamente la descripción y el coste total de la bebida.

## Tests unitarios

Cada ejercicio incluye tests unitarios con JUnit 5 para comprobar el funcionamiento de sus implementaciones y verificar los resultados esperados.