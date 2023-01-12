import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    TestClass test1 = new TestClass();
    List list= Arrays.asList("Все ОК", null, "Все ОК");

    for (Object name:list) {
        try {
                test1.test((String) name);
            }
            catch (TestException e) {
                System.out.println(e.getMessage());
                System.out.println("Держимся работаем дальше");
            }
            finally {
                System.out.println("Продолжаем работу ");
            }
        System.out.println("-------------");

        }

    }
}