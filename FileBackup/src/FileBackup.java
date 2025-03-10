import java.io.*;
import java.nio.file.*;

public class FileBackup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file to backup: ");
        String source = reader.readLine();
        System.out.print("Enter the backup destination: ");
        String destination = reader.readLine();
        
        Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Backup completed!");
    }
}
