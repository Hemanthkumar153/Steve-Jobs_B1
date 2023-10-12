package Practise;


	// Abstract class
	abstract class Sunstar {
		abstract void printInfo();
	}

	// Abstraction performed using extends
	class Emploe extends Sunstar {
		void printInfo() {
			String name = "Hemanth";
			int age = 21;
			float salary = 222.2F;

			System.out.println(name);
			System.out.println(age);
			System.out.println(salary);

		}

	}

	// Base class
	class Base {
		public static void main(String args[]) {
			Sunstar s = new Emploe();
			s.printInfo();
		}
	}


