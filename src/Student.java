import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;
  public static int count;
  public static double allrating;
  public static double avrating;

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    Student student1 = new Student("Petro");
    student1.setRating(15);

    Student student2 = new Student("Volodymyr");
    student2.setRating(30);

    Student student3 = new Student("Igor");
    student3.setRating(151);

    students.add(student1);
    students.add(student2);
    students.add(student3);

    System.out.print("The average rating of all students: ");
    System.out.printf("%.2f", allrating / count);
    student3.changeRating(20);
    System.out.println();
    System.out.print("The average rating of all students after changing rating of student " + student3.name + ": ");
    System.out.printf("%.2f", allrating / count);
  }

  public Student() {
    count++;
  }// TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;
    count++;//TODO initialize name
  }

  public static double getAvgRating() {
    if (count > 0) {
      avrating = allrating / count;// TODO return average rating of all students
      return avrating;
    }
    return avrating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name; // TODO set student's name
  }

  public int getRating() {
    return rating;
  }

  public int setRating(int rating) {
    this.rating = rating;
    allrating += this.rating;// TODO initialize rating;
    return rating;
  }

  public boolean betterStudent(Student student) {
    if (this.rating > student.rating)// TODO return the result of comparing this.student's rating with the student's rating
      return true;
    else return false;
  }

  public void changeRating(int rating) {
    allrating -= this.rating;
    this.rating = setRating(rating);
    // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    student.count = 0;
    student.rating = 0;
    allrating = 0;
    avrating = 0;
    // TODO remove student
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return name + rating;
  }
}
