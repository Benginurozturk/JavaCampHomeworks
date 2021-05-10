package secondDayFirstHomework;

public class CourseManager {

	public void addCourse(Course course) {
        System.out.println(course.name + " isimli kurs oluþturuldu.");
    }

    public void updateCourse(Course course) {
        System.out.println(course.name + " isimli kurs güncellendi.");
    }

    public void deleteCourse(Course course) {
        System.out.println(course.name + " isimli kurs silindi.");
    }

    public void updateCoursePrice(Course course) {
        System.out.println(course.name + " isimli kursun fiyat güncellendi.");
    }

}
