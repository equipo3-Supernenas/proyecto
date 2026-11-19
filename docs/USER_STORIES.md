# Historias de usuario de Fitepad

## 1. Introduccion

Este documento desglosa la propuesta de Fitepad en historias de usuario, criterios de aceptacion y tareas de implementacion. El alcance cubre al deportista, al entrenador personal y al administrador.

La estimacion usa tallas de camiseta:

| Talla | Complejidad orientativa |
|---|---|
| XS | Cambio aislado, de menos de medio dia |
| S | Funcionalidad pequena, de medio dia a uno |
| M | Funcionalidad media, de uno a tres dias |
| L | Funcion amplia con varias capas, de tres a cinco dias |
| XL | Capacidad compleja con varias dependencias, de una a dos sprints |
| XXL | Iniciativa transversal o demasiado amplia; debe subdividirse antes de implementarla |

La talla indicada para cada historia es global. Las tallas de las tareas permiten repartir el trabajo sin confundirlas con horas exactas.

## 2. Supuestos de alcance

- La primera version es una aplicacion Android en Kotlin y Jetpack Compose. WPF es una linea secundaria sin implementacion actual.
- Los datos pueden almacenarse inicialmente en una base local. El documento no presupone el motor concreto hasta que se seleccione la persistencia.
- Nivel, XP, logros y recompensas tienen reglas configurables por el administrador, aunque los valores iniciales deben definirse antes de implementar.
- Las rutinas contienen ejercicios, series, repeticiones, pesos opcionales, descanso e instrucciones de seguridad.
- Un entrenamiento solo otorga XP si esta registrado como valido y completado.
- Las acciones que modifican o eliminan datos muestran confirmacion y solo estan disponibles para usuarios autorizados.

## 3. Epic: identidad y perfil

### HU-001 - Crear una cuenta

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 1
- **Talla:** M

**Historia:** Como usuario deportista, quiero crear una cuenta con mis datos basicos, para guardar mis entrenamientos y conservar mi progreso.

**Criterios de aceptacion:**

1. El formulario solicita como minimo nombre, correo electronico y contrasena.
2. No puede registrarse un correo que no tenga formato valido.
3. La contrasena no puede tener menos de 8 caracteres y debe informar claramente si no cumple el requisito.
4. No se permite registrar dos veces el mismo correo.
5. Al finalizar el registro, el usuario puede iniciar sesion y aparece asociado a su perfil.
6. Los datos se muestran mediante estados de carga, exito o error.

**Tareas:**

- [ ] Crear las pantallas y estados del formulario de registro. **S**
- [ ] Extender los modelos de usuario con los datos necesarios para el registro. **S**
- [ ] Implementar validacion local de nombre, correo y contrasena. **S**
- [ ] Guardar el usuario y evitar duplicados de correo. **M**
- [ ] Crear pruebas unitarias de validacion y persistencia. **S**
- [ ] Crear una prueba de interfaz del flujo correcto y de los errores principales. **M**

**Dependencias:** HU-002.

### HU-002 - Iniciar y cerrar sesion

- **Actor:** Deportista, entrenador personal y administrador
- **Prioridad:** Alta
- **Sprint:** 1
- **Talla:** M

**Historia:** Como usuario registrado, quiero iniciar y cerrar sesion de forma segura, para acceder solo a las funciones permitidas por mi rol.

**Criterios de aceptacion:**

1. El usuario puede iniciar sesion con correo y contrasena validos.
2. Un correo o contrasena incorrectos muestra un mensaje no ambiguo de credenciales invalidas.
3. Un usuario no puede abrir pantallas reservadas a otro rol manipulando la navegacion.
4. Cerrar sesion elimina la sesion activa y vuelve a la pantalla de acceso.
5. Las credenciales no se almacenan en texto plano.
6. Si no existe conexion y se usa autenticacion remota, la aplicacion muestra un error comprensible y no bloquea la interfaz.

**Tareas:**

- [ ] Crear las pantallas y estados de inicio y cierre de sesion. **S**
- [ ] Implementar la autenticacion y el almacenamiento seguro de la sesion. **M**
- [ ] Asociar cada cuenta con su rol. **S**
- [ ] Configurar proteccion de navegacion segun el rol. **M**
- [ ] Probar credenciales correctas, incorrectas y acceso no autorizado. **M**

