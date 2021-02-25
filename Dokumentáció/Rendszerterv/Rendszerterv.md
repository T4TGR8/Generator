# Rendszerterv

## 1. Rendszer célja

A rendszer célja, hogy a megrendelők szabadidős tevékenységéhez könnyű és egyszerűen
használható segédletet nyújtson. Jelenleg a megrendelők nem, vagy csak ritkán élnek ezen kikapcsolódási
móddal, a már többször kihangsúlyozott időterhek miatt. A felhasználó az idő függvényében tud magának karaktert generálni.
Választhatja a hagyományos módot, ami sok időt vesz igénybe vagy minimális adatok megadásával
a rendszer generál számára egyet. A rendszer egy adatbázis segítségével menti a már elkészített karaktereket
ezzel lehetővé téve azoknak jövőbeli használatát. A szoftver interneten való elérhetővé tétele
segítségével további potenciális ügyfelek tucatjainak nyújthat segítséget.
A szoftvernek nem célja teljes egészében kiváltani a papír alapú játékot, vagy kizárólag online formában
való működés, mindössze a személyes kontaktok során felmerülő problémák áthidalása. Nem célja profitorientált,
piaci alapú felhasználás, bármilyen kereskedelmi tevékenység. Nem célja az interakciók automatizálása,
a szellemi szabadság manufaktúra üzemmé alakítása.

## 2. Projektterv

Beosztás megbeszélés allatt  
Csapattagok: Barna Bence, Dávid Gergely, Deák Ádám, Dévai Levente, Járomi Dávid

## 3. Üzleti folyamatok modellje

A felhasználónak indításkor meg kell addnia az elvárt adatokat(faj, életkor, cast, szint). Ezután a program a megadott információkból gyorsan legenerál egy karakterlapot ami tartalmazza az összes játékhoz szükséges adatot, ezzel lerövidítve a játék előkészítéséhez szükséges időt. Ezzel a gyors megoldással könnyebb belépni a játékba kezdőként, vagy akár veteránként könnyebb új karaktereket kipróbálni, ezzel felfrissítve a játék élvezetét.

## 4. Követelmények

### Funkcionális követelmények:
- Felhasználók adatainak tárolása
- Felhasználók egy speciális jogkörének megteremtése
- Ablakos alkalmazás és webes környezeten való működés
- Generált karakterek mentése adatbázisba
- Rövid és hosszú generálás lehetősége

### Nem funkcionális követelmények:
- A program könnyen és gyorsan átlátható legyen
- A felhasználók nem juthatnak hozzá más felhasználók személyes adataihoz a
nevükön és azonosítóikon kívül.

### Törvényi előírások, szabványok:
- GDPR-nek való megfelelés

# 5. Funkcionális terv

**Rendszer szereplők:**
- Felhasználó
- Kalandmester

**Rendszer használati esetek és lefutásaik:**
Felhasználó:
- Bejelentezés
- Regisztráció
- Karakter készítése
- Karakter törlése
- Kockadobás

Kalandmester: 
- Bejelentkezés
- Regisztráció
- Karakter megtekintése
- Csapat készítése
- Harc generálása

Menü hierarchiák:
Bejelentkezés
1. Bejelentkezés 
2. Regisztráció

Főablak
1. Kijelentkezés
2. Karakter generálása
3. Kockadobó szimulátor
4. Csapatszoba
5. Csoportszoba

## 6. Fizikai környezet
- Ablakos illetve későbbiekben webes alkalmazás
- Nincsenek megvásárolt komponenseink
- Fejlesztői eszközök:
    - IntelliJ IDEA
    - Notepad++
    - MySQL Workbench

# 7. Absztrakt domain modell
A program mûködése során a felhasználó kétféle szerepkörben szerepelhet: kalandmester vagy felhasználó. Ennek megfelelõen kap az alany funkciókat, amelyek a szerepkörökhöz kizárólagosan vagy nem kizárólagosan kapcsolódnak: azaz vagy csak õ fér hozzá, vagy mindketten a saját oldalukról. Az általános alany szerepkörét a bejelentkezés után a Jogosultság vizsgálata dönti el. A kaland kezelését szabályozó funkciók kizárólag a kalandmester számára elérhetõek. A további eszközöket mindkét szint használhatja.

## 11. Tesztterv

A tesztelések célja a rendszer és komponensei funkcionalitásának
teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti
szolgáltatások verifikálása

### Unit teszt:
Ahol csak lehetséges, szükséges már a fejlesztési idő alatt is tesztelni, hogy a metódusok megfelelően működnek-e. Ezért a metódusok megfelelő működésének biztosítására mindegyikhez írni kell Unit teszteket, a minél nagyobb kódlefedettséget szem előtt tartva. A metódusok akkor vannak kész, ha a tesztesetek hiba nélkül lefutnak az egyes metódusokon

### Alfa teszt:
Fejlesztőcsapat teszteli a rendszert a felfedezett hibákat javítja, finomítja gyorsítja a rendszert szükség esetén

### Beta teszt:
Kezdetleges rendszer telepítése a megrendelő által kívánt helyre és annak tesztelése, problémák fellépése esetén jelezni azokat

### Tesztelendő funkciók
#### Karakterlap generáció
Képesnek kell lennie adatokat fogadni és átadni a generátornak.  
Képesnek kell lennie egy időben kiszolgálni több klienst is.  
Reális adatokat kell, hogy visszaadjon a generátor.  
