package April_12_2026;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public static void main(String[] args) throws IOException
    {
        FileWriter writer = new FileWriter("C:\\Users\\amitk\\IdeaProjects\\2026_Java_Interview_Preps\\OutputFiles\\sample1.csv");
        writer.write("1, Amit");
        writer.close();
    }
}
