package secondDayFirstHomework;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Kategori 2");
		Category category3 = new Category(3, "Kategori 3");

		Category[] categories = { category1, category2, category3 };

		CategoryManager categoryManager = new CategoryManager();
		for (Category category : categories) {
			categoryManager.addCategory(category);
			System.out.println("Kategori: " + category.name);
		}

		Course course1 = new Course(1, "C#", "C# geli�tirici kamp�na kat�l�n.", 1, 0, "Engin Demiro�");
		Course course2 = new Course(2, "Java", "Java geli�tirici kamp�na kat�l�n.", 1, 15, "Engin Demiro�");
		Course course3 = new Course(3, "Angular","Angular  kamp�na kat�l�n.", 1, 2,
				"Engin Demiro�");

		Course[] courses = { course1, course2, course3 };

		CourseManager couseManager = new CourseManager();
		for (Course course : courses) {
			couseManager.addCourse(course);
			System.out.println("Kurs: " + course.name);
		}
	}

}
