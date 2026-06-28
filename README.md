# 🗺️ LlanquihueTourApp - Agencia de Turismo

## 📝 Descripción
Proyecto desarrollado para la actividad "Creando jerarquías de clases con herencia simple" de la asignatura Desarrollo Orientado a Objetos I.

El objetivo fue implementar una jerarquía de clases utilizando herencia, reutilizando atributos comunes y especializando funcionalidades para distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

---

## 📂 Organización de Carpetas (Paquetes)

El proyecto está ordenado en tres carpetas según su función:
```text
src/
├── model/     # Contiene las plantillas de los servicios turísticos
├── data/      # Contiene los datos de prueba para revisar que todo funcione
└── ui/        # Contiene el archivo principal para iniciar el programa
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

✨ Funcionalidades implementadas

Herencia simple mediante una superclase.

Uso de atributos heredados.

Uso de super() en constructores.

Sobrescritura del método toString().

Creación de objetos de prueba.

Visualización de resultados por consola.

🚀 Para ejecutar el proyecto:


Abrir el proyecto en IntelliJ IDEA.

Ir al paquete ui.

Abrir Main.java

Ejecutar Main.main()

👤 Autor
Sebastián Ignacio Ávila Sanhueza












