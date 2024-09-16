public class Person {
    private String name;
    private int age;
    private String gender;
    // You can add other public constructors if required.

    // Updated constructor from below to:
     public Person(String name, int age){
         this.name = name;
         this.age = age;
    }
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
   }
    
     private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
     }

    // Task 1: builder()
    public static Builder builder(){
        return new Builder(); 
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person("
            +"Name= " + this.name
            +",Age= " + this.age
            +")";
    }

    public static class Builder{
        //copy all Person's attributes
        private String name;
        private int age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        //Task 2: build() -> return Person OBJ
        public Person build(){
            return new Person(this.name, this.age);
        }
    }

    public static void main(String[] args) {
        Person p = new Person("John", 30);
        p.setAge(40);
        System.out.println(p.getAge());

        Person p2 = Person.builder()
            .name("Peter")
            .age(20)
            .build(); // build() -> instance method ->return Person OBJ

            System.out.println(p2.getName()); // Peter
            System.out.println(p2.getAge()); // 20

            //Advantages of Builder Pattern:
            //NOTE
    }
}
