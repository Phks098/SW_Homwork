
public class Cat extends Animal {

	public Cat(String name, float weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	void speaK() {
		// TODO Auto-generated method stub
		System.out.println("야아옹");
		
	}


	@Override
	void animalInformation() {
		System.out.printf("| 동물 분류 | %-16s |\n", "고양이");
        System.out.printf("| 동물 이름 | %-16s |\n", name);
        System.out.printf("| 동물 무게 | %-16.2f |\n", weight);
        System.out.printf("| 동물 색깔 | %-16s |\n", color);
		
		
	}

	
	
}
