
class AnnotationsSandbox {
  public static void main(String[] args) throws JsonSerializeException {
    System.out.println("Hello World!"); //Display the string.

    Car car = new Car("Honda", "Model T", "1843");
    new JsonSerializer().serialize(car);
  }
}
