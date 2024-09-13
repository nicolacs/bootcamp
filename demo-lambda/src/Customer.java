public class Customer {
    // !!! this page create for /DemoLambdaFunction's example only

        private String name;

        private int age;
      
        public Customer(int age, String name) {
          this.age = age;
          this.name = name;
        }
      
        public String getName(){
          return this.name;
        }

        public int getAge() {
          return this.age;
        }
      }
