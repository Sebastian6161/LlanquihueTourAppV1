# LlanquihueTourApp

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I**.

## Descripción

LlanquihueTourApp es una aplicación en Java que representa distintos servicios turísticos de la agencia Llanquihue Tour mediante programación orientada a objetos.

En esta versión (Semana 7) se incorporó el uso de polimorfismo y colecciones genéricas para gestionar distintos tipos de servicios turísticos desde una misma lista.

## Funcionalidades implementadas

- Herencia mediante la superclase `ServicioTuristico`.
- Subclases:
  - RutaGastronomica
  - PaseoLacustre
  - ExcursionCultural
- Sobrescritura del método `mostrarInformacion()`.
- Uso de `@Override`.
- Gestión de servicios mediante `List<ServicioTuristico>`.
- Aplicación de polimorfismo al recorrer la colección.
- Organización del proyecto en paquetes:
  - model
  - data
  - ui

## Estructura del proyecto

```
src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

## Requisitos

- Java JDK 23 o superior.
- IntelliJ IDEA (recomendado).

## Cómo ejecutar

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase `Main` ubicada en el paquete `ui`.
4. El sistema mostrará por consola la información de todos los servicios turísticos utilizando polimorfismo.

## Autor

Sebastián Ignacio Ávila Sanhueza












