import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws FormatException,StringException, NumbersException, IOException {

        System.out.println("Введите выражение: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(calc(s));
    }
    public static String calc(String s) throws NumbersException, FormatException, StringException {
        int a,b;
        int flag;
        s = s.replaceAll(" ", "");
        char[] charArray = s.toCharArray();
        if(s.length()==4){
            switch (charArray[1]) {
                case '+':
                    a = Character.digit(charArray[0],10);
                   b= Integer.parseInt(String.valueOf(charArray[2])+String.valueOf(charArray[3]));
                    flag=1;
                    break;
                case '-':
                    a = Character.digit(charArray[0],10);
                    b= Integer.parseInt(String.valueOf(charArray[2])+String.valueOf(charArray[3]));
                    flag=1;
                    break;
                case '*':
                    a = Character.digit(charArray[0],10);
                    b= Integer.parseInt(String.valueOf(charArray[2])+String.valueOf(charArray[3]));
                    flag=1;
                    break;
                case '/':
                    a = Character.digit(charArray[0],10);
                    b= Integer.parseInt(String.valueOf(charArray[2])+String.valueOf(charArray[3]));
                    flag=1;
                    break;
                case ':':
                    a = Character.digit(charArray[0],10);
                    b= Integer.parseInt(String.valueOf(charArray[2])+String.valueOf(charArray[3]));
                    flag=1;
                    break;
                default:
                {
                a= Integer.parseInt(String.valueOf(charArray[0])+String.valueOf(charArray[1]));
                b = Character.digit(charArray[3],10);
                flag=2;
                }
            }
        }else if(s.length()==5){
                a= Integer.parseInt(String.valueOf(charArray[0])+String.valueOf(charArray[1]));
                b= Integer.parseInt(String.valueOf(charArray[3])+String.valueOf(charArray[4]));
                flag=2;
            }
            else if(s.length()==3){
            a = Character.digit(charArray[0],10);
            b = Character.digit(charArray[2],10);
            flag=1;
            }
            else
            throw new FormatException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            if (10<a || a<0||10<b || b<0) {
            throw new NumbersException("Введенные числа не подходят для выполнения программы.");
        }
        switch (charArray[flag]) {
            case '+':
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            case ':':
                break;
            default:
                throw new StringException("Строка не является математической операцией");
        }
        int calc=0;

        switch (charArray[flag]) {
            case '+':
                calc = a + b;
                break;
            case '-':
                calc = a - b;
                break;
            case '*':
                calc = a * b;
                break;
            case '/':
                calc = a / b;
                break;
            case ':':
                calc = a / b;
                break;
        }
        return ("Результат: "+calc);
    }
}