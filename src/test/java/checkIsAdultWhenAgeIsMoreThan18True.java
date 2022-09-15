import org.junit.Test;



public class checkIsAdultWhenAgeIsMoreThan18True {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = true;
        assertEquals("Должно быть больше 18", expected, isAdult);// Напиши код здесь
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }// Напиши код здесь

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Должно вернуться false , так как пользователь несовершеннолетний", false, isAdult);
    }
}@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age=age;
        this.result=result; // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {17, false},
                {20, true},
                {19, true},
                {21, true},

        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals( "Должно быть больше и равно совершинолетию",result, isAdult );
    }
}

