package annaspringcat.annaspringcat;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CatService {
    List<Cat> catList = new ArrayList<>();

    public void readFile (String filename) throws Exception {
        Scanner scan = new Scanner(new File(filename));
        while (scan.hasNextLine()) {
            int id = scan.nextInt();
            String name = scan.next();
            String color = scan.next();
            double age = scan.nextDouble();
            Cat cat = new Cat(id, name, color, age);
            catList.add(cat);
        }
        System.out.println(catList);
        scan.close();
    }

    public List<Cat> getCats(){
        return catList;
    }

}
