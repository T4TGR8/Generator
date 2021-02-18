# Követelmény specifikáció

## 1. Jelenlegi helyzet leírása

A szerepjátékoknak számtalan fajtája létezik, világszerte milliók játszanak
velük akár asztali, akár számítógépes játékok formájában. Ilyen játékok például a 
nagysikerű Baldur's Gate széria elemei, vagy a CD Project Red kissé kudarcos Cyberpunkja.
A magasabb intellektualitást, ezáltal magasabb belépési küszöböt igényelő asztali 
formátumok is igen elterjedtek, bár az emberi elbutulással és az általános kreativitásvesztéssel
párhuzamosan kissé háttérbe szorultak a vizuális orgiát bemutató konkurenseikkel szemben.
A szerepjátékok piacán a 90-es évektől kezdve jelentek meg először magyar termékek. Mind közül 
a legsikeresebb a MAGUS volt. Rendszere komplexebb, bonyolultabb és ezáltal jelentősen sokrétűbb 
volt a konkurenseinél. Mind közül kiemelkedett az un. UT(Új Tekercsek), mely bonyolultsági foka 
a legmagasabb volt. Az interneten jelenleg nem található meg ezen egyedülálló és páratlan 
alkotáshoz segédeszköz a karakterek elkészítéséhez, vagy akár egyéb szolgáltatásokkal segítő 
alkalmazás. A karakterkészítés hosszadalmas és bonyolult volta miatt Magyarországon hétvégente 
UT játékok százai maradtak el, mert egy friss "gamerrel" órákig tartó procedúra a felkészülés. 
Ezt a hiányt kellene pótolni.

## 2. Vágyálomrendszer

A projekt célja egy olyan applikáció alapjainak lerakása, ami megkönnyítheti a hétvégi asztali 
játékra való felkészülést és részvételt, a hosszadalmas felkészülési procedúrát lerövidítve 
a munkával, családdal terhelt sorstársainknak elérhetővé teszi a szórakozás ezen formáját.
Az alapvető adatok megadása után elkészíti a karakterlapot, valamint egyéb hasznos funkciókkal 
segíti a kalandmesterek munkáját. Ideális lenne, ha letölthető és online is használható lenne a 
program és később akár mobiltelefonos környezetbe is átültetnénk. Regisztáció szükséges lenne, 
így egy programról akár több személy is igénybe tudná venni a szolgáltatást egymástól elszeparáltan.
A kockák/harcok szimulálására egy kocka/harc generátort is létre lehetne hozni a későbbiekben, 
jelen kereteinktől elkülönülve. Bár talán hihetetlennek tűnik és nyilván nem tömegigények kielégítése 
a cél, de sok jó embernek lenne ez hasznos segédlet.

## 3. A rendszerre vonatkozó pályázatok, törvények, rendeletek, szabványok és ajánlások felsorolása

- 2016 évi XCIII. törvény a szerzői jogok és a szerzői joghoz kapcsolódó jogok közös kezeléséről
- A pályázatban leírt időnek és kriteriumoknak meg kell felelni. Átadási határidő: 2021.05.08.
- Az alkalmazás nem használ fizetőeszközt ezért kiskorúak is használhatják.
- A magyar törvénykönyv pontajainak meg kell felelni.
- Számítogépes szabványoknak meg kell felelnie, későbiekkben esetlegesen webbőngésző szabványainak is.

## 4. Jelenlegi üzleti folyamatok modellje

- Jelenleg a Magus szerepjáték karakterlapjait a kezdés előtt jelentős ideig kell írni egy élvezetes élményért.
- Az játékosok saját kezüleg írják meg a lapokat.
- Jelenleg gyors megoldásra nincs lehetősége a játékosoknak.
- Kezdő játékosoknak nehezen feldolgozható, akár ijesztő mennyiségű a megadandó adat.

## 5. Igényelt üzleti folyamatok modellje

Szeretnénk elkerülni a hosszadalmas karakter adatok megadását. -> Program indítása -> Alap adatok megadása(faj, életkor, cast, szint) ->
Egy gombra kattintva a program generál egy karaktert -> Megnézhatjük a karaktert -> Ha elnyeri tetszésünket elmenthetjük egy gombra kattintva ->
Ha nem, akkor egy másik gombra kattintva újat generálhatunk -> Ezek után az elmentett karakterünket használhatjuk és változtathatjuk szükség esetén

