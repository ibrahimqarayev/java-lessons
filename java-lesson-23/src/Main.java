public class Main {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        int numberOfLogs = 100000;

        long plainStartTime = System.nanoTime();
        simpleLogger.writePlain(numberOfLogs);
        long plainEndTime = System.nanoTime();

        double plainExecutionTimeMs = (plainEndTime - plainStartTime) / 1000000.0;
        System.out.println("FileOutputStream time: " + plainExecutionTimeMs + " ms");

        long bufferedStartTime = System.nanoTime();
        simpleLogger.writeBuffered(numberOfLogs);
        long bufferedEndTime = System.nanoTime();

        double bufferedExecutionTimeMs = (bufferedEndTime - bufferedStartTime) / 1000000.0;
        System.out.println("BufferedOutputStream time: " + bufferedExecutionTimeMs + " ms");
    }
}