**Dependencias:** HU-001.

### HU-003 - Personalizar el perfil

- **Actor:** Deportista
- **Prioridad:** Baja
- **Sprint:** 3
- **Talla:** S

**Historia:** Como usuario deportista, quiero modificar mis datos personales y consultar mi nivel, XP y logros, para mantener actualizada mi identidad y ver mi evolucion.

**Criterios de aceptacion:**

1. El usuario puede consultar y editar nombre, edad, altura y peso.
2. Edad, altura y peso rechazan valores negativos o fuera de rangos plausibles definidos por el equipo.
3. Los cambios validos se guardan y se muestran al volver a la pantalla.
4. El perfil muestra nivel, XP total y logros desbloqueados.
5. Solo el propietario y los roles autorizados pueden modificar el perfil.

**Tareas:**

- [ ] Diseñar la pantalla de perfil y edicion. **S**
- [ ] Validar los datos fisicos editables. **S**
- [ ] Guardar y cargar el perfil desde la persistencia. **M**
- [ ] Mostrar nivel, XP y logros existentes. **S**
- [ ] Crear pruebas de validacion y restricciones de acceso. **S**

**Dependencias:** HU-002, HU-006.

## 4. Epic: rutinas y entrenamientos

### HU-004 - Consultar una rutina

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** M

**Historia:** Como usuario deportista, quiero consultar las rutinas disponibles y sus ejercicios, para elegir una adecuada y conocer como realizarla.

**Criterios de aceptacion:**

1. El usuario puede ver una lista de rutinas disponibles.
2. Cada rutina muestra nombre, descripcion, nivel recomendado y lista de ejercicios.
3. Cada ejercicio muestra instrucciones, series, repeticiones o duracion y recomendaciones de seguridad.
4. Las rutinas sin ejercicios no se muestran como completables.
5. Si no existen rutinas, se presenta un estado vacio y una accion comprensible.
6. Las instrucciones de seguridad son visibles antes de iniciar el entrenamiento.

**Tareas:**

- [ ] Crear los modelos de rutina y ejercicio. **M**
- [ ] Crear la lista y el detalle de rutinas. **M**
- [ ] Diseñar el bloque de instrucciones y seguridad. **S**
- [ ] Implementar carga local y estados vacios. **S**
- [ ] Crear pruebas de listados, filtros y rutinas incompletas. **M**

**Dependencias:** HU-009.

### HU-005 - Realizar y registrar una rutina

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** XL

**Historia:** Como usuario deportista, quiero seguir una rutina y marcar los ejercicios realizados, para registrar que he completado el entrenamiento.

**Criterios de aceptacion:**

1. El usuario puede avanzar entre ejercicios de la rutina.
2. Puede marcar cada serie o ejercicio como realizado.
3. El usuario puede cancelar o pausar el entrenamiento sin que se registre como completado.
4. Solo puede finalizar como completado cuando todos los ejercicios requeridos tienen un resultado registrado.
5. El registro incluye fecha, rutina, usuario y duracion o ejercicios completados.
6. Un reintento no genera XP ni logros duplicados.
7. Los cambios se conservan aunque la aplicacion pase a segundo plano.

**Tareas:**

- [ ] Crear el flujo de ejecucion de la rutina. **L**
- [ ] Definir estados de pausa, cancelacion y finalizacion. **M**
- [ ] Implementar el registro de ejercicios y series. **M**
- [ ] Persistir el entrenamiento y conservarlo ante interrupciones. **L**
- [ ] Evitar registros duplicados al confirmar varias veces. **M**
- [ ] Crear pruebas de flujo completo, cancelacion y reintentos. **L**

**Dependencias:** HU-004, HU-006.

### HU-006 - Validar un entrenamiento completado

- **Actor:** Sistema y deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** M

**Historia:** Como sistema, quiero validar los datos del entrenamiento completado, para impedir recompensas falsas o registros incompletos.

**Criterios de aceptacion:**

