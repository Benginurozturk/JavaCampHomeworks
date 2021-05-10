package secondDayFirstHomework;

public class Course {

	public Course(int id, String name, String definition, int categoryId, float price, String instructor) {
		this.id = id;
		this.name = name;
		this.definition = definition;
		this.categoryId = categoryId;
		this.price = price;
		this.instructor = instructor;
	}

	int id;
	String name;
	String definition;
	int categoryId;
	float price;
	String instructor;
}
