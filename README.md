Notas de desarrollador:

Antes de poner el tipico ReadMe realizado por IA tengo que aclarar un par de cosas.

**Nota 1.**
La carpeta data la cree yo con ese nombre sin ayudad de la IA,
simplemente le puse ese nombre porque en VSCODE a la carpeta se le añade un logo de base de datos
y quería que quedara así.

**Nota 2.**
La parte de hacer un log.txt no lo entendi bien, entonces hice que solo almacenara `programa ejecutado`


---

⚠️ El ReadMe fue realizado completamente por la IA

<img src='https://media.tenor.com/0Xt5AtzzMwYAAAAM/interstellar-no-no-no.gif'>

---

# Proyecto Java — Colecciones y Ficheros

Proyecto Java que trabaja con colecciones (`Queue`, `Stack`, `HashSet`, `HashMap`) y manejo de ficheros, organizado en tres aplicaciones independientes.

---

## Arquitectura del proyecto

```
src/
├── App.java       → Cafetería (Queue y Stack)
├── App2.java      → Torneo (HashSet y HashMap)
├── App3.java      → Películas (Ficheros CSV)
└── net/salesianos/proyectos/
    ├── cafeteria/pedido/Pedido.java
    ├── torneo/participante/Participante.java
    └── aplicación/pelicula/Pelicula.java
data/
├── peliculas.csv
├── resumen_peliculas.txt
└── log_peliculas.txt
```

---

## Actividad 1 — Cafetería (`App.java`)

Simula el sistema de pedidos de una cafetería usando `Queue` y `Stack`.

### `Pedido`

| Atributo | Tipo | Descripción |
|---|---|---|
| `codigo` | `String` | Código único del pedido |
| `cliente` | `String` | Nombre del cliente |
| `producto` | `String` | Producto pedido |
| `paraLlevar` | `boolean` | Si el pedido es para llevar o para comer aquí |

#### Métodos destacados

- `toString()` → Devuelve los datos del pedido. Usa el operador ternario para mostrar `"Para llevar"` o `"Para comer aquí"`.
- `equals()` → Dos pedidos son iguales si tienen el mismo `codigo`.

#### Funcionalidad (`App.java`)

- Añade pedidos a una `Queue` y los muestra
- `peek()` → Ver el primer pedido sin sacarlo
- `poll()` → Sacar pedidos de la cola (FIFO)
- Los pedidos preparados se guardan en una `Stack`
- `peek()` → Ver el último preparado sin sacarlo
- `pop()` → Extraer el último preparado (LIFO)
- Comprueba si la cola de comandas está vacía

---

## Actividad 2 — Torneo (`App2.java`)

Gestiona los participantes de un torneo usando `HashSet` y `HashMap`.

### `Participante`

| Atributo | Tipo | Descripción |
|---|---|---|
| `idJugador` | `String` | Identificador único (ej: `"J001"`) |
| `nombre` | `String` | Nombre del participante |
| `categoria` | `String` | Categoría: Junior, Senior o Experto |

#### Métodos destacados

- `equals()` → Dos participantes son iguales si tienen el mismo `idJugador`.
- `hashCode()` → Genera un código basado en `idJugador`, lo que permite al `HashSet` detectar duplicados.

#### Funcionalidad (`App2.java`)

- Añade participantes a un `HashSet` ignorando duplicados por `idJugador`
- Compara intentos de inserción vs participantes reales añadidos
- Recorre el set y cuenta participantes por categoría
- Usa un `HashMap<String, Integer>` para almacenar el conteo por categoría
- Operaciones sobre el `HashMap`: `get()`, `containsKey()`, `remove()`, `keySet()`

---

## Actividad 3 — Películas (`App3.java`)

Lee un fichero CSV con películas, calcula estadísticas y genera ficheros de salida.

### `Pelicula`

| Atributo | Tipo | Descripción |
|---|---|---|
| `titulo` | `String` | Título de la película |
| `genero` | `String` | Género cinematográfico |
| `duracionMinutos` | `int` | Duración en minutos |

#### Funcionalidad (`App3.java`)

- Lee `peliculas.csv` e ignora la primera línea (cabecera)
- Convierte cada línea en un objeto `Pelicula` usando `split(",")`
- Calcula número total de películas, duración total y duración media
- Encuentra la película con mayor duración
- Genera `resumen_peliculas.txt` con las estadísticas
- Genera `log_peliculas.txt` añadiendo mensajes de ejecución sin borrar el contenido anterior (`StandardOpenOption.APPEND`)

#### Formato del CSV

```
titulo,genero,duracion
Inception,Ciencia Ficción,148
The Godfather,Drama,175
```

---

## Colecciones utilizadas

| Colección | Actividad | Para qué |
|---|---|---|
| `Queue` | Cafetería | Gestión de pedidos en orden de llegada (FIFO) |
| `Stack` | Cafetería | Pedidos preparados, último en entrar primero en salir (LIFO) |
| `HashSet` | Torneo | Participantes únicos sin duplicados |
| `HashMap` | Torneo | Conteo de participantes por categoría |
| `ArrayList` | Películas | Lista de objetos `Pelicula` leídos del CSV |

---

## Ficheros generados

| Fichero | Descripción |
|---|---|
| `resumen_peliculas.txt` | Estadísticas de las películas (se sobreescribe en cada ejecución) |
| `log_peliculas.txt` | Registro de ejecuciones con fecha y hora (se acumula sin borrar) |
