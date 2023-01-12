public class TestClass {
    public String name;
    void test(String name) throws TestException {
        if (name == null) {
            throw new TestException("Ой тут ничего нет");
        }
        System.out.println("Печатаем: " + name);
    }



}
