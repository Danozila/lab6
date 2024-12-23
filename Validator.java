import java.lang.reflect.Method;

public class Validator {
    public static void validate(Object obj, Class<?> testClass) throws ValidateException {
        Method[] methods = testClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getParameterCount() == 1 && method.getParameterTypes()[0] == obj.getClass()) {
                try {
                    method.invoke(null, obj); // Предполагаем, что методы статические
                } catch (Exception e) {
                    throw new ValidateException("Ошибка в " + method.getName() + " : " + e.getCause().getMessage());
                }
            }
        }
    }
}