1. El entrenamiento debe incluir un usuario, una rutina y una fecha.
2. Debe existir al menos un ejercicio completado.
3. No puede completarse una rutina finalizada que tenga ejercicios obligatorios pendientes.
4. Una duracion negativa o no valida rechaza el registro.
5. El sistema registra el motivo si una validacion falla.
6. Solo un registro valido activa la concesion de XP.

**Tareas:**

- [ ] Implementar las reglas de integridad del entrenamiento. **M**
- [ ] Crear el modelo de resultado y motivo de validacion. **S**
- [ ] Integrar la validacion antes de persistir y otorgar recompensas. **M**
- [ ] Crear pruebas de casos validos e invalidos. **M**

**Dependencias:** HU-005.

### HU-009 - Gestionar rutinas

- **Actor:** Entrenador personal y administrador
- **Prioridad:** Media
- **Sprint:** 2
- **Talla:** XL

**Historia:** Como entrenador personal o administrador, quiero crear, modificar y eliminar rutinas, para mantener disponible un catalogo seguro y actualizado.

**Criterios de aceptacion:**

1. Solo usuarios con rol entrenador o administrador pueden crear o editar rutinas.
2. Una rutina requiere nombre, descripcion y al menos un ejercicio.
3. Cada ejercicio requiere nombre e instrucciones; los campos numericos deben ser positivos.
4. Las modificaciones se muestran tras guardarse y los errores no pierden el formulario.
5. Eliminar una rutina pide confirmacion y advierte si tiene registros asociados.
6. Los errores no permiten guardar una rutina incompleta.
7. Las rutinas eliminadas no quedan disponibles para nuevos entrenamientos.

**Tareas:**

- [ ] Crear formularios de alta y edicion de rutinas. **L**
- [ ] Crear formulario de gestion de ejercicios dentro de la rutina. **L**
- [ ] Implementar validacion y persistencia. **L**
- [ ] Implementar eliminacion segura y confirmacion. **S**
- [ ] Aplicar restricciones por rol. **M**
- [ ] Crear pruebas unitarias y de interfaz de gestion. **L**

**Dependencias:** HU-002, HU-004.

### HU-010 - Mostrar instrucciones de seguridad

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** S

**Historia:** Como usuario deportista, quiero ver instrucciones y recomendaciones de seguridad junto a cada ejercicio, para reducir el riesgo de realizarlo incorrectamente.

**Criterios de aceptacion:**

1. Los ejercicios muestran instrucciones siempre que existan.
2. El texto incluye tecnica basica y recomendaciones de precaucion cuando estan disponibles.
3. Las imagenes o videos, si existen, tienen texto alternativo o descripcion.
4. Una rutina no puede publicarse sin contenido minimo de seguridad aprobado por el entrenador o administrador.
5. La informacion permanece visible durante la ejecucion del ejercicio.

**Tareas:**

- [ ] Definir el componente visual de seguridad. **S**
- [ ] Incorporar instrucciones al modelo y formularios. **S**
- [ ] Integrar imagenes o videos de forma opcional. **M**
- [ ] Crear validaciones y pruebas de contenido obligatorio. **S**

**Dependencias:** HU-009.

## 5. Epic: gamificacion y motivacion

### HU-007 - Obtener XP y subir de nivel

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** L

**Historia:** Como usuario deportista, quiero ganar XP al completar entrenamientos validos y subir de nivel, para sentir progreso y mantener la motivacion.

**Criterios de aceptacion:**

1. Un entrenamiento valido concede la cantidad de XP configurada una sola vez.
2. Los niveles se calculan segun el total acumulado y las reglas configuradas.
3. Al superar el umbral configurado, el nivel aumenta y el cambio es visible.
4. Al cumplir varias condiciones a la vez, la aplicacion aplica cada recompensa una sola vez.
5. Reintentos o registros duplicados no generan XP adicional.
6. El perfil muestra XP actual, XP total y nivel actual.

**Tareas:**

- [ ] Crear los modelos de XP, nivel y reglas de concesion. **M**
- [ ] Implementar el calculo y persistencia de nivel y XP. **L**
- [ ] Integrar la concesion con el registro validado. **M**
- [ ] Crear un componente visual de progreso y subida de nivel. **M**
- [ ] Añadir pruebas de umbrales, duplicados y condiciones combinadas. **L**

**Dependencias:** HU-006, HU-014.

