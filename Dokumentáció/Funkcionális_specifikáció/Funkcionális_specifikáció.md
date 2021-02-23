# Funkcionális specifikáció

## 1. Rendszer céljai és nem céljai 

Az elkészítendő szoftver célja, hogy a megrendelők szabadidős tevékenységéhez könnyű és egyszerűen 
használható segédletet nyújtson. Jelenleg a megrendelők nem, vagy csak ritkán élnek ezen kikapcsolódási 
móddal, a már többször kihangsúlyozott időterhek miatt. A szoftver interneten való elérhetővé tétele 
segítségével további potenciális ügyfelek tucatjainak nyújthat segítséget. 
A szoftvernek nem célja teljes egészében kiváltani a papír alapú játékot, vagy kizárólag online formában 
való működés, mindössze a személyes kontaktok során felmerülő problémák áthidalása. Nem célja profitorientált, 
piaci alapú felhasználás, bármilyen kereskedelmi tevékenység. Nem célja az interakciók automatizálása, 
a szellemi szabadság manufaktúra üzemmé alakítása.
A rendszer célja, hogy a java olyan eleddig nem ismert, nem tanult részeinek elsajátítása, kisebb extra 
programok megismerése, valamint a jelenlegi ismeretek felfrissítése, szinten tartása.

## 2. Jelenlegi helyzet leírása

Egy olyan rendszer megvalósítása amely a funkcionális specifikációban leírt vágyálomrendszernek megfelel.
Célunk egy offline felület kialakítása, mely lehetővé teszi, hogy a felhasználók karakterlapokat alkothassanak 
maguknak minél egyszerűbben és gyorsabban, miközben könnyű hozzáférhetőséget teszünk lehetővé a felhasználói 
egyéb funkciókhoz.
A felhasználó hozzáférhet az összes alapvető funkcióhoz, további jogosultságokkal azonban nem bír, kapcsolatfelvételre 
emailben, vagy telefonon jogosult esetleges információhiány, vagy technikai probléma esetén.
A tulajdonos adatokat küldhet és törölhet, valamint extra szolgáltatásokat kérvényezhet a továbbiakban, azonban a 
szerkesztést és az üzemeltetést a jövőben kötendő szerződés felbontásáig cégünk végzi.

## 3. Vágyálomrendszer leírása

A program elindításakor valászthatunk, hogy létrehozunk-e egy új profilt, vagy egy már 
létezővel jelentkezünk be. Amennyiben új profilt kívánunk létrehozni megjelenik egy ablak, 
ahol felhasználónevünk megadását követően kérvényez tőlünk egy kódot, melynek megerősítését 
követően létrehozza a személyi fiókunkat. Abban az esetben, ha már előzetesen ezt megtettük 
jelszavunk megadását követően léptet be minket a központi egységbe. 
A központi egység béta módban lehetőséget kell hogy biztosítson az alábbi menüpontok kiválasztására 
- Új karakter generálása
    1. **Gyors generálás:**
    - A gyors generálás egyetlen ok gomb lenyomására, mindössze a 4 legalapvetőbb adat(név, faj, kaszt, szint) 
    -melyek egy felugró ablakban lesznek elérhetőek- megadásával elkészíti valamennyi statisztikát és rendelkezésünkre bocsájtja a kívánt terméket.
    2. **Pontértékek manuális elosztása:**
    - Manuális elosztás esetén az oldal egy új lapra vezet, ahol táblázatokra rendezve láthatjuk a 
készülő művet, valamint a rendelkezésre álló erőforrásokat, költségeivel. Itt scrollbarok valamely 
típusának felhasználásával állíthatjuk be a kívánt értékeket. A pontok elosztását követően szintén 
egy ok gomb véglegesíti a művet, mely tárolásra kerül a rendszerben.
Az értékeket adatbázisban tároljuk, ez lehet ms-, vagy mysql.
- Már létező karakter kiválasztása
    1. Ha már korábban elkészített karakterünket kívánjuk kiválasztani opcióként megjelenik a karakter szerkesztése, mely az első jóváhagyott tp érkezéséig lehetséges. A karakter törlése pedig eltávolítja a lapot. A szerzett tp-k elosztása segítségével lehet az extra pontokat hozzáadni a már meglévőkhöz,ebben egy itt megjelenő táblázat lesz a felhasználó segítségére.


## 4. Rendszerre vonatkozó megszorítások

A rendszerre vonatkozó külső megszorítások: pályázat, törvények, rendeletek, szabványok és ajánlások felsorolása
A külső megszorítások közé tartoznak a:
- pályázat
- törvények
- rendeletek
- szabványok és ajánlások
- A számonkérésig megadott időnek és kritériumoknak meg kell felelni.
A megadott időn belül el kell végezni a feladatokat, különben nem kapunk jegyet.
- A programnak meg kell felelni az adott országban meghatározott törvényeknek.
A játék nem használ igazi valutát, így nem minősül szerencsejátéknak. Ennek
következtében kiskorúak is használhatják.
- Lehetnek kifejezetten erre a célra meghatározott rendeletek aminek szintén meg kell felelni.
Mivel Magyarországon készül a program így a magyar törvénykönyv pontjainak meg kell felelni.
- Figyelembe kell venni, hogy a programot milyen eszközön fogják használni.
Minden eszköznek meg kell felelni a szabványosításnak.
- Az összesnek együtt meg kell felelni, hogy létrejöhessen, és használható legyen a program.
Ha már az egyik nem teljesül, vagy a program nem megfelelő, úgy nem nem lehet használni.

