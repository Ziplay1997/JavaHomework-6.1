import ru.netology.sqr.SqrtService;

public class main {

    public static void main(String[] args) {

        SqrtService service = new SqrtService();
        int actiual = service.calculate(1, 15012);


        System.out.println("Количество квадратных чисел входящих в диапазон: " + actiual);
    }
}