### HU-008 - Desbloquear logros

- **Actor:** Deportista
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** L

**Historia:** Como usuario deportista, quiero desbloquear logros al cumplir hitos, para obtener reconocimiento por mi constancia.

**Criterios de aceptacion:**

1. Los logros pueden requerir entrenamientos, XP, niveles o desafios completados.
2. Al cumplir una condicion por primera vez, el logro pasa a desbloqueado.
3. El mismo logro no se vuelve a desbloquear ni concede una recompensa adicional.
4. El perfil diferencia logros desbloqueados y pendientes.
5. El desbloqueo muestra una confirmacion visual sin bloquear otras acciones.

**Tareas:**

- [ ] Crear el modelo de logro y sus condiciones. **M**
- [ ] Implementar el motor basico de evaluacion de logros. **L**
- [ ] Persistir estado y fecha de desbloqueo. **M**
- [ ] Añadir representacion visual de logros. **M**
- [ ] Crear pruebas de evaluacion y desbloqueo unico. **M**

**Dependencias:** HU-007, HU-011, HU-014.

### HU-011 - Participar en misiones y desafios

- **Actor:** Deportista
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** XL

**Historia:** Como usuario deportista, quiero participar en misiones y desafios, para conseguir puntos y recompensas adicionales.

**Criterios de aceptacion:**

1. El usuario puede consultar desafios activos y sus requisitos.
2. Cada desafio muestra progreso actual, fecha limite y recompensa.
3. El progreso solo cambia por acciones validas realizadas por el usuario.
4. Al cumplir el desafio, se concede su recompensa una sola vez.
5. Los desafios vencidos dejan de permitir nuevas contribuciones.
6. El usuario puede consultar resultados vencidos o completados.

**Tareas:**

- [ ] Crear los modelos de desafio, progreso y recompensa. **L**
- [ ] Crear listado y detalle de desafios. **L**
- [ ] Integrar progreso con entrenamientos y eventos validos. **L**
- [ ] Conceder recompensas una sola vez. **M**
- [ ] Gestionar fechas de inicio y vencimiento. **M**
- [ ] Crear pruebas de progreso, vencimiento y duplicados. **L**

**Dependencias:** HU-006, HU-007, HU-012.

### HU-012 - Gestionar desafios y recompensas

- **Actor:** Entrenador personal y administrador
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** XL

**Historia:** Como entrenador o administrador, quiero configurar desafios, recompensas y objetivos personalizados, para adaptar la motivacion de los deportistas.

**Criterios de aceptacion:**

1. Solo roles autorizados pueden crear o editar desafios.
2. Un desafio requiere nombre, descripcion, objetivo, fechas y recompensa.
3. Las fechas de inicio y fin deben ser coherentes.
4. El entrenador solo gestiona objetivos asociados a sus deportistas.
5. El administrador puede gestionar retos globales y recompensas.
6. La modificacion o eliminacion pide confirmacion y no deja recompensas duplicadas.

**Tareas:**

- [ ] Crear los formularios de desafio y recompensa. **L**
- [ ] Validar objetivos y fechas. **M**
- [ ] Aplicar restricciones por rol y asignacion. **L**
- [ ] Implementar persistencia y estados de desafio. **L**
- [ ] Crear pruebas de permisos y configuracion. **L**

**Dependencias:** HU-002, HU-011, HU-014.

## 6. Epic: progreso y competicion

### HU-013 - Consultar el progreso

- **Actor:** Deportista
- **Prioridad:** Alta
- **Sprint:** 2
- **Talla:** L

**Historia:** Como usuario deportista, quiero consultar mis entrenamientos, estadisticas y evolucion fisica, para conocer si estoy alcanzando mis objetivos.

**Criterios de aceptacion:**

1. La pantalla muestra los entrenamientos completados, con fecha y rutina.
2. Las estadisticas incluyen al menos numero de entrenamientos y tiempo o volumen acumulado disponible.
3. El usuario puede elegir un periodo de consulta definido.
4. El usuario puede establecer objetivos personales y ver su avance.
5. Los periodos sin datos muestran un estado vacio.
6. Los datos mostrados corresponden al usuario autenticado.

**Tareas:**

