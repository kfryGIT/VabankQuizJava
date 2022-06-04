package pl.vabank.game;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.data.QuestionsData;

@SpringBootApplication
@RestController
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
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
						// pyt4 -400
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
						// pyt5 -400
						22L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						400),
				new QuestionsData(
						// pyt6 -400
						23L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						400),
				///////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500
						24L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt2 -500
						25L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt3 -500
						25L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt4 -500
						27L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt5 -500
						28L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				new QuestionsData(
						// pyt6 -500
						29L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"kolekcje mapy strumienie",
						500),
				////////////////////////////////////////////////////////////////////////////////////////
				// KATEGORIA GIT
				//////////////////////////////////////////////////////////////////////////////////////// 100/////////////////////////////////////////////////////////////////
				///////////////////////////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						30L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				new QuestionsData(
						// pyt2 -100
						31L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				new QuestionsData(
						// pyt3 -100
						32L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				new QuestionsData(
						// pyt4 -100
						33L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				new QuestionsData(
						// pyt5 -100
						34L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				new QuestionsData(
						// pyt6 -100
						35L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						100),
				// KATEGORIA GIT
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200
						36L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				new QuestionsData(
						// pyt2 -200
						37L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				new QuestionsData(
						// pyt3 -200
						38L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				new QuestionsData(
						// pyt4 -200
						39L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				new QuestionsData(
						// pyt5 -200
						40L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				new QuestionsData(
						// pyt6 -200
						41L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						200),
				// KATEGORIA GIT
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300
						42L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				new QuestionsData(
						// pyt2 -300
						43L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				new QuestionsData(
						// pyt3 -300
						44L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				new QuestionsData(
						// pyt4 -300
						45L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				new QuestionsData(
						// pyt5 -300
						46L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				new QuestionsData(
						// pyt6 -300
						47L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						300),
				// KATEGORIA GIT
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400
						48L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				new QuestionsData(
						// pyt2 -400
						49L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				new QuestionsData(
						// pyt3 -400
						50L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				new QuestionsData(
						// pyt4 -400
						51L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				new QuestionsData(
						// pyt5 -400
						52L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				new QuestionsData(
						// pyt6 -400
						53L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						400),
				/// KATEGORIA GIT
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500
						54L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				new QuestionsData(
						// pyt2 -500
						55L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				new QuestionsData(
						// pyt3 -500
						56L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				new QuestionsData(
						// pyt4 -500
						57L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				new QuestionsData(
						// pyt5 -500
						58L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				new QuestionsData(
						// pyt6 -500
						59L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Wątki////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						60L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				new QuestionsData(
						// pyt2 -100
						61L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				new QuestionsData(
						// pyt3 -100
						62L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				new QuestionsData(
						// pyt4 -100
						63L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				new QuestionsData(
						// pyt5 -100
						64L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				new QuestionsData(
						// pyt6 -100
						65L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						100),
				// Wątki
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200
						66L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				new QuestionsData(
						// pyt2 -200
						67L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				new QuestionsData(
						// pyt3 -200
						68L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				new QuestionsData(
						// pyt4 -200
						69L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				new QuestionsData(
						// pyt5 -200
						70L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				new QuestionsData(
						// pyt6 -200
						71L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						200),
				// Wątki
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300
						72L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				new QuestionsData(
						// pyt2 -300
						73L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				new QuestionsData(
						// pyt3 -300
						74L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				new QuestionsData(
						// pyt4 -300
						75L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				new QuestionsData(
						// pyt5 -300
						76L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				new QuestionsData(
						// pyt6 -300
						77L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						300),
				// Wątki
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400
						78L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				new QuestionsData(
						// pyt2 -400
						79L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				new QuestionsData(
						// pyt3 -400
						80L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				new QuestionsData(
						// pyt4 -400
						81L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				new QuestionsData(
						// pyt5 -400
						82L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				new QuestionsData(
						// pyt6 -400
						83L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						400),
				/// Wątki
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500
						84L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						500),
				new QuestionsData(
						// pyt2 -500
						85L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						500),
				new QuestionsData(
						// pyt3 -500
						86L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						500),
				new QuestionsData(
						// pyt4 -500
						87L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						500),
				new QuestionsData(
						// pyt5 -500
						88L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Wątki",
						500),
				new QuestionsData(
						// pyt6 -500
						89L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"GIT",
						500),
				////////////////////////////////////////////////////////////
				//////////// Podstawowe elementy języka
				//////////////////////////////////////////////////////////// java////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						90L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt2 -100
						91L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt3 -100
						92L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt4 -100
						93L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt5 -100
						94L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				new QuestionsData(
						// pyt6 -100
						95L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						100),
				// Podstawowe elementy języka java
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200
						96L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt2 -200
						97L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt3 -200
						98L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt4 -200
						99L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt5 -200
						100L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				new QuestionsData(
						// pyt6 -200
						101L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						200),
				// Podstawowe elementy języka java
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300
						102L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt2 -300
						103L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt3 -300
						104L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt4 -300
						105L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt5 -300
						106L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				new QuestionsData(
						// pyt6 -300
						107L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						300),
				// Podstawowe elementy języka java
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400
						108L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt2 -400
						109L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt3 -400
						110L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"KATEGORIA:Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt4 -400
						111L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt5 -400
						112L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						400),
				new QuestionsData(
						// pyt6 -400
						113L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						400),
				/// Podstawowe elementy języka java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500
						114L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt2 -500
						115L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt3 -500
						116L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt4 -500
						117L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt5 -500
						118L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				new QuestionsData(
						// pyt6 -500
						119L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"Podstawowe elementy języka java",
						500),
				////////////////////////////////////////////////////////////
				//////////// java////////////////////////////////////////////////
				///////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -100
						120L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				new QuestionsData(
						// pyt2 -100
						121L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				new QuestionsData(
						// pyt3 -100
						122L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				new QuestionsData(
						// pyt4 -100
						123L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				new QuestionsData(
						// pyt5 -100
						124L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				new QuestionsData(
						// pyt6 -100
						125L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						100),
				// java
				// 200/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -200
						126L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				new QuestionsData(
						// pyt2 -200
						127L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				new QuestionsData(
						// pyt3 -200
						128L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				new QuestionsData(
						// pyt4 -200
						129L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				new QuestionsData(
						// pyt5 -200
						130L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				new QuestionsData(
						// pyt6 -200
						131L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						200),
				// java
				// 300/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -300
						132L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				new QuestionsData(
						// pyt2 -300
						133L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				new QuestionsData(
						// pyt3 -300
						134L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				new QuestionsData(
						// pyt4 -300
						135L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				new QuestionsData(
						// pyt5 -300
						136L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				new QuestionsData(
						// pyt6 -300
						137L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						300),
				// java
				// 400/////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -400
						138L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				new QuestionsData(
						// pyt2 -400
						139L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				new QuestionsData(
						// pyt3 -400
						140L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				new QuestionsData(
						// pyt4 -400
						141L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				new QuestionsData(
						// pyt5 -400
						142L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				new QuestionsData(
						// pyt6 -400
						143L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						400),
				/// java
				/// 500////////////////////////////////////////////////////////////////
				new QuestionsData(
						// pyt1 -500
						144L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500),
				new QuestionsData(
						// pyt2 -500
						145L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500),
				new QuestionsData(
						// pyt3 -500
						146L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500),
				new QuestionsData(
						// pyt4 -500
						147L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500),
				new QuestionsData(
						// pyt5 -500
						148L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500),
				new QuestionsData(
						// pyt6 -500
						149L,
						"xyz",
						"aaa",
						"bbb",
						"ccc",
						"ddd",
						"aaa",
						"java",
						500)

		));
	}

}