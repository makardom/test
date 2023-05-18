public class Main {
    public static void main(String[] args){
        String message = "message #";
        int count = 10;
        int i = 0;
        while (i < count) {
            String finalMessage = message + " " + i; // объявляем эффективно финальную переменную
            System.out.println(finalMessage);
            i++;
        }
    }
}
