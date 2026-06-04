package Constructor;

public class Parameterized_constructor {
	String languages;
	  Parameterized_constructor(String lang){
			languages = lang;
			System.out.println(languages);
		}

		public static void main(String[] args) {
			Parameterized_constructor obj = new Parameterized_constructor("Java");
			Parameterized_constructor obj1 = new Parameterized_constructor("Javascript");
			Parameterized_constructor obj2 = new Parameterized_constructor("C#");

		}

	}

