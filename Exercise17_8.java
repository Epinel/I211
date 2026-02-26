import java.io.*;

public class Exercise17_8 {
    public static void main(String[] args) throws IOException {
        try (
            RandomAccessFile file = new RandomAccessFile("Exercise17_8.dat","rw");
        ) {
            int count = 0;

            if (file.length()>0)
            count = file.readInt();

            file.seek(0);
            file.writeInt(++count);
            System.out.println("Current count is " + count);
        }
        
    }
}
