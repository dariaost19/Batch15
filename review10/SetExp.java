package review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExp {
    public static void main(String[] args) {
        //Set is a collection of the unique elements
       Set<String> qaJobs= new HashSet<>();
       qaJobs.add("Automation engineer");
       qaJobs.add("Manual Tester");
       qaJobs.add("STED");
       qaJobs.add("QA Analyst");
       qaJobs.add("API Tester");
        System.out.println(qaJobs);
       qaJobs.remove("Manual Tester");
        System.out.println("after removing "+qaJobs);
        qaJobs.add("API Tester");
        qaJobs.add("API Tester");
        System.out.println("after adding duplicates "+qaJobs);

        Set lSet=new LinkedHashSet<>(qaJobs); // calling constructor
    }
}
