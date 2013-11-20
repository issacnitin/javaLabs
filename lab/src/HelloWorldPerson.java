
public class HelloWorldPerson {

	/**
	 * @param args
	 */
	static class Person {
		public String name = null ;
		public int age = 0;

		public void birthday() {
			age++;
			System.out.println(name + " is now " + age);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john, mary, lucas, dumbledore, sunshine;
		
		john = new Person();
		john.name = "John";
		john.age = 37;
		
		mary = new Person();
		mary.name = "Mary";
		mary.age = 27;
		
		lucas = new Person();
		lucas.name = "Lucas";
		lucas.age = 30;
		
		dumbledore = new Person();
		dumbledore.name = "Dumbledore";
		dumbledore.age = 72;
		
		sunshine = new Person();
		sunshine.name = "Sunshine";
		sunshine.age = 15;
		
		Person persons[] = new Person[5];
		persons[0] = john;
		persons[1] = mary;
		persons[2] = lucas;
		persons[3] = dumbledore;
		persons[4] = sunshine;
	
		

		int min = persons[0].age;
		Person persont = new Person();
		for (int i = 0; i < 5; i++) {
			min = persons[i].age;
			for (int j = i; j < 5; j++)
				if (persons[j].age < min)
					{
					persont = persons[i];
					persons[i] = persons[j];
					persons[j] = persont;
					}
					

		}
		
		for(int i = 0; i < 5; i++)
			System.out.println(persons[i].name);
	}

	
}
