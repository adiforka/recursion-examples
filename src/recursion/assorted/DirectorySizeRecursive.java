package recursion.assorted;

import java.io.File;
import java.util.Scanner;

public class DirectorySizeRecursive {
    public static void main(String[] args) {

        System.out.println("Enter a directory or file: ");
        Scanner in = new Scanner(System.in);
        String directory = in.nextLine();

        System.out.println(getSize(new File(directory)) + " bytes");
    }

    static long getSize(File file) {

        long size = 0;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]);
            }
        } else size += file.length();

        return size;
    }
}

