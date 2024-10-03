import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    // global variables
    static int a = 0;

    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // 16. LinkedList
        // LinkedList<String> list = new LinkedList<String>();
        // list.add("norman");
        // list.add("bob");
        // list.add("jason");
        // list.add("milda");

        // System.out.println(list.getFirst());
        // //list.clear();

        // System.out.println(list.get(1));
        // Iterator it = list.iterator();
        // while(it.hasNext()){
        //     if((String) it.next() == "norman"){
        //         System.out.println("found at index "+ it.next());
        //     }
        // }

        // 15. Queue (FIFO) Restaurant Order
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // System.out.println(queue.poll()); // take our first
        // System.out.println(queue.poll()); // take out first poll
        // System.out.println(queue.peek());
        // System.out.println(queue);
        // System.out.println(queue.toArray()[0]);

        // 14. HashSet
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.remove(2);
        // System.out.println(set.contains(2));
        // System.out.println(set);
        // set.clear();
        // System.out.println(set);

        // 13. HashMap
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("norman", 2);
        // map.put("aiman", 1);
        // map.remove("norman");
        // System.out.println(map.get("norman"));
        // System.out.println(map);

        // 12. break statement
        // int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // for (int i : number) {
        // System.out.println(number[i]);
        // if (number[i] == 7)
        // break;
        // }

        // 11. read java file and try/catch
        // try {
        // System.out.println(new File(".").getAbsolutePath());
        // File file = new File("./firstProject/src/data.txt");
        // Scanner scanner = new Scanner(file); // Pass the File object, not
        // file.toString()
        // System.out.println(scanner.nextLine());
        // scanner.close(); // Always close the Scanner to free resources
        // } catch (FileNotFoundException e) {
        // System.out.println("File not found: " + e.getMessage());
        // }

        // 10. while loop
        // int i = 0;
        // while (i < 10) {
        // System.out.println("Hello World");
        // i++;
        // }

        // 9. do while loop
        // do {
        // printHello();
        // } while (true);

        // 8. Array VS ArrayList
        // String[] fruits = new String[3];
        // fruits[0] = "apple";
        // fruits[1] = "orange";
        // fruits[2] = "banana";
        // System.out.println(fruits[0]);
        // @SuppressWarnings("rawtypes")
        // ArrayList arrayList = new ArrayList();
        // arrayList.add("apple");
        // arrayList.add("orange");
        // arrayList.add("banana");
        // arrayList.remove("banana");
        // System.out.println(arrayList.indexOf(1));

        // 7. Switch case
        // int day = 1;
        // switch (day) {
        // case 1: {
        // System.out.println("Monday");
        // break;
        // }
        // case 2: {
        // System.out.println("Tuesday");
        // break;
        // }
        // case 3: {
        // System.out.println("Wednesday");
        // break;
        // }
        // case 4: {
        // System.out.println("Thursday");
        // break;
        // }
        // default:
        // break;
        // }

        // 6. Date to calculate age
        // LocalDate today = LocalDate.now();
        // LocalDate birDate = LocalDate.of(2001, 2, 23);
        // System.out.println(Period.between(today, birDate).toString());

        // 5. String method
        // String name = "Norman";
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.substring(1));
        // System.out.println(name.contains("n"));

        // 4. method
        // printHello();
        // System.out.println(addNumber(1,1));

        // 3. for loop
        // int grades[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // String name [] = {"name1", "name2", "name3", "name4",};
        // for (int i = 0; i < grades.length; i++) {
        // System.out.println(i);
        // }
        // for (int i = 0; i < grades.length; i++) {
        // for (int j = 0; j < name.length; j++) {
        // System.out.println(grades[i] + name[j]);;
        // }
        // }

        // 2. Learn About Scanner
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number :");
        // int a = scanner.nextInt();
        // System.out.println("Your number is " + a);
        // scanner.close();

        // System.out.print("Enter your name:");
        // String name = scanner.next();
        // System.out.println("Your name is " + name);

        // 1. variable
        // int a = 1;
        // double d = 2.2;
        // boolean b = true;
        // String name = "zarifah";
        // float x = 2.5F;
        // Long g = 25L;
        // String animal [] = {"cat", "cat", "cat", "cat", "cat", "cat"}; //list of
        // string
    }

    // 4. method
    public static void printHello() {
        System.out.println("hello Norman");
    }

    public static int addNumber(int number, int number2) {
        return number + number2;
    }
}
