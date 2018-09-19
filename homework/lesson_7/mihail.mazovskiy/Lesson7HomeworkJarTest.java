/**
 * Created by m_maz on 08.09.2018.
 */
public class Lesson7HomeworkJarTest {
    public static void main(String[] args) {
        try {
            int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Error in parameters");
        }
    }
}
