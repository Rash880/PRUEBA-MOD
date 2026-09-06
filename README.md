# MiMod - Minecraft 26.2 (Fabric Loader 0.19.5)

Proyecto base listo para compilar y probar en Minecraft 26.2.

## Cómo compilar el mod

### Opción A: Con IntelliJ IDEA o Eclipse
1. Abre IntelliJ IDEA y selecciona **Open** -> Selecciona esta carpeta `mimod-fabric-26.2`.
2. Espera a que Gradle sincronice el proyecto automáticamente.
3. En el panel lateral derecho de Gradle, ejecuta:
   `Tasks` -> `build` -> `build`.
4. El archivo `.jar` final se generará en la carpeta `build/libs/`.

### Opción B: Mediante terminal (requiere Gradle / JDK 25)
Ejecuta en la raíz de este proyecto:
```bash
gradle build
```
O si tienes el wrapper:
- Windows: `gradlew.bat build`
- Linux/Mac: `./gradlew build`

El archivo `.jar` resultante estará en `build/libs/mimod-1.0.0.jar`. Cópialo a tu carpeta `.minecraft/mods/` y listo.

### Opción C: Subirlo a GitHub
1. Sube este proyecto a tu repositorio de GitHub creado con la plantilla oficial de Fabric.
2. GitHub Actions lo compilará automáticamente en la nube y podrás descargar el `.jar` directamente desde la pestaña **Actions**.
