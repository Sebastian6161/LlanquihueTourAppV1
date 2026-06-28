# 🗺️ LlanquihueTourApp - Agencia de Turismo

## 📝 Descripción
Proyecto desarrollado para la actividad formativa **"Creando jerarquías de clases con herencia simple"** correspondiente a la semana 6 de la asignatura **Desarrollo Orientado a Objetos I** en Duoc UC.

El objetivo principal de esta etapa fue diseñar e implementar una jerarquía de clases robusta utilizando el concepto de herencia en Java. Esto permite modelar de manera eficiente los diferentes tipos de servicios turísticos ofrecidos por la agencia **Llanquihue Tour**, centralizando los atributos comunes en una superclase y especializando el comportamiento en sus respectivas subclases.

---

## 📂 Estructura del Proyecto

El código fuente se encuentra estrictamente organizado por responsabilidades en los siguientes paquetes:

```text
src/
├── data/
│   └── GestorServicios.java       # Creación e impresión de instancias de prueba
├── model/
│   ├── ServicioTuristico.java     # Superclase base
│   ├── RutaGastronomica.java      # Subclase especializada
│   ├── PaseoLacustre.java         # Subclase especializada
│   └── ExcursionCultural.java     # Subclase especializada
└── ui/
    └── Main.java                  # Punto de entrada de la aplicación
```

🛠️ Clases y Componentes Creados:

Paquete model:
ServicioTuristico (Superclase): Define la base de cualquier servicio con los atributos comunes: nombre (String) y duracionHoras (int).

RutaGastronomica (Subclase): Extiende la funcionalidad base agregando el atributo específico numeroDeParadas (int).

PaseoLacustre (Subclase): Extiende la funcionalidad base agregando el atributo específico tipoEmbarcacion (String).

ExcursionCultural (Subclase): Extiende la funcionalidad base agregando el atributo específico lugarHistorico (String).

Paquete data:
GestorServicios: Clase encargada de la lógica de prueba. Instancia dos objetos únicos por cada una de las subclases (6 servicios en total) y gestiona su despliegue estructurado.

Paquete ui:
Main: Contiene el método ejecutable principal (main) que inicializa el flujo del programa.

✨ Funcionalidades e Impacto Técnico
Herencia Simple: Implementación limpia mediante la palabra clave extends.

Reutilización de Constructores: Uso explícito de super(...) en las subclases para inicializar de forma correcta los atributos heredados de la superclase.

Sobrescritura Polimórfica: Uso de la anotación @Override en el método toString() de las subclases, invocando dinámicamente a super.toString() para complementar los datos específicos de cada servicio sin duplicar código.

Consistencia Arquitectónica: Separación de la interfaz de usuario, los datos simulados y el modelo de negocio.

🚀 Instrucciones de Ejecución
Para clonar y ejecutar este proyecto de manera local, sigue estos pasos:

Clona el repositorio en tu máquina local.

Abre la carpeta del proyecto LlanquihueTourApp utilizando tu IDE preferido (ej: IntelliJ IDEA).

Asegúrate de tener configurado un JDK compatible (Java 8 o superior).

Navega en el árbol de carpetas hasta el archivo src/ui/Main.java.

Haz clic derecho sobre el archivo y selecciona Run 'Main.main()'.















