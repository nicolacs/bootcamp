import java.util.ArrayList;

// Student.class and ArrayList<Subject> attribute -> 2 OBJs (A Stdent consist of / has many subjects)
// Student.class extends Subject.class -> 1 OBJ ( Student is a subject) 用廣東話講一次 學生擁有name, age 但唔會擁有科目.
// 所以唔會Student extends Subject
public class Student {
  private String name;
  private ArrayList<Subject> subjects;
    // Encapsulate Data Structure. No impact to user if I change array.

  public Student(String name, ArrayList<Subject> subjects) {
    this.name = name;
    this.subjects = subjects;
  }

  public Student(String name){
    this.name = name;
    this.subjects = new ArrayList<>();
  }

  public boolean add(Subject subject){ // Encapsulate左D方法, 等用家 .add() 就改到
    return this.subjects.add(subject);
  }

  public boolean remove(Subject subject){
    return this.subjects.remove(subject);
  }

  public Subject drop(int index) {
    // index range ?
    return this.subjects.remove(index);
  }

  public int totalScore() {
    int sum = 0;
    for (Subject subject : this.subjects) {
      sum += subject.getScore();
    }
    return sum;
  }

  public int subjectSize() {
    return this.subjects.size();
  }

  // equals(), hashCode() ...


  @Override
  public String toString() {
    return "Student(" //
        + "name=" + this.name //
        + ", subjects=" + this.subjects //
        + ")";

      
  }
  public static void main(String[] args) {
    // Revise the design so that we can add extra subject to an exising student
    Student kenny = new Student("Kenny");
    kenny.add(new Subject(90, "English"));
    kenny.add(new Subject(100, "Maths"));

    kenny.remove(new Subject(80, "Maths"));
    System.out.println(kenny.subjectSize()); // 1, after removing English

    kenny.getSubjects().add(new Subject(100, "History")); // ArrayList's add() method 
    kenny.add(new Subject(90, "History")); // Student's add() method 

    System.out.println(kenny.subjectSize()); // 3
    System.out.println(kenny.totalScore()); // 290
  }
}