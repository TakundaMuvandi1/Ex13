import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
public class Collections {
    public static void main(String[] args) {
        Set<String> employeeSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\takun\\my projects\\Ex13\\src\\empoyees.txt"))) {
            String employee;
            while ((employee = br.readLine()) != null) {
                employeeSet.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Size of employeeSet: " + employeeSet.size());

        System.out.println("\nUsing a for-each loop:");
        for (String employee : employeeSet) {
            System.out.println(employee);
        }
    }
}