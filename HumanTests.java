public class HumanTests {
    public static void testAge(Human human) throws ValidateException {
        if (human.getAge() < 1 || human.getAge() > 200) {
            throw new ValidateException("возраст человека не в диапазоне от 1 до 200");
        }
    }
}