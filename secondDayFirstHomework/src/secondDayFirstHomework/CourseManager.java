package secondDayFirstHomework;

public class CourseManager {

	public void addCourse(Course course) {
        System.out.println(course.name + " isimli kurs olu�turuldu.");
    }

    public void updateCourse(Course course) {
        System.out.println(course.name + " isimli kurs g�ncellendi.");
    }

    public void deleteCourse(Course course) {
        System.out.println(course.name + " isimli kurs silindi.");
    }

    public void updateCoursePrice(Course course) {
        System.out.println(course.name + " isimli kursun fiyat g�ncellendi.");
    }

}
