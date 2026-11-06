import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleLogger {

    public String createLog(int i) {
        return "[INFO] Test log number " + i + "\n";
    }

    public void writePlain(int count) {
        String fileName = "logs_plain.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {

            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                fileOutputStream.write(log.getBytes());
            }

        } catch (IOException e) {
            System.out.println("Failed to write to file '" + fileName + "'.");
            e.printStackTrace();
        }
    }

    public void writeBuffered(int count) {
        String fileName = "logs_buffered.txt";

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {

            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                bufferedOutputStream.write(log.getBytes());
            }

        } catch (IOException e) {
            System.out.println("Failed to write to file '" + fileName + "'.");
            e.printStackTrace();
        }
    }
}

