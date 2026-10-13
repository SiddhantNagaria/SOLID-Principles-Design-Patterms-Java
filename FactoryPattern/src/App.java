public class App {

	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
		animal.eat();

		Animal animal2 = AnimalFactoryMap.getAnimal(AnimalType.CAT);
		animal2.eat();
	}
}
