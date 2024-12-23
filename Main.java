
public class Main {
    public static void main(String[] args) {
        try {
            Human h = new Human(10000);
            System.out.println(h);
            Validator.validate(h, HumanTests.class);
        } catch (ValidateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    @Invoke
    public static void method1(){
        System.out.println("Method 1");
    }
}