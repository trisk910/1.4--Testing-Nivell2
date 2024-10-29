# 1.4--Testing-Nivellx

Nivell 1: JUnit

- Exercici 1
  
Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre afegir llibres, recuperar la llista de llibres, obtenir un llibre específic per la seva posició, afegir un llibre en una posició específica i eliminar un llibre per títol.

Implementa les següents funcionalitats:

La classe ha de permetre afegir llibres a la col·lecció.
S'ha de poder recuperar la llista completa de llibres
S'ha de poder obtenir el títol d'un llibre donada una posició.
S'ha de poder afegir un llibre en una posició específica.
S'ha de poder eliminar un llibre per títol.
Verifica el seu correcte funcionament amb JUnit:

Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
Asseguren que la llista conté un llibre específic en la seva posició correcta.
Verifiquen que no hi ha títols de llibres duplicats a la llista.
Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
Asseguren que afegir un llibre modifica correctament la llista.
Confirmen que eliminar un llibre disminueix la mida de la llista.
Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.


- Exercici 2

Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.


Nivell 2: AssertJ

Crea les classes Java i/o els tests que les proven per a demostrar el següent:

- Exercici 1
  
Una asserció que demostri que el valor de dos objectes sencers és igual, i una altra que indiqui que no ho és.

- Exercici 2
  
Una asserció que demostri que la referència a un objecte és la mateixa que una altra, i una altra que indiqui que és diferent.

- Exercici 3
  
Una asserció que indiqui que dos arrays d'enters són idèntics.

- Exercici 4
  
Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també). Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits.

Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.

- Exercici 5
  
Crea un map i verifica que conté una de les key que li afegeix.

- Exercici 6
  
Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. Crea una asserció que validi que l'excepció és llançada quan correspon.

- Exercici 7
  
Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.


- Exercici 3

Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
Verifica el seu correcte funcionament amb un test jUnit.
