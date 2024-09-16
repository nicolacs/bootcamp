public class Optional1<T> {
    private T data;
  
    private Optional1(T data) {
      this.data = data;
    }
  
    public boolean isPresent() {
      return this.data != null;
    }
  
    public T get() {
      if (this.data == null)
        throw new RuntimeException();
      return this.data;
    }
  
    public T orElse(T newData) {
      if (this.data == null)
        return newData;
      return this.data;
    }
  
    public static <T> Optional1<T> of(T data) {
      return new Optional1<>(data);
    }
  
    public static void main(String[] args) {
  
      Optional1<String> string = Optional1.of("abc");
      System.out.println(string.get()); // "abc"
  
      Optional1<String> string2 = Optional1.of(null);
      System.out.println(string2.orElse("hello")); // hello
    }
  }