- [ ] Crear los modelos y consultas de estadisticas. **L**
- [ ] Crear los componentes de progreso y evolucion. **L**
- [ ] Permitir filtrar por periodos. **M**
- [ ] Implementar objetivos personales y su calculo. **M**
- [ ] Crear pruebas de filtros, periodos vacios y aislamiento por usuario. **L**

**Dependencias:** HU-005, HU-006.

### HU-015 - Consultar clasificaciones

- **Actor:** Deportista
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** M

**Historia:** Como usuario deportista, quiero consultar las clasificaciones y mi posicion, para comparar mi progreso con otros usuarios.

**Criterios de aceptacion:**

1. La clasificacion se calcula con los puntos o XP visibles en el periodo seleccionado.
2. Cada entrada muestra nombre publico, nivel y puntos.
3. La posicion del usuario autenticado esta claramente identificada.
4. Los datos de usuarios privados no se muestran.
5. La clasificacion puede cambiar periodicamente segun las reglas configuradas.
6. Si no existen datos suficientes, se muestra un estado vacio.

**Tareas:**

- [ ] Definir el modelo y periodo de la clasificacion. **M**
- [ ] Implementar el calculo y ordenacion de posiciones. **M**
- [ ] Crear la interfaz de clasificacion. **S**
- [ ] Aplicar campos visibles y privacidad basica. **M**
- [ ] Crear pruebas de empate, ordenacion y datos privados. **M**

**Dependencias:** HU-007, HU-014.

### HU-016 - Seguir la evolucion de deportistas

- **Actor:** Entrenador personal
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** L

**Historia:** Como entrenador personal, quiero consultar la evolucion y objetivos de mis deportistas, para ayudarlos a mejorar su rendimiento.

**Criterios de aceptacion:**

1. El entrenador solo puede consultar deportistas asignados.
2. Puede ver entrenamientos completados, estadisticas y objetivos.
3. Puede consultar retos personalizados asociados al deportista.
4. Las notas o recomendaciones solo las editan roles autorizados.
5. Los datos no autorizados no aparecen en la pantalla.

**Tareas:**

- [ ] Definir la relacion entrenador-deportista. **M**
- [ ] Crear la vista de seguimiento y estadisticas. **L**
- [ ] Aplicar filtros de autorizacion por asignacion. **M**
- [ ] Añadir objetivos y recomendaciones. **M**
- [ ] Crear pruebas de acceso autorizado y denegado. **L**

**Dependencias:** HU-002, HU-013, HU-012.

## 7. Epic: administracion y mantenimiento

### HU-014 - Administrar la configuracion de gamificacion

- **Actor:** Administrador
- **Prioridad:** Alta
- **Sprint:** 3
- **Talla:** XL

**Historia:** Como administrador, quiero configurar retos, recompensas, niveles y clasificaciones, para garantizar un sistema de gamificacion equilibrado.

**Criterios de aceptacion:**

1. Solo un administrador puede modificar las reglas globales de XP y nivel.
2. Los cambios requieren nombres, valores positivos y rangos coherentes.
3. La configuracion previa sigue activa si se intenta guardar una configuracion invalida.
4. Las modificaciones muestran confirmacion y quedan registradas.
5. Las clasificaciones pueden definirse como periodicas o globales segun la opcion disponible.
6. Los datos historicos no se recalculan silenciosamente al cambiar una regla.

**Tareas:**

- [ ] Crear el modelo de configuracion de gamificacion. **L**
- [ ] Diseñar la pantalla de configuracion. **L**
- [ ] Validar reglas, umbrales y valores. **M**
- [ ] Persistir cambios y conservar la configuracion anterior ante errores. **L**
- [ ] Registrar cambios administrativos. **M**
- [ ] Crear pruebas de permisos y configuraciones invalidas. **L**

**Dependencias:** HU-002.

### HU-017 - Administrar cuentas

- **Actor:** Administrador
- **Prioridad:** Media
- **Sprint:** 3
- **Talla:** L

**Historia:** Como administrador, quiero consultar y gestionar las cuentas de usuario, para mantener el sistema seguro y mantener actualizados los roles.

**Criterios de aceptacion:**

