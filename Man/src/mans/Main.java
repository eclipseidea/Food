/*ЗАВДАННЯ + 
всі об"єкти описуємо класами ( ООП )
Створити клас Людина в ньому описати такі поля:
- ім*я;
- тип;
- вік;
додати методи які б в залежності від типу людини (буде тільки два типи: збирач і
мисливець)робили, вивід типу людини, наступний метод в залежності від типу людини
пропонував би деякі види страв, користувач буде вводити що він хоче з*їсти з
перерахованих страв(Scanner), якщо є співпадіння то вивести повідомлення : "ім*я людини
+ з*їсть (рандомне число) кілограм даної страви".*/
package mans;
public class Main {
	public static void main(String[] args) {
		Man roman = new Man();
		roman.setName("Roman");
		roman.setType("hunter");
		Man mickael = new Man();
		mickael.setName("Mickael");
		mickael.setType("gatherer");
		
//		System.out.println(roman.getTypes(roman));
//		System.out.println(mickael.getTypes(mickael));
//		roman.choiseFood(roman, roman);
//		mickael.choiseFood(mickael, mickael);
	}
}
