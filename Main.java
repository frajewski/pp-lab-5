import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(2, 14);
        System.out.println(result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wynik:"+result);
    }
}