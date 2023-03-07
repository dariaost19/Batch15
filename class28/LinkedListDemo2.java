package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String>subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testng");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");
        //we need to combine two LinkedLists

        LinkedList<String>allSubjects=new LinkedList<>();

      //  subjects.addAll(futureSubjects);
     //   System.out.println(subjects);
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String>subjectILike=new LinkedList<>();
        subjectILike.add("Java");
        subjectILike.add("SDLC");
        subjectILike.add("SQL");
        System.out.println(subjectILike);

        allSubjects.removeAll(subjectILike);
        System.out.println(allSubjects);


    }
}
