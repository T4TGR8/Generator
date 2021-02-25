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

# 10. Implementációs terv

Bejelentkező ablak (ID ablak1):
- Text mező - Felhasználói név mező: Ide kerül beírásra a választott felhasználói név.
- Password mező - Felhasználói jelszó mező: Ide kerül beírásra a választott jelszó.
- Belépés gomb: A gomb lenyomásával aktiváljuk a hozzá tartozó belépési függvényt, mely a text és password mezőkbe beírt adatok alapján lépteti be fiókjába a felhasználót, amennyiben ezek megegyeznek az adatbázisban tároltakkal.
- Regisztrációs gomb: A gomb lenyomásával egy új felületre jutunk (Regisztrációs ablak).

Regisztrációs ablak (ID ablak2): 
- Text mező (lsd. ablak1)
- Password mező (lsd. ablak1)
- Password megerősítő mező: A felhasználó ezen mezőben újfent begépeli jelszavát, egy a mezőhöz tartozó függvény ezt összehasonlítja a password mezővel, amennyiben megyeznek egy zöld pipa jelenik meg a mező mellett és elérhetővé válik a Regisztrációs gomb.
- Regisztrációs gomb: a gomb lenyomásával meghívjuk a hozzátartozó függvényt, mely a felhasználóra vonatkozó adatokat (felhasználói név és jelszó) eltárolja az adatbázisban és lehetővé teszi a belépést.

Főablak (ID ablak3): 
- Karaktergeneráló Choice Box - legördülő menü: A felhasználó kiválaszthatja a dobozban rendelkezésreálló 2 karaktergeneráló opció közül milyen módon kivánja azt létrehozni. A választás meghozatalát követően egy függvény az ahhoz tartozó új ablakhoz vezet.
- Karakterválasztó List View: amikor egy új karakter legenerálásra kerül és a felhasználó elmenti az adatbázisba a hozzá tartozó függvény ebbe a listába is eltárolja a karaktert (neve - kasztja - szintje). A listában való kiválasztást követően válik elérhetővé az adott karakterre vonatkozó list view.
- Konkrét karakterre vonatkozó List View: Miután az előző pontban kiválasztásra került a karakter itt válnak hozzáférhetővé a specifikusan rá vonatkozó lehetőségek.
    1. Megtekintés: Betölti a karakterlapot, eloszthatjuk a tapasztalati pontokat.
    2. Szerkesztés: Betölti a karakterlapot, a manuális generálás szabályainak megfelelően azt átalakíthatjuk. Az első megszerzett tapasztalati pontok terminálják ezt a lehetőséget.
    3. Törlés
- Kockadobó szimulátor gomb: lenyomásakor a hozzá tartozó függvény megjeleníti a kockadobó ablakot.

Gyorsgeneráló ablak (ID ablak4): 
- Karakternév Text Box: a felhasználó ide irja be a karaktere nevét.
- Karakter faj Choice Box: a felhasználó a játszható fajok közül választ egyet.
- Karakter kaszt Choice Box: a felhasználó a játszható kasztok közül választ egyet.
- Karakter szint Text Field: a felhasználó kiválasztja a kívánt tapasztalati szintet.
- Karaktergeneráló Button: a fenti adatokból egy függvény legenerálja a többi értékeket véletlen szerűen (bizonyos intervallumon belül) és visszaadja a kész karakterlapot.
- Mentés Button: amennyiben a felhasználó elégedett a gomb lenyomásával eltárolja a karakterlapot az adatbázisban és véglegesíti azt.

Manuális karaktergeneráló ablak (ID ablak5): 
TODO 

Kockadobás szimulátor ablak (ID ablak6):
- Kockadobó aréna PictureView: Ezen grafikus felületen egy kocka lesz megjelenítve, melyet ha az egér balgombjával rákattintunk "eldobhatjuk".

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

# 12. Telepítési terv

Szükség van egy laptopra, vagy egy asztali számítógépre amin fut az adott alkalmazás.
Mivel ez egy asztali alkalmazás ezért a sorrend a következő:
- Futtatás
- Telepítés
- Regisztráció
- Belépés
Belépés után már használható is a program.
Online verzió esetén a telepítés és a futtatás természetesen nem szükséges.

# 13. Karbantartási terv

A szoftver a jövõben (az iskolai projekt keretein belül) nem igényel nagy karbantartásokat, a szükséges karbantartások az alábbi egységekbõl állnak:
- Igény esetén új funkciók implementálása.
- Igény esetén új műveletek implementálása.
