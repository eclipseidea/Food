/*�������� + 
�� ��"���� ������� ������� ( ��� )
�������� ���� ������ � ����� ������� ��� ����:
- ��*�;
- ���;
- ��;
������ ������ �� � � ��������� �� ���� ������ (���� ����� ��� ����: ������ �
���������)������, ���� ���� ������, ��������� ����� � ��������� �� ���� ������
���������� �� ���� ���� �����, ���������� ���� ������� �� �� ���� �*���� �
������������� �����(Scanner), ���� � ��������� �� ������� ����������� : "��*� ������
+ �*���� (�������� �����) ������� ���� ������".*/
package mans;

import java.util.Scanner;

public class Man {
	private String name;
	private String type;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTypes(Object object) {
		return type;
	}

	public void choiseFood(Man roman, Man mickael) {
		Scanner scanner = new Scanner(System.in);
		if (roman.getType().equals("hunter")) {
			System.out.println("Meat");
			System.out.println("Steak");
			System.out.println("Cutlet");
			System.out.println("input food");
			String checkFood = scanner.next();
			if ((checkFood.equals("Meat") || checkFood.equals("Steak") || checkFood
					.equals("Cutlet"))) {
				System.out.println(roman.getName() + "can eat "
						+ (int) (Math.random() * 10) + " kg same food");
			} else {
				System.out.println("There is no food for the type ");
			}
		}

		if (mickael.getType().equals("gatherer")) {
			System.out.println("Grass");
			System.out.println("Salad");
			System.out.println("Apple");
			System.out.println("input food");
			String checkFood = scanner.next();
			if ((checkFood.equals("Grass") || checkFood.equals("Salad") || checkFood
					.equals("Apple"))) {
				System.out.println(mickael.getName() + " can eat "
						+ (int) (Math.random() * 10) + " kg same food");
			} else {
				System.out.println("There is no food for the type ");
			}
		}
		scanner.close();
	}

}
