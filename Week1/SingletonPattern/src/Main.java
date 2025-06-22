public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First message sent to logger");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message send to logger");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger is used (Singleton verified).");
        } else {
            System.out.println("Different instances exist (Singleton failed).");
        }
    }
}
