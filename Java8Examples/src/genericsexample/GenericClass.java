package genericsexample;

public class GenericClass<X> {
	
	X name;

	public X getName() {
		return name;
	}

	public void setName(X name) {
		this.name = name;
	}
	
	public String genericMethod(GenericClass<String> x) {
		x.setName("Rama");
		return x.name;
	}
	
	public static void main(String[] args) {
		GenericClass<String> genericcls = new GenericClass<String>();
		genericcls.setName("Krishna");
		System.out.println(genericcls.getName());
		
		//type inference in java 8
		System.out.println(genericcls.genericMethod(new GenericClass<>()));
		
		//type inference in java 7
		System.out.println(genericcls.genericMethod(new GenericClass<String>()));
	}

}
