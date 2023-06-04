public class Calclogger implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}