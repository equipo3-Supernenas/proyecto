# Propuesta de Proyecto: Fitepad

## Titulo del proyecto 🚀

**Fitepad** : Una aplicacion para mantener tus rutinas, compartir rutinas y progresos

## Datos del Equipo 👥

- **Nombre del proyecto:** Fitepad
- **Equipo:** Supernenas 
- **Miembros del equipo:**
  - Ivan
  - Chema
  - Yeray
  - Salvador
  - Ruben
- **Curso**: 2º DAM A - IES Doctor Balmis
- **Fecha de inicio:** Octubre 2026

## Alineacion con los Objetivos de Desarrollo Sostenible (ODS) 🌳

ODS 3: Salud y Bienestar y ODS 12: Producción y Consumo Responsables

## Descripcion del problema ⚠️

La falta de motivacion de las personas para mantener una rutina de deporte y mantener una vida sana y saludable

## Descripcion de la solucion propuesta 🛡️

Una forma de gamificar la vida sana y el ejercicio constante, haciendo que pase de ser una obligacion a algo entretenido y con un aspecto social.

## Actores y roles 🙋

- Usuario deportista 🏋️:  es el actor principal de la aplicación. Puede consultar y realizar rutinas de entrenamiento, registrar los ejercicios completados, controlar su progreso físico y establecer objetivos personales. Además, puede ganar puntos de experiencia (XP), subir de nivel, desbloquear logros, completar misiones y participar en desafíos para mantener la motivación.
- Administrador ⚙️: se encarga de gestionar el funcionamiento de la aplicación, administrar las cuentas de usuario y supervisar el sistema de gamificación. Puede configurar retos, gestionar recompensas, definir logros y niveles, y controlar las clasificaciones para garantizar una experiencia equilibrada y motivadora.
- - Entrenador personal 💪: puede diseñar y recomendar rutinas de entrenamiento, establecer objetivos para los usuarios y realizar un seguimiento de su evolución. También puede crear desafíos personalizados y ayudar a los deportistas a mejorar su rendimiento.

## Arquitectura general 🔄

![imagen de diagrama de clase que usaremos para WPF](https://i.ibb.co/4nhhPKYR/watermarked-img-12139238787631790076.jpg)

## Casos de Uso Principales 💬

| Caso de uso | Descripción | Prioridad |
|---|---|:---:|
| Realizar una rutina | El usuario consulta una rutina, realiza los ejercicios y marca el entrenamiento como completado. | Alta |
| Ganar experiencia y subir de nivel | El usuario gana puntos de experiencia (XP) al completar entrenamientos y retos, sube de nivel y desbloquea logros. | Alta |
| Consultar el progreso | El usuario consulta sus entrenamientos realizados, sus estadísticas y su evolución física. | Alta |
| Completar desafíos | El usuario participa en misiones y retos para conseguir puntos y recompensas adicionales. | Media |
| Consultar clasificaciones | El usuario compara sus puntos con los de otros usuarios y consulta su posición en la clasificación. | Media |
| Personalizar el perfil | El usuario modifica sus datos personales y consulta su nivel, sus puntos y sus logros. | Baja |
| Gestionar rutinas | El administrador o entrenador crea, modifica y elimina rutinas de entrenamiento. | Media |

## Riesgos y Mitigación 🧯

| Riesgo | Mitigación |
|---|---|
| Lesiones por realizar ejercicios incorrectamente | Incluir instrucciones claras, imágenes o vídeos explicativos de los ejercicios y recomendaciones de seguridad. |
| Pérdida de motivación de los usuarios | Utilizar puntos de experiencia (XP), niveles, logros, retos y recompensas para fomentar la constancia. |
| Pérdida de datos de los usuarios | Realizar copias de seguridad periódicas y proteger la información almacenada. |
| Uso fraudulento del sistema de gamificación | Validar los entrenamientos completados para evitar que los usuarios consigan puntos sin realizar las actividades. |
| Acceso no autorizado a las cuentas | Implementar contraseñas seguras y sistemas de autenticación para proteger las cuentas. |
| Errores en las rutinas de entrenamiento | Revisar las rutinas y comprobar que los ejercicios y las instrucciones sean correctos y seguros. |

## Planificación aproximada 🏃


| Sprint | Semanas | Fecha fin | Entregable clave |
| :---: | :---: | :---: | :--- |
| Sprint 1 | Semanas 1 - 2 | 12/11/2026 | Diseño básico de la aplicación, creación de la base de datos y sistema de registro e inicio de sesión. |
| Sprint 2 | Semanas 3 - 4 | 26/11/2026 | Sistema de rutinas, registro de entrenamientos y primeras funciones de gamificación, como puntos de experiencia y niveles. |
| Sprint 3 | Semanas 5 - 6 | 10/12/2026 | Sistema de logros y desafíos, pruebas de funcionamiento, corrección de errores y entrega de la aplicación. |

## Reparto de funcionalidad 📑

- Ivan se encarga de hacer los assets y diseño grafico
- Yeray encargado de las clases de datos de la aplicacion
- Chema se encargaria de la gamificacion de la aplicacion
- Salvador se encarga de los viewmodels y la carga de datos

## Organizacion del repositorio 📄

![imagen de la distribucion actual del repositorio](https://i.ibb.co/5XcCsm4J/Captura-de-pantalla-2026-10-29-124245.png)
