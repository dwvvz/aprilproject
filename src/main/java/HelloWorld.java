/**
 * Created by diveldhu on 10-4-2017.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class HelloWorld {

    public static void main(String[] args) {
        String s = "asdf123AS??<<";
        System.out.println("Password to test " + s );
        String req = ".*\\d.*";
        Pattern p = Pattern.compile(req);
        Matcher m = p.matcher(s);
        System.out.println("result = "+m.matches());
        System.out.println("totresult = " + Pattern.matches(".*\\d{2,}.*",s)+ Pattern.matches(".*[A-Z]{2,}.*",s)+Pattern.matches(".*[a-z]{2,}.*",s)+ Pattern.matches(".*[!-']{2,}.*",s)+ Pattern.matches(".*[:-@]{2,}.*",s));
       Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite color? ");
        String name = scanner.next();
        System.out.println("Your favorite color is: " + name);
        System.out.println("parse " + Integer.parseInt(name));

        //for (int i = 0; i<256; i++) {
        //    System.out.println(i+":  "+(char)i);
        //}
        ArrayList a = new ArrayList();
        a.add("en");
        a.add(1, "twee");
        //String[] l = a.toArray(String[0]);
        System.out.println(a);

        ArrayList b = new ArrayList();
        String[][] sl = new String[5][];
        List<String> l = Arrays.asList("30", "kj");
        //System.out.println(b.ensureCapacity(););
        //LocalDate ld = LocalDate.parse()//"2018-5-28", DateTimeFormatter.ISO_LOCAL_DATE);
        Period per = Period.ofDays(3).ofYears(2);
        System.out.println(per);

        int x = 9;
        long y = x * (long)x;
        System.out.println(y);
        //a.getClass()==ArrayList();

    }
}
