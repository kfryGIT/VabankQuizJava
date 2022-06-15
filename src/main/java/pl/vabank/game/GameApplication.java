package pl.vabank.game;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.data.QuestionsData;

/**
 * Klasa GameApplication to klasa konfiguracyjna, klasa główna, która będzie wykonywana 
 * po uruchomieniu aplikacji.
 * Adnotacja @SpringBootApplication włącza konfigurację ałtomatyczną SpringBoota oraz włącza skanowanie komponetów, 
 * co pozwala na zadeklarowanie innych klas jako @Controller, @Entity itp.
 * Metoda itializer jest opatrzona adnotacją @Bean, 
 * gdy Spring "napotka" taką metodę, wykona ją i zarejestruje zwracaną wartość jako obiekt (ziarno) w kontenerze.
 * Wtedy będzie można ten obiekt wstrzyknąć w innym miejscu korzystając np. z adnotacji @Autowired.
 * 
* @author Klasa konfiguracyjna, generowana przez Springa, modyfikacje wprowadziła Anna Mazela i Katarzyna Madalińska.
*/

@SpringBootApplication
@RestController
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	

	@Bean
	public ApplicationRunner initializer(QuestionsRepository repository) {
		return args -> repository.saveAll(Arrays.asList(
				new QuestionsData(
						0L,
						"metoda size() tj. arrayList.size()",
						"zwraca int określający ile elementów jest na arrayLiście ",
						"zwraca false jeśli dana arrayLista jest pusta ",
						"zwraca byte określający ile elementów jest na  arrayLiście ",
						"drukuje wszystkie elementy arrayListy ",
						"zwraca int określający ile elementów jest na arrayLiście ",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt2
						1L,
						"metoda add() tj.  arrayList.add(element)",
						"dodaje element do arrayListy",
						"usuwa element z arrayList-y",
						"zwraca false jeśli dany element występuje w arrayListy",
						"zwraca index elementu występującego w arrayLiście",
						"dodaje element do arrayListy",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt3
						2L,
						"metoda clear() tj.  arrayList.clear()",
						"zwraca true, jeśli dana arrayLista nie zawiera żadnych elementów",
						"klonuje arrayListę",
						"usuwa konkretny element z tej arrayListy",
						"usuwa wszystkie elementy z danej arrayListy",
						"usuwa wszystkie elementy z danej arrayListy",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt4 ->6
						3L,
						"metoda remove(int) tj. arrayList.remove(int)",
						"usuwa z listy element typu int",
						"usuwa z listy element o wskazanym indeksie",
						"usuwa pierwsze wystąpienie podanego obiektu z listy",
						"pozwala odczytać element o wskazanym indeksie",
						"usuwa z listy element o wskazanym indeksie",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt5 ->7
						4L,
						"utworzyć różne struktury zwane listami możemy za pomocą",
						"klasy LinkedList",
						"klasy ArrayList",
						"interfejsu List",
						"klasy List",
						"interfejsu List",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt6 ->8,100
						5L,
						"jakie są podstawowe różnice między  ArrayList i LinkedList",
						"ArrayList i LinkedList to implementacja wiązana brak jest zasadniczych różnic",
						"ArrayList i LinkedList to implementacja tablicowa brak jest zasadniczych różnic",
						"ArrayList to implementacja wiązana, LinkedList to implementacja tablicowa",
						"ArrayList to implementacja tablicowa, LinkedList to implementacja wiązana",
						"ArrayList to implementacja tablicowa, LinkedList to implementacja wiązana",
						"kolekcje mapy strumienie",
						100),
				new QuestionsData(
						// pyt7 ->10,200
						6L,
						"metoda ContainsKey() tj. map.contains(key)",
						"zwraca null jeśli dany klucz nie istnieje w HashMap-ie",
						"zwraca false jeśli dany klucz istnieje w HashMap-ie",
						"zwraca true jeśli dany klucz istnieje w HashMap-ie",
						"zwraca String jeśli dany klucz występuje w HashMap-ie",
						"zwraca true jeśli dany klucz istnieje w HashMap-ie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt8 ->11,200
						7L,
						"co to jest kolejka priorytetowa w Javie?",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o niskim priorytecie jest obsługiwany przed elementem o wysokim priorytecie",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a elementy są obsługiwane zależnie od ich kolejności wstawiania",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a elementy są obsługiwane losowo",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o wysokim priorytecie jest obsługiwany przed elementem o niskim priorytecie",
						"elementy kolejki priorytetowej są uporządkowane według kolejności naturalnej, a element o wysokim priorytecie jest obsługiwany przed elementem o niskim priorytecie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt9 ->12,200
						8L,
						"metoda put() tj. map.put (K key, V value)",
						"dodaje do mapy wartość 'v' przypisaną do klucza 'k'",
						"usuwa z mapy klucz i wartość",
						"zmienia w mapie klucz i wartość",
						"zwraca true gdy mapa zawiera dany klucz i wartość",
						"dodaje do mapy wartość 'v' przypisaną do klucza 'k'",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt10 ->14,200
						9L,
						"metoda entrySet(), map.entrySet()",
						"zwraca zbiór kluczy w mapie",
						"zwraca zbiór obiektów typu Map.Entry, które reprezentują kolejne rekordy w mapie na zasadzie klucz-wartość",
						"zwraca rozmiar (ilość elementów) mapy",
						"zwraca kolekcję wartości",
						"zwraca zbiór obiektów typu Map.Entry, które reprezentują kolejne rekordy w mapie na zasadzie klucz-wartość",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt11 ->15,200
						10L,
						"metoda values(), tj. map.values()",
						"zwraca kolekcję obiektów klucz-wartość",
						"zwraca zbiór wartości zawartych w mapie",
						"zwraca kolekcję wartości zawartych w mapie",
						"zwraca zbiór obiektów klucz-wartość",
						"zwraca kolekcję wartości zawartych w mapie",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt12 ->16,200
						11L,
						"metoda get(Object key), tj. map.get(kay)",
						"zwraca wartość przypisaną do klucza 'key' lub null jeśli do takiego klucza nie jest przypisana żadna wartość",
						"zwraca wartość przypisaną do klucza 'key' lub exception jeśli do takiego klucza nie jest przypisana żadna wartość",
						"wstawia do mapy wartość 'v' przypisaną do klucza 'k'",
						"zwraca rozmiar (ilość kluczy) w mapie",
						"zwraca wartość przypisaną do klucza 'key' lub null jeśli do takiego klucza nie jest przypisana żadna wartość",
						"kolekcje mapy strumienie",
						200),
				new QuestionsData(
						// pyt13 ->18,300
						12L,
						"Kolejka deque to:",
						"kolejka dwukierunkowa, która umożliwia dodawanie elementów w środku kolejki",
						"kolejka dwukierunkowa, pozwalająca na szybkie dodawanie i usuwanie elementów po obu stronach",
						"kolejka, pozwalająca na szybkie dodawanie i usuwanie elementów na początku kolejki",
						"kolejka w której znajdują się posortowane elementy",
						"kolejka dwukierunkowa, pozwalająca na szybkie dodawanie i usuwanie elementów po obu stronach",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt14 ->19,300
						13L,
						"Jak odwrócisz arrayListę?",
						"arrayList nie można odwrócić za pomocą metody",
						"arrayList można odwrócić za pomocą metody replays() klasy Collections",
						"arrayList można odwrócić za pomocą metody reverse() klasy Collections",
						"arrayList można odwrócić za pomocą metody changeplays() klasy Collections",
						"arrayList można odwrócić za pomocą metody reverse() klasy Collections",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt15 ->20,300
						14L,
						"implementacji zbiorów HashSet to?",
						"implementacja oparta o drzewa czerwono czarne, która nie zapewnia unikalności elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności, wewnętrznie wykorzystywana jest tablica mieszająca",
						"podstawowa implementacja, nie zapewnia unikalności elementów oraz nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności, wewnętrznie wykorzystywana jest tablica mieszająca",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt16 ->21,300
						15L,
						"implementacji zbiorów LinkedHashSet to?",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną, m.in. gwaratuje unikalności elementów",
						"implementacja wykorzystująca tablicę mieszającą, dzięki czemu zagwarantowana jest unikalności elementów",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie elementów",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną, m.in. gwaratuje unikalności elementów",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt17 ->22,300
						16L,
						"implementacji zbiorów TreeSet to?",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów zgodnie z naturalnym porządkiem",
						"podstawowa implementacja, zapewnia unikalność elementów, ale nie mamy żadnej gwarancji co do ich kolejności",
						"implementacja wykorzystująca wewnętrznie zarówno tablicę mieszającą jak i dodatkową listę podwójnie wiązaną",
						"implementacja oparta o drzewa czerwono czarne, która nie zapewnia unikalności elementów, ale gwarantuje nam uporządkowanie wstawianych elementów",
						"implementacja oparta o drzewa czerwono czarne, która oprócz unikalności elementów gwarantuje nam uporządkowanie wstawianych elementów zgodnie z naturalnym porządkiem",
						"kolekcje mapy strumienie",
						300),
				new QuestionsData(
						// pyt18 ->23,300
						17L,
						"implementacji mapy LinkedHashMap to?",
						"implementacja oparta o tablicę mieszaną, nie gwarantuje żadnej kolejności elementów",
						"implementacja, która zapewnia dodatkowo sortowanie na podstawie naturalnego porządku kluczy wyznaczanego przez implementację interfejsu Comparable",
						"implementacja, wykorzystuje drzewa czerwono czarne, wymaga prawidłowej implementacji metod equals() i hashCode() w klasie definiującej klucz",
						"implementacja mapy, która zapewnia zapamiętywanie kolejności dodawania elementów, wykorzystuje tablicę mieszaną oraz listę wiązaną",
						"implementacja mapy, która zapewnia zapamiętywanie kolejności dodawania elementów, wykorzystuje tablicę mieszaną oraz listę wiązaną",
						"kolekcje mapy strumienie",
						300),
				///////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/ex25
						18L,
						"Jaka jest różnica między metodami peek() i pop(), tj. stack.peek(element) stack.pop(element)",
						"metoda peek oraz metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, jednak metody pop nie należy używać na pustym stosie",
						"metoda peek usuwa i zwraca element znajdujący się na wierzchu stosu, metoda pop zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"metoda peek oraz metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, jednak metody peek nie należy używać na pustym stosie",
						"metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, metoda peek zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"metoda pop usuwa i zwraca element znajdujący się na wierzchu stosu, metoda peek zwraca element znajdujący się na wierzchu stosu, nie usuwa go",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt2 -400/ex26
						19L,
						"Co to znaczy, że strumienie są leniwie inicjowane (ang. laziness-seeking)",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę terminalną",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę nieterminalną",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę stream",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę filter",
						"oznacza to że operacje pośrednie na strumieniach wykonywane są dopiero wtedy, kiedy natrafią na metodę terminalną",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt3 -400/ex27
						20L,
						"metoda offer() interfejsu deque",
						"wstawia określony element na początku kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"wstawia określony element na końcu kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"pobiera, ale nie usuwa, pierwszy element kolejki deque lub zwraca null, jeśli ta deque jest pusta",
						"pobiera i usuwa, pierwszy element kolejki deque lub zwraca null, jeśli ta deque jest pusta",
						"wstawia określony element na końcu kolejki, jeśli można to zrobić natychmiast bez naruszania ograniczeń pojemności, zwracając true po sukcesie i false jeśli aktualnie nie ma wolnego miejsca",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt4 -400/ex28
						21L,
						"metody element()i peek()…",
						"zwracają i usuwają, ostatni element kolejki",
						"zwracają, ale nie usuwają, ostatni element kolejki",
						"zwracają i usuwają, pierwszy element kolejki",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt5 -400/ex29
						22L,
						"metoda add() w interfejsie Queue",
						"nie występuje",
						"występuje i jest równoznaczna z metodą offer()",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i wyrzucając, IllegalStateExceptionjeśli gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i zwracając false gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"wstawia określony element do kolejki, zwracając true po pomyślnym zakończeniu i wyrzucając, IllegalStateExceptionjeśli gdy aktualnie nie ma dostępnego miejsca w kolejce",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt6 -400/e27->30
						23L,
						"Metody remove()i poll()…",
						"metoda remove() usuwa pierwszy element kolejki, a poll() zwraca pierwszy element kolejki i następnie usuwa go",
						"metoda remove() usuwa pierwszy element kolejki, a poll() zwraca pierwszy element kolejki nie usuwając go",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove() zgłasza wyjątek, a poll() zwraca null",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove()zwraca null, a poll()  zgłasza wyjątek",
						"usuwają i zwracają pierwszy element kolejki, różnią się tylko zachowaniem, gdy kolejka jest pusta wówczas: remove() zgłasza wyjątek, a poll() zwraca null",
						"kolekcje mapy strumienie",
						400),
				///////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e31
						24L,
						"W klasie Collections dostępna jest metoda suffle, która…",
						"sortuje elementy listy i odwraca ich kolejność",
						"działa odwrotnie do sortowania -tasuje elementy listy",
						"losuje elementy listy",
						"dzieli elementy na grupy",
						"działa odwrotnie do sortowania -tasuje elementy listy",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt2 -500/e32
						25L,
						"Metoda filter dostępna na strumieniach…",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true i jest to metoda terminalna",
						"zwraca strumień ograniczony do zadanej liczby elementów",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true",
						"zwraca listę zawierającą tylko te elementy dla których filtr zwrócił wartość true",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt3 -500/e33
						25L,
						"Metoda map dostępna na strumieniach…",
						"powoduje że, każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"powoduje że każdy z elementów może zostać zmieniony do innego typu, nowe obiekty zawarte są w liście",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementam",
						"powoduje że, każdy z elementów może zostać zmieniony do innego typu, nowy obiekt zawarty jest w nowym strumieniu",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt4 -500/e34
						27L,
						"Metoda peek dostępna na strumieniach…",
						"pozwala przeprowadzić operację na wybranym elemencie w strumieniu, zwraca strumień zawierający ten element",
						"zwraca strumień ograniczony do zadanej liczby elementów, pozostałe są ignorowane",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami",
						"pozwala przeprowadzić operację na każdym elemencie w strumieniu, zwraca strumień z tymi samymi elementami",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt5 -500/e35
						28L,
						"Metoda collect dostępna na strumieniach…",
						"pozwala na utworzenie nowego strumienia na podstawie elementów listy",
						"pozwala na utworzenie nowego typu na podstawie elementów strumienia, przy pomocy tej metody można na przykład utworzyć listę",
						"zwraca flagę informującą czy wszystkie elementy spełniają warunek",
						"zwraca liczbę elementów w strumieniu",
						"pozwala na utworzenie nowego typu na podstawie elementów strumienia, przy pomocy tej metody można na przykład utworzyć listę",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt6 -500/e36
						29L,
						"Metoda count dostępna na strumieniach…",
						"zwraca strumień zawierający tylko te elementy dla których filtr zwrócił wartość true i jest to metoda terminalna",
						"powoduje że wskazany element strumienia może zostać zmieniony na element innego typu",
						"zwraca flagę informującą czy wszystkie elementy spełniają warunek",
						"zwraca liczbę elementów w strumieniu",
						"zwraca liczbę elementów w strumieniu",
						"kolekcje mapy strumienie",
						500),
				//

				////////////////////////////////////////////////////////////////////////////////////////
				// KATEGORIA GIT
				//////////////////////////////////////////////////////////////////////////////////////// 100/////////////////////////////////////////////////////////////////
				///////////////////////////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e39
						30L,
						"komenda git init",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"GIT",
						100),
				new QuestionsData(
						// pyt2 -100/e40
						31L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						100),
				new QuestionsData(
						// pyt3 -100/e41
						32L,
						"komenda git status",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"GIT",
						100),
				new QuestionsData(
						// pyt4 -100/e42
						33L,
						"komenda git add .",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"GIT",
						100),
				new QuestionsData(
						// pyt5 -100/e43
						34L,
						"komenda git commit -m",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest  zapisać zmiany",
						"akceptuje wszystkie wprowadzone zmiany i oznacza je jako staged, jest niezbędna gdy wprowadzisz zmiany, dodasz nowy plik, usuniesz, lub zmodyfikujesz go",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest  zapisać zmiany",
						"GIT",
						100),
				new QuestionsData(
						// pyt6 -100/e44!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
						35L,
						"komenda git status",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"GIT",
						100),
				// KATEGORIA GIT
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e46
						36L,
						"komenda git push",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha z wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha z zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git push origin nazwa_brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt2 -200/e47!!!!!!!!!!!!!!!!!111
						37L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt3 -200/e48!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						38L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt4 -200/e49
						39L,
						"czym jest system kontroli wersji?",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  Git jest najbardziej popularnym systemem kontroli wersji",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  GitHub jest najbardziej popularnym systemem kontroli wersji",
						"to portal internetowy, który pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  GitHub jest najbardziej popularnym systemem kontroli wersji",
						"to oprogramowanie, które  tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"to oprogramowanie, które pozwala śledzić zmiany w plikach, oraz przywracać dowolną wersję z przeszłości, ułatwia w teamie kilku osobą pracować nad jednym kodem źródłowym,  Git jest najbardziej popularnym systemem kontroli wersji",
						"GIT",
						200),
				new QuestionsData(
						// pyt5 -200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
						40L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				new QuestionsData(
						// pyt6 -200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						41L,
						"komenda git pull",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"GIT",
						200),
				// KATEGORIA GIT
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
						42L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt2 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						43L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt3 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						44L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt4 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						45L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt5 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						46L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						47L,
						"komenda git clone",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"tworzy puste repozytorium Git'a, powstanie wtedy folder .git, w który będą zapisywane wszystkie historyczne dane projektu",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"podaje wszystkie informacje na temat tego co aktualnie dzieje się w repozytorium",
						"służy do pobierania projektu ze zdalnego repozytorium, które bardzo często znajduje się na platformie typu GitHub",
						"GIT",
						300),
				// KATEGORIA GIT
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400!!!!!!!!!!!!!!!!!!!!!!!!!!!
						48L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!!!!!!!!!!!!!!!!
						49L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!!!!!!!!!!!!!!
						50L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!!!!!!!!!!!
						51L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!!!!!!!!!!!
						52L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!!!!!!!!!!!
						53L,
						"komenda git checkout",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do zewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"po dodaniu commita, za pomocą tej komendy możesz wysłać swoje zmiany do wewnętrznego repozytorium, należy jedynie wpisać git checkout origin nazwa_brancha",
						"komenda służy najczęściej do pobierania aktualnej wersji brancha",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"wykorzystujemy ją jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"GIT",
						400),
				/// KATEGORIA GIT
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						54L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						55L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						56L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						57L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!!!!!!!!!!!!!!!!!!!
						58L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!!!!!!!!!!!
						59L,
						"komenda git commit --amend",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest również do zamykania pliku",
						"wysyła zmiany do zewnętrznego repozytorium, stosowana jest po dodaniu plików przez komendę git add i jej celem jest zapisać zmiany",
						"wykorzystujemy tą komendę jeśli chcemy przepiąć się na inny branch, ale również, jeśli chcemy wycofać zmiany wprowadzone w plikach",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"jeśli chcesz zmienić treść swojego ostatniego commita, wpisz tę komendę + nowy_opis_commita",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Wątki////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e75
						60L,
						"Metoda void lock()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę po wykonaniu wątku",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"Wątki",
						100),
				new QuestionsData(
						// pyt2 -100/e76
						61L,
						"metoda void unlock()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"zwalnia blokadę",
						"Wątki",
						100),
				new QuestionsData(
						// pyt3 -100/e77
						62L,
						"ReentrantLock(boolean fair)",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwalnia blokadę",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"Wątki",
						100),
				new QuestionsData(
						// pyt4 -100/e78
						63L,
						"Condition newCondition()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"tworzy obiekt blokady z określoną zasadą uczciwości, uczciwa blokada ustawia na pierwszym miejscu wątek, który czekał najdłużej",
						"zwraca obiekt warunku związany z blokadą ",
						"Wątki",
						100),
				new QuestionsData(
						// pyt5 -100/e79
						64L,
						"Metoda void signalAll()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"tworzy wielowejściową blokadę, za pomocą której można chronić sekcję krytyczną",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"Wątki",
						100),
				new QuestionsData(
						// pyt6 -100/e80
						65L,
						"Metoda void signal()",
						"zakłada blokadę, w skutek czego m.in. jeśli dwa wątki próbują uzyskać dostęp do tego samego obiektu, blokada ustawia je w kolejce",
						"zwraca obiekt warunku związany z blokadą ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku ",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku ",
						"Wątki",
						100),
				// Wątki
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e82
						66L,
						"metoda void await()",
						"zwraca obiekt warunku związany z blokadą",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"Wątki",
						200),
				new QuestionsData(
						// pyt2 -200/e83
						67L,
						"Thread(Runnable target)",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"umieszcza wątek w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"Wątki",
						200),
				new QuestionsData(
						// pyt3 -200/e84
						68L,
						"Metoda thread.start()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje wszystkie wątki znajdujące się w kolejce oczekujących do warunku",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"uruchamia wątek, powodując wywołanie metody run()",
						"Wątki",
						200),
				new QuestionsData(
						// pyt4 -200/e85
						69L,
						"Metoda static void sleep(long millis)",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"zatrzymuje wykonywanie bieżącego wątku  na określony czas ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"zatrzymuje wykonywanie bieżącego wątku  na określony czas ",
						"Wątki",
						200),
				new QuestionsData(
						// pyt5 -200/e86
						70L,
						"Metoda void notifyAll()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje wszystkie wątki, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku.",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"odblokowuje wszystkie wątki, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku.",
						"Wątki",
						200),
				new QuestionsData(
						// pyt6 -200/e87
						71L,
						"Metoda void notify()",
						"tworzy nowy wątek, który wywołuje metodę run() wskazanego obiektu ",
						"uruchamia wątek, powodując wywołanie metody run()",
						"odblokowuje jeden losowo wybrany wątek spośród tych, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku. ",
						"odblokowuje losowo wybrany wątek znajdujący się w kolejce oczekujących do warunku",
						"odblokowuje jeden losowo wybrany wątek spośród tych, które wywołały metodę wait na rzecz obiektu. Metodę tę można wywoływać wyłącznie w synchronizowanej metodzie lub synchronizowanym bloku. ",
						"Wątki",
						200),
				// Wątki
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e89
						72L,
						"W interfejsie Future<V> znajdują się następujące metody:",
						"V call(); V get(); V get(long timeout, TimeUnit unit)",
						"V get(); V get(long timeout, TimeUnit unit); void cancel(boolean mayInterrupt); boolean isCancelled(); boolean isDone()",
						"V call() boolean isCancelled(); boolean isDone()",
						"V call(); void cancel(boolean mayInterrupt)",
						"V get(); V get(long timeout, TimeUnit unit); void cancel(boolean mayInterrupt); boolean isCancelled(); boolean isDone()",
						"Wątki",
						300),
				new QuestionsData(
						// pyt2 -300/e90
						73L,
						"Metoda V get() w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt3 -300/e91
						74L,
						"Metoda boolean cancel(boolean mayInterrupt) w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt4 -300/e92
						75L,
						"Metoda   boolean isCancelled()    w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt5 -300/e93
						76L,
						"Metoda     boolean isDone()    w interfejsie Future<V>",
						"Zwraca wynik, włączając blokadę, dopóki nie jest on dostępny lub nie upłynie określona ilość czasu.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Wątki",
						300),
				new QuestionsData(
						// pyt6 -300/e94
						77L,
						"Metoda     V call()     w interfejsie  Callable<V>",
						"Uruchamia zadanie, które zwraca wynik. Na przykład interfejs Callable<Integer> reprezentuje asynchroniczne działania, których wynikiem jest obiekt typu Integer.",
						"Próbuje anulować wykonywanie zadania. Zadanie, które zostało już uruchomione, a ma parametr mayInterrupt ustawiony na true, zostanie przerwane.",
						"Zwraca wartość true, jeśli zadanie zostało anulowane przed ukończeniem.",
						"Zwraca wartość true, jeśli zadanie zostało ukończone w normalny sposób, zostało anulowane lub spowodowało wyjątek.",
						"Uruchamia zadanie, które zwraca wynik. Na przykład interfejs Callable<Integer> reprezentuje asynchroniczne działania, których wynikiem jest obiekt typu Integer.",
						"Wątki",
						300),
				// Wątki
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e96
						78L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!!!!!!!!!!!!!!!
						79L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!
						80L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!!!!!!!!!!
						81L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!!!!!!!!!!!!
						82L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!!!!!!!
						83L,
						"Metoda    ExecutorService   newCachedThreadPool()",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Zwraca pulę wątków, która wykonuje zadania przy użyciu określonej liczby wątków.",
						"Zwraca egzekutor, który wykonuje zadania kolejno w jednym wątku.",
						"Zwraca egzekutor planujący zadania w jednym wątku.",
						"Zwraca pulę wątków, która w razie potrzeby tworzy wątki, i kończy te, które są nieaktywne przez 60 sekund.",
						"Wątki",
						400),
				/// Wątki
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e103
						84L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!!!!!!!!!
						85L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!!!!!!!
						86L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!!!!!!!!!
						87L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!!!!!!!!
						88L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wątki",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!!
						89L,
						"TimeoutException to:",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"Wyjątek zgłoszony przez użytkownika, gdy zadanie nie może zostać przyjęte do wykonania.",
						"Wyjątek zgłoszony podczas próby pobrania wyniku zadania, które zostało przerwane przez zgłoszenie wyjątku.",
						"Wyjątek zgłaszany w przypadku napotkania błędu lub innego wyjątku podczas wykonywania wyniku lub zadania.",
						"Wyjątek zgłoszony po przekroczeniu limitu czasu operacji blokowania.",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Podstawowe elementy języka
				//////////////////////////////////////////////////////////// java////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						90L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt2 -100!!!!!!!!!!!!!!!!
						91L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt3 -100!!!!!!!!!!!!!!!!
						92L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt4 -100!!!!!!!!!!!!!!
						93L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt5 -100!!!!!!!!!!!!!
						94L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt6 -100!!!!!!!!!!!
						95L,
						"Modyfikator dostępu protected - widoczność",
						"w obrębie klasy",
						"wszędzie",
						"w pakiecie i wszystkich podklasach",
						"wyłącznie w obrębie pakietu",
						"w pakiecie i wszystkich podklasach",
						"Podstawowe elementy języka java",
						100),
				// Podstawowe elementy języka java
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e.112
						96L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt2 -200!!!!!!!!!!!!!!
						97L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt3 -200!!!!!!!!!!!!
						98L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt4 -200!!!!!!!!!!!!!
						99L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt5 -200!!!!!!!!!
						100L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt6 -200!!!!!!!!!!!!
						101L,
						"W którym języku programowania dozwolone jest dziedziczenie wielokrotne?",
						"Java",
						"C++",
						"zarówno w Javie jak i C++",
						"żadna odp. nie jest prawidłowa",
						"C++",
						"Podstawowe elementy języka java",
						200),
				// Podstawowe elementy języka java
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e114
						102L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt2 -300!!!!!!!!!
						103L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt3 -300!!!!!!!!
						104L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt4 -300!!!!!!!!!!!
						105L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt5 -300!!!!!!!!!!!
						106L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!!!!!!!
						107L,
						"Jakie słowo kliczowe opisuje stałe w Javie?",
						"final",
						"Finali",
						"const",
						"Const",
						"final",
						"Podstawowe elementy języka java",
						300),
				// Podstawowe elementy języka java
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e119
						108L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt2 -400!!!!!!!
						109L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt3 -400!!!!!!!!!!!!
						110L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"KATEGORIA:Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt4 -400!!!!!!!!!!
						111L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt5 -400!!!!!!!!!
						112L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt6 -400!!!!!!!!
						113L,
						"Który z podanych niżej znaków specjalnych jest zapisem nowej linii?",
						" zanak backslash + t",
						"zanak backslash + n",
						"zanak backslash + r",
						"żaden z powyższych",
						"zanak backslash + n",
						"Podstawowe elementy języka java",
						400),
				/// Podstawowe elementy języka java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/e121
						114L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt2 -500!!!!!!!!!
						115L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!!!!!
						116L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt4 -500!!!!!!!!
						117L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt5 -500!!!!!!!!
						118L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt6 -500!!!!!!!!!
						119L,
						"Funkcja isDigit()",
						"sprawdza, czy podany argument w postaci znaku jest literą",
						"sprawdza, czy podany znak jest białym znakiem",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"żaden z powyższych",
						"sprawdza, czy podany argument w postaci znaku jest liczbą",
						"Podstawowe elementy języka java",
						500),
				////////////////////////////////////////////////////////////
				//////////// java////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100/e115
						120L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				new QuestionsData(
						// pyt2 -100!!!!!!!!!!!!
						121L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				new QuestionsData(
						// pyt3 -100!!!!!!!!
						122L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				new QuestionsData(
						// pyt4 -100!!!!!!
						123L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				new QuestionsData(
						// pyt5 -100!!!!!!!!
						124L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				new QuestionsData(
						// pyt6 -100!!!!!!!!
						125L,
						"Która zmienna jest typu obiektowego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						100),
				// java
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200/e.118
						126L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				new QuestionsData(
						// pyt2 -200!!!!!!!!!
						127L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				new QuestionsData(
						// pyt3 -200!!!!!!!!
						128L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				new QuestionsData(
						// pyt4 -200!!!!!!!!!!
						129L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				new QuestionsData(
						// pyt5 -200!!!!!!!!!!!
						130L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				new QuestionsData(
						// pyt6 -200!!!!!!!
						131L,
						"Który z podanych operatorów jest operatorem koniukcji?",
						"&&",
						"||",
						"!=",
						"żaden z powyższych",
						"&&",
						"java",
						200),
				// java
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300/e116
						132L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				new QuestionsData(
						// pyt2 -300!!!!!!
						133L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				new QuestionsData(
						// pyt3 -300!!!!!!!!
						134L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				new QuestionsData(
						// pyt4 -300!!!!!
						135L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				new QuestionsData(
						// pyt5 -300!!!
						136L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				new QuestionsData(
						// pyt6 -300!!!!!!
						137L,
						"Która zmienna nie jest typu prostego?",
						"char",
						"String",
						"double",
						"int",
						"String",
						"java",
						300),
				// java
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400/e.120
						138L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				new QuestionsData(
						// pyt2 -400!!!!
						139L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				new QuestionsData(
						// pyt3 -400!!!!
						140L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				new QuestionsData(
						// pyt4 -400!!!
						141L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				new QuestionsData(
						// pyt5 -400!!!!
						142L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				new QuestionsData(
						// pyt6 -400!!!!
						143L,
						"Która z podanych metod jest metodą statyczną?",
						"Math.sqrt(1)",
						"Math.pow(1,1)",
						"żaden z powyższych",
						"zarówno a i b",
						"zarówno a i b",
						"java",
						400),
				/// java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500/
						144L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500),
				new QuestionsData(
						// pyt2 -500!!!!
						145L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500),
				new QuestionsData(
						// pyt3 -500!!!!!
						146L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500),
				new QuestionsData(
						// pyt4 -500!!!
						147L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500),
				new QuestionsData(
						// pyt5 -500!!!!
						148L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500),
				new QuestionsData(
						// pyt6 -500!!!!
						149L,
						"Metoda Math.abs(int)",
						"Zwraca poprawnie zaokrąglony dodatni pierwiastek kwadratowy z int wartości.",
						"Zwraca bezstronny wykładnik używany w reprezentacji float.",
						"Zwraca pierwiastek sześcienny int wartości.",
						"Zwraca wartość bezwzględną int wartości. ",
						"Zwraca wartość bezwzględną int wartości. ",
						"java",
						500)

		));
	}

}