## 6. Követelmény lista
### I) Funkcionális követelmények
Regisztráció lehetősége, több felhasználó kezeléséhez.
2 féle külön generálás lehetősége a generálásra a rendelkezésre álló idő függvényében.
Külön ablakok elkészítése valamennyi opcionális lehetőséghez a hozzá tartozó adatokkal, listákkal
átlátható, könnyen kezelhető formában.
A generálást követően a lapokon szereplő adatok integrálása egy nagyobb rendszerbe, melyből a 
későbbiek során egy teljeskörű szolgáltatás állhat össze.
	
### II) Nem funkcionális követelmények
Felhasználóbarát, ergonomikus elrendezés és kinézet.
Gyors működés.
Biztonságos működés: jelszavak tárolása, funkciókhoz való hozzáférés.

## 7. Irányított és szabad szöveges riportok szövege

**Megrendelő:** Sziasztok! Hallom programozni tanultok az egyetemen!
**Kivitelező:** Az túlzás, de próbálkozunk vele. :-)
**Megrendelő:** Lenne egy kisebb problémánk a srácokkal és Nektek egy jó lehetőség egy hobbiprojektre.
Nem túl hard szerintem!
**Kivitelező:** Van egy ilyen jellegű tanóránk és jól jön minden fun mond csak mi legyen, hátha belefér 
az időnkbe.
**Megrendelő:** Emlékszel amikor a Kurtával, a Lászlóval, meg a Répával akartunk tolni egy jó kis Mágust 
a múltkor haver? Elment az egész délutánunk az együtt töltött időnk fele és aztán már senkinek nem volt 
kedve semmihez, inkább ittunk mint a meszes?
**Kivitelező:** Igen, az tényleg nagyon demoralizáló volt. 
**Megrendelő:** Arra gondoltam, ha esetleg elkészülhetnének gyorsabban azok a karakterek talán legközelebb 
nem lennénk tök részegek amire action menne?
**Kivitelező:** Írtam már hasonlót, de sokat kellene szenvedni a javaban a gui-val. Szerintem benne van a 
fejlődés lehetősége. Teljes verziójában bőven több mint egy ilyen projekt, szerintem mehet.
**Megrendelő:** Az szuper, akkor légyszi tervezzetek már egy ilyet!
**Kivitelező:** Hogyne csináljuk, ha kell valami később csak szólj, pontosítsd az elképzeléseidet.
**Megrendelő:** Rendben, szia!
**Kivitelező:** Szia!

***2 órával később***
**Megrendelő:** Jah most jut eszembe, ha csináljátok, akkor legyen már a gyors opció mellett hagyományos is és 
rakjátok bele külön az összes leírást stringbe!
**Kivitelező:** Gépírókisasszonynak nézel minket, vagy mi a fene?
**Megrendelő:** Nem, csak ilyen formátumban lehet még összerakni is lenne kedvem.

***kb. 1 nappal később***
**Megrendelő:** Most jut eszembe, ugyan a googliba van beépítve kocka szimulátor, de rakhatnátok alá olyat is, 
jól néz ki és nem kellene telefont nyomkodni vagy váltogatni közben.
**Kivitelező:** Még bevgrafozzak is? Nem elég nekem a szörnyű emlék tavalyról? Ukrajnában az elmúlt 100 
évben nem vérzett el annyi ember, pedig a hemophilia gyakori arrafele.

***77 órával később hajnali 2 óra 17 perckor***
**Megrendelő:** Még eszembe jutott, hogy esetleg, ha a KM-nek is lenne felület felvinni az enemyket.
**Kivitelező:** Megyek játszok magammal egy hangmant.
		
## 8. Fogalomszótár

- Bug: fejlesztési hiba, ami miatt a program egy nem a várt eredményt ad. 
- Main menu: a fő menü, amely indulásakor jelenik meg.
- Online: interneten elérhető, azzal folyamatban kapcsolatban lévő.
- Platform: adott programhoz szükséges hardver- és/vagy a szoftverkörnyezet.
- Karakterlap: a játék szereplőihez készített, őket bemutató és jellemző leírás.
- Backend: az ahonnan az alkalmazást el lehet érni, rendszer alsóbb, a tényleges feldolgozást végző rétege. 
- Frontend: egy réteg ami feladata a rendszerbõl kijutó adatok prezentálása a felhasználónak, illetve a felhasználó által bevitt adatok fogadása.
- Web-service: különbözõ programnyelveken írt és különböző platformokon futó szoftveralkalmazások interneten keresztül történő adatcseréjére használt webszolgáltatások.
