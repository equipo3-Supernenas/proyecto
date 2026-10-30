# Prompt para Generación / UI Design: App de Gimnasio RPG (FitQuest)

## 📌 Contexto del Proyecto
Actúa como un diseñador de interfaz de usuario (UI/UX) y desarrollador Android Senior especialista en aplicaciones gamificadas. Diseña la interfaz visual y la estructura de una aplicación móvil de gimnasio con temática **RPG (Role Playing Game)**. La aplicación transforma la rutina de entrenamiento del usuario en un sistema de misiones, rangos y estadísticas.

---

## 🎨 Guía de Estilo Visual
- **Gama Cromática:**
  - **Color Primario (Fondo):** Negro Puro / Negro Carbón (`#0B0B0B`, `#121212`) para un look moderno y dark-mode nativo.
  - **Color Secundario / Acento:** Verde Eléctrico / Neón (`#00FF66`, `#39FF14`) para resaltar elementos interactivos, botones de acción, progreso, bordes activos y efectos "glow".
  - **Colores Secundarios de Apoyo:** Gris Oscuro (`#1E1E1E`, `#2A2A2A`) para tarjetas/módulos y Blanco (`#FFFFFF`) / Gris Claro (`#A0A0A0`) para texto e iconografía.
- **Estilo:** Cyberpunk / Gamer minimalista, con bordes definidos, barras de estado luminosas y tipografía *sans-serif* deportiva/futurista.

---

## 📱 Navegación Global
En la parte inferior de todas las pantallas principales (excepto la pantalla de carga), debe incluirse un **Menú de Navegación Inferior (Bottom Navigation Bar)** estilizado en negro con iconos iluminados en verde eléctrico para la pestaña activa.

**Pestañas del Menú:**
1. Inicio (Home)
2. Entrenos (Workouts)
3. Progreso (Stats/Body)
4. Amigos (Social/Guild)
5. Perfil (Profile)

---

## 🖥️ Detalle de Pantallas a Generar

### 1. Pantalla de Carga (Splash Screen)
- **Fondo:** Negro mate intenso.
- **Elemento Central:** Logo dinámico estilo escudo o runa cibernética brillando en verde eléctrico.
- **Animación/Indicador:** Barra de carga inferior estilo "Cargando Recursos..." o "Sincronizando Stats...", llena de verde eléctrico brillante.
- **Texto Inferior:** Subtítulo motivacional RPG ("Inicializando Misiones Diarias...").

---

### 2. Pantalla de Inicio (Dashboard Principal)
*Estructura Vertical Obligatoria:*
1. **Zona Superior (Header):**
   - Fecha actual resaltando el **Día de la Semana** (ej: *LUNES - Día de Pecho & Tríceps*).
   - Banner de estado rápido: Nivel de jugador (ej. *Nvl. 18*) e indicador de Racha / Streak de días activos (🔥 X días).
2. **Zona Central:**
   - **Lista de Misiones Diarias (Quests):** Tarjetas interactivas con checkbox / botón de completado.
     - *Ejemplo Misión 1:* "Realiza 3 series de Sentadillas" (+50 XP).
     - *Ejemplo Misión 2:* "Completa tu entreno del día" (+150 XP, +10 Fuerza).
     - *Ejemplo Misión 3:* "Bebe 2L de agua" (+20 XP).
3. **Zona Inferior (Antes del Menú de Navegación):**
   - **Módulo de Estadísticas del Personaje (Player Stats):** Barras o atributos RPG clave.
     - **FUERZA (STR):** [████████░░] Nvl. 24
     - **RESISTENCIA (END):** [██████░░░░] Nvl. 15
     - **AGILIDAD (AGI):** [█████████░] Nvl. 20
4. **Menú Inferior:** Barra de movimiento entre pantallas.

---

### 3. Pantalla de Perfil (Profile)
- **Cabecera:** Avatar del usuario con un marco/borde cibernético que cambia según el nivel global, Nombre de Usuario, Título RPG (ej. *Titan en Ascenso*).
- **Resumen de XP:** Barra de experiencia para subir al siguiente nivel.
- **Logros e Insignias (Badges):** Galería de medallas desbloqueadas (ej. "Primeros 100kg", "Inquebrantable: 30 Días Seguidos").
- **Ajustes:** Configuración de cuenta, notificaciones de misiones y preferencias.

---

### 4. Pantalla de Entrenos (Workouts)
- **Título de la Pantalla:** "Grimorio de Entrenamiento / Rutinas".
- **Botón de Acción Principal (CTA):** "+ Crear Nueva Rutina" estilo verde eléctrico resplandeciente.
- **Lista de Entrenos Guardados (Cards):**
  - *Rutina 1:* **Empuje (Pecho/Hombro/Tríceps)** - 5 Ejercicios | Dificultad: Alta | Recompensa: +200 XP.
  - *Rutina 2:* **Tracción (Espalda/Bíceps)** - 6 Ejercicios | Dificultad: Media | Recompensa: +180 XP.
  - *Rutina 3:* **Pierna Completa** - 4 Ejercicios | Dificultad: Extrema | Recompensa: +250 XP.
- Cada elemento de la lista debe incluir un botón de "Iniciar Misión / Entreno".

---

### 5. Pantalla de Progreso (Body Map & Stats)
- **Vista Principal:** Modelo 2D/3D (Muñeco anatomía/Anatomical Silhouette) sobre fondo negro.
- **Sistema de Rangos por Grupo Muscular:** Cada grupo muscular se ilumina con contornos en verde eléctrico y muestra su Rango actual:
  - Pecho: **Rango A**
  - Espalda: **Rango S**
  - Piernas: **Rango B**
  - Brazos: **Rango A**
  - Hombros: **Rango C**
- **Rango Medio General:** Tarjeta destacada en la parte superior o inferior con la **Media Global** del cuerpo (ej. **Rango General: A-**).
- **Gráficos de Evolución:** Opción para ver gráficos de fuerza y peso levantado a lo largo del tiempo.

---

### 6. Pantalla de Amigos (Guild / Social)
- **Lista de Clan / Amigos:** Muestra la lista de contactos con su nivel, rango y estado actual ("Entrenando ahora", "En reposo").
- **Tabla de Clasificación (Leaderboard):** Ranking semanal por puntos de experiencia (XP) obtenidos entre amigos.
- **Misiones en Co-Op:** Desafíos grupales (ej: "Levantar un total acumulado de 10,000 kg esta semana entre el gremio").