1. Solo los administradores pueden abrir la gestion de cuentas.
2. La lista permite consultar nombre, correo, rol y estado.
3. El administrador puede activar o desactivar una cuenta.
4. El administrador puede asignar o retirar roles autorizados.
5. El administrador no puede desactivar su propia cuenta de administrador desde esa accion.
6. Toda accion sensible pide confirmacion y registra el cambio.

**Tareas:**

- [ ] Crear el listado y detalle de cuentas. **M**
- [ ] Implementar activacion y desactivacion. **M**
- [ ] Implementar asignacion de roles. **M**
- [ ] Añadir confirmacion y registro administrativo. **S**
- [ ] Crear pruebas de permisos y casos prohibidos. **L**

**Dependencias:** HU-002.

### HU-018 - Respaldar y recuperar datos

- **Actor:** Sistema y administrador
- **Prioridad:** Alta
- **Sprint:** 1
- **Talla:** XL

**Historia:** Como sistema, quiero respaldar los datos y permitir su recuperacion, para reducir el riesgo de perder el progreso de los usuarios.

**Criterios de aceptacion:**

1. Los datos guardados se incluyen en una estrategia de respaldo definida.
2. La operacion informa si el respaldo se ha completado o ha fallado.
3. Restaurar datos requiere rol administrador y confirmacion.
4. Antes de restaurar se conserva una copia del estado actual.
5. Los datos restaurados mantienen integridad y relaciones entre usuarios, rutinas y entrenamientos.
6. Los usuarios reciben un estado comprensible si la persistencia no esta disponible.

**Tareas:**

- [ ] Seleccionar la estrategia local o remota de persistencia. **L**
- [ ] Definir formato y frecuencia de respaldo. **M**
- [ ] Implementar exportacion y restauracion. **XL**
- [ ] Validar integridad antes y despues de restaurar. **L**
- [ ] Crear copia previa automatica antes de restaurar. **M**
- [ ] Crear pruebas de errores y recuperacion. **L**

**Dependencias:** HU-001, HU-005.

## 8. Resumen y planificacion

| ID | Historia resumida | Actor | Prioridad | Sprint | Talla |
|---|---|---|---|---|---|
| HU-001 | Crear una cuenta | Deportista | Alta | 1 | M |
| HU-002 | Iniciar y cerrar sesion | Todos | Alta | 1 | M |
| HU-003 | Personalizar el perfil | Deportista | Baja | 3 | S |
| HU-004 | Consultar una rutina | Deportista | Alta | 2 | M |
| HU-005 | Realizar y registrar una rutina | Deportista | Alta | 2 | XL |
| HU-006 | Validar un entrenamiento | Sistema/Deportista | Alta | 2 | M |
| HU-007 | Obtener XP y subir de nivel | Deportista | Alta | 2 | L |
| HU-008 | Desbloquear logros | Deportista | Media | 3 | L |
| HU-009 | Gestionar rutinas | Entrenador/Administrador | Media | 2 | XL |
| HU-010 | Mostrar seguridad de ejercicios | Deportista | Alta | 2 | S |
| HU-011 | Participar en desafios | Deportista | Media | 3 | XL |
| HU-012 | Gestionar desafios | Entrenador/Administrador | Media | 3 | XL |
| HU-013 | Consultar progreso | Deportista | Alta | 2 | L |
| HU-014 | Configurar gamificacion | Administrador | Alta | 3 | XL |
| HU-015 | Consultar clasificaciones | Deportista | Media | 3 | M |
| HU-016 | Seguir deportistas | Entrenador | Media | 3 | L |
| HU-017 | Administrar cuentas | Administrador | Media | 3 | L |
| HU-018 | Respaldar datos | Sistema/Administrador | Alta | 1 | XL |

### Secuenciacion recomendada

1. **Sprint 1:** HU-001, HU-002, HU-018.
2. **Sprint 2:** HU-004, HU-005, HU-006, HU-007, HU-009, HU-010, HU-013.
3. **Sprint 3:** HU-003, HU-008, HU-011, HU-012, HU-014, HU-015, HU-016, HU-017.

Las historias XL deben repartirse en varias tareas o issues antes de iniciar su implementacion. Las tareas largas no forman parte de una unica asignacion directa si no caben en una iteracion.
