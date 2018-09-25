import java.io.PrintWriter;

/**
 * Name: sloanwoodberry
 * Lab Name: driver
 * Lab Purpose
 * Date: 9/21/18
 * Collaborators: None
 */
import java.util.Scanner; //Make the Scanner class available
import java.io.FileNotFoundException; //Make this exception available
import java.io.File;
public class driver {
    public static void main(String[] args) throws FileNotFoundException {
        StringCompression s = new StringCompression();
        System.out.println(s.Disemvoweling("ahahabbbbbu"));
        System.out.println(s.CompressionDepression("hhhuuhhhi"));//h3u2h3i1
        System.out.println(s.CompressionDepression("aaaabbbbbhhhhhttttttrrrrrr"));
    }
}