## 5. Jelenlegi üzleti folyamatok modellje

- A jelenlegi üzleti modellben a felhasználók a Magus szerepjáték karakterlapjait a kezdés előtt írják meg.
- Ez jelentős ideig is eltarthat. A jelenben gyors megoldás nem érhető el.
- A kezdő játékosok esetleg nem tudják pontosan, hogy a sok megadható információ közül mi mire jó, vagy hogyan kéne megadni, ez akár el is fordíthat a játéktól érdeklődőket akiknek még nincs tapasztalatuk hasonló játékokban. 
- Ezt kellene elektronikusan megoldani, hogy a program arányában kevés adatból le tudjon generálni egy karaktert, ami felfrissítheti a már jártas játékosok élményeit, vagy megoldhatóvá teszi új játékosoknak a könnyedebb beszállást a Magus világába.

## 6. Igényelt üzleti folyamatok modellje

Szeretnénk elkerülni a hosszadalmas karakter adatok megadását. -> Program indítása -> Alap adatok megadása(faj, életkor, cast, szint) ->
Egy gombra kattintva a program generál egy karaktert -> Megnézhatjük a karaktert -> Ha elnyeri tetszésünket elmenthetjük egy gombra kattintva ->
Ha nem, akkor egy másik gombra kattintva újat generálhatunk -> Ezek után az elmentett karakterünket használhatjuk és változtathatjuk szükség esetén

## 8. Használati esetek

#### Szereplők:
**játékos:** Az a felhasználó, aki bejelentkezést követően jogosult használni az alkalmazás számára 
létrehozott felületeit. Karaktert generálhat, melyet módosíthat, törölhet, engedély esetén részt 
vehet játékokban, hozzáférhet a kockadobás szimulációhoz, véleményezheti a készülő új elemeket.\
**kalandmester:**
a játékok szervezését lebonyolító felhasználó, nem admin!, tehát extra jogosultságokkal
nem bír, a felhasználók adatainak szerkesztésére semmilyen formában nem jogosult, ugyanakkor a későbbi
verziók főleg erre a topicra fognak fókuszálni, hogy lehetővé tegyék játékok online lebonyolítását
és megszervezését.

## 9. Megfeleltetés

- Regisztráció felhasználók számára
- Bejelentkezés felhasználók számára
- Rövid idejű generálás felhasználóknak
- Hosszú idejű generálás felhasználóknak
- Felhasználók módisíthatják karaktereiket
- Játék biztosítása a felhasználóknak
- Egy magasabb szintű felhasználó, aki a játék lebonyolítását végzi
- Opcionális lehetőségekhez külön ablak használata

## 11. Forgatókönyv

- A felhasználó bármilyen operációs rendszeren keresztül tudja majd használni a szoftvert.
- Regisztráció nem szükséges hozzá, csak egy felhasználó által létrehozott név, hogy a játék el tudja tárolni a karaktert.
- A karakter elkészítéséhez elegendő az életkor, faj, cast és szint megadása.
- A megadott adatok alapján generálhatjuk a karaktert.
- Gombok segítségével menthetjük vagy újragenerálhatjuk.
- A generált karaktert ezek után használható a generátoron kívül egy szerepjátékban használhatjuk.
- A későbbiekben van lehetőség a karakter bizonyos adatainak módosítására.

## 12. Funkció - követelmény megfeleltetés
### Funkcionális követelmények megfeleltetése:
- A főoldalon szeretnék látni egy rövid leírást arról hogy milyen adatok kellenek a generáláshoz.
- Szeretnék az adatoknak külön beviteli felületet.
- Szeretnék tudni ezekből legenerálni egy karakterlapot.
- Felhasználóként szeretném tudni a már létrehozott karaktereim megtekinteni.
### Nem funkcionális követelmények megfeleltetése:
- Felhasználóbarát, ergonomikus elrendezés és kinézet, és gyors müködés.

## 13. Fogalomszótár

- Bug: fejlesztési hiba, ami miatt a program egy nem a várt eredményt ad. 
- Main menu: a fő menü, amely indulásakor jelenik meg.
- Karakterlap: a játék szereplőihez készített, őket bemutató és jellemző leírás.
- Generálás: megadott adatok alapján létrehozni egy objektumot
- Kaszt: egy karakter mestersége, vagy beosztása
- Faj: egy karakter származásának játék szerinti leírása
- Backend: az ahonnan az alkalmazást el lehet érni, rendszer alsóbb, a tényleges feldolgozást végző rétege. 
- Frontend: egy réteg ami feladata a rendszerbõl kijutó adatok prezentálása a felhasználónak, illetve a felhasználóáltal bevitt adatok fogadása.
- Web-service: különbözõ programnyelveken írt és különböző platformokon futó szoftveralkalmazások internetenkeresztül történő adatcseréjére használt webszolgáltatások.
