// public final class Person implements Walkable, Swimable {
// if the class is "final", it cannot be extended by subclass.
public class Person implements Walkable, Swimable{  // 屐行合約

    @Override
    public void walk(){ // 
        System.out.println("Person is walking...");
    }

    @Override
    public void swim(){
        System.out.println("Person is swimming...");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.swim();
        p1.walk();
    }
    
}
