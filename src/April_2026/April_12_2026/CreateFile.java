package April_2026.April_12_2026;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\amitk\\IdeaProjects\\2026_Java_Interview_Preps\\OutputFiles\\sample.csv");

        if (file.createNewFile())
            System.out.println("New File Created");
        else System.out.println("File  already exist");


        //        boolean check = file.exists();
//        System.out.println(file.isFile());
//        System.out.println(check);

    }
}
