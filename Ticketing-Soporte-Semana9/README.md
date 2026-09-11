# Sistema de Ticketing - Soporte TI (Semana 9)

Ultima actualizacion: 10 de septiembre de 2026

Bienvenidos al repositorio de apoyo y entrega para la **Fase 2: Clases en BlueJ** del curso de Programacion 2.

El objetivo principal de este repositorio es modelar e implementar un **Sistema de Gestion de Tickets de Soporte TI** aplicando los principios de la Programacion Orientada a Objetos (POO) en Java utilizando el entorno **BlueJ**, dejando la estructura lista para la posterior transicion a C# (.NET).

## Alcance Del Repositorio

Este repositorio contiene la documentacion metodologica y el codigo fuente en Java correspondiente a la Fase 2 del proyecto: casos de uso, diagrama de flujo, clases del modelo POO y el script de prueba automatizado para la simulacion del sistema.

El material privado de evaluacion docente, archivos compilados `.class` y configuraciones locales no forman parte de este repositorio publico.

## Objetivos Del Repositorio

- Aplicar Herencia y Polimorfismo mediante una clase base abstracta (`Ticket`) y sus subclases (`TicketIncidente` y `TicketRequerimiento`).
- Implementar Encapsulamiento y control de estado en los objetos de negocio.
- Validar restricciones de integridad (IDs unicos) mediante control de excepciones (`try-catch` / `IllegalArgumentException`).
- Administrar colecciones dinamicas en memoria (`List<Ticket>`) para la gestion transaccional.
- Calcular SLAs automaticos y metricas globales/KPIs de soporte tecnico.
- Facilitar la ejecucion de pruebas automatizadas mediante un metodo `main` integrador.

## Estructura

El repositorio se encuentra organizado de la siguiente manera:

```text
SistemaTicketing/
├── BlueJ/       -> Proyecto Java para BlueJ (Ticket, TicketIncidente, TicketRequerimiento, GestionTickets, Main)
├── Draw.io/     -> Diagramas UML de Casos de Uso y Diagramas de Flujo (.drawio / .xml)
├── VS_Code/     -> Archivos y configuracion del proyecto para Visual Studio Code
└── README.md    -> Documentacion principal del repositorio