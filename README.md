# MisPromedios 📱

App Android en **Java** que calcula el **promedio ponderado** de 4 notas según el porcentaje de cada evaluación, e indica si el ramo queda aprobado o reprobado.

## ¿Qué hace?

1. Ingresas tus 4 notas (sin puntos ni comas, por ejemplo `55` para un 5,5).
2. Ingresas el porcentaje de cada evaluación (por ejemplo `25`).
3. Presionas **Calcular** y la app muestra tu promedio final:
   - **≥ 40** → "Felicidades, aprobaste con …"
   - **< 40** → "Lo sentimos, reprobaste con un …"

## Tecnologías

- Java
- Android Studio
- AndroidX AppCompat, Material 3, ConstraintLayout
- minSdk 27 · targetSdk 34

## Estructura

```
app/src/main/
├── java/com/issa/mispromedios/MainActivity.java   Lógica del cálculo
├── res/layout/activity_main.xml                    Interfaz
└── AndroidManifest.xml
```

## Cómo ejecutarla

Abrir la carpeta en Android Studio (**File → Open**), esperar que Gradle sincronice y presionar ▶ Run en un emulador o celular.

## Nota

Proyecto personal hecho en noviembre de 2023. El código fuente original se perdió junto con el notebook donde se desarrolló, así que este repositorio fue **reconstruido en 2026 a partir del APK** de la app. La lógica y la interfaz son las originales.

---
Isabella Simonetti · Ingeniería Civil en Computación e Informática, Universidad Mayor
