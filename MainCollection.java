import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public class MainCollection {
    public static void main(String[] args) {

        ArrayList<String> employeeList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\takun\\my projects\\Ex13\\src\\empoyees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employeeList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Data load error");
        }

        System.out.println("Size of the collection: " + employeeList.size() + " elements");

        System.out.println("\nUsing standard loop:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (String employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
