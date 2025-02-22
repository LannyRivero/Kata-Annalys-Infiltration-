# 🏹 Annalyn's Infiltration - Kata

## 📌 Descripción

Annalyn es una valiente aventurera que intenta rescatar a su mejor amigo, quien ha sido capturado por dos secuestradores: **un poderoso caballero** y **un astuto arquero**.  
Para liberar al prisionero, Annalyn debe evaluar cuidadosamente sus opciones antes de actuar.  

En esta kata, implementarás la **lógica de decisión** basada en distintas condiciones que afectan la infiltración.  

---

## 🎯 **Reglas del juego**
Annalyn puede tomar cuatro acciones diferentes, cada una con sus propias condiciones:

### 1️⃣ **Ataque rápido (`canFastAttack`)**
- ✅ Se puede realizar **solo si el caballero está dormido**.
- ❌ No es posible si el caballero está despierto.

### 2️⃣ **Espiar (`canSpy`)**
- ✅ Se puede espiar **si al menos uno de los personajes está despierto**.
- ❌ No tiene sentido si **todos están dormidos**.

### 3️⃣ **Señalar al prisionero (`canSignalPrisoner`)**
- ✅ El prisionero puede ser señalado **si el arquero está dormido y el prisionero despierto**.
- ❌ Si el arquero está despierto, **podría interceptar la señal**.

### 4️⃣ **Liberar al prisionero (`canFreePrisoner`)**
- ✅ **Si Annalyn tiene su perro con ella**, puede liberar al prisionero **si el arquero está dormido**.  
- ✅ **Si Annalyn no tiene su perro**, solo puede liberar al prisionero si:  
  - El **prisionero está despierto**.
  - **Ambos guardias (caballero y arquero) están dormidos**.
- ❌ Si el prisionero está dormido, **no puede ser rescatado**.

---

## 🛠 **Estructura del Proyecto**
📂 `src/main/java/org/factoriaf5/infiltration/`
- 📄 `AnnalynsInfiltration.java` → Implementación de la lógica.

📂 `src/test/java/org/factoriaf5/infiltration/`
- 📄 `AnnalynsInfiltrationTest.java` → Pruebas unitarias con **JUnit 5**.

📄 `pom.xml` → Dependencias de **Maven**.

---


🤝 Contribuir
¡Si encuentras mejoras en la implementación o los tests, siéntete libre de hacer un fork y enviar un pull request! 🚀

📜 Licencia
Este proyecto está bajo la licencia MIT.

🔹 ¡Diviértete resolviendo la kata! 🔹
