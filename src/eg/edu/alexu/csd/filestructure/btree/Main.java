package eg.edu.alexu.csd.filestructure.btree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BTreeNode<Integer,Object> n = new BTreeNode<>();
        List l = List.of(5,2);
        n.setKeys(l);
        //n.getKeys().add(1);
        System.out.println(n.getKeys().size());
       /* BTree t = new BTree(3);
        Random r = new Random();
        t.insert(5, 1);
        t.insert(10,1);
        t.insert(2,1);
        t.insert(6,2);
        t.insert(1,1);
        t.insert(8,1);
        t.insert(11,1);
        t.insert(12,1);
        System.out.println(t.search(12));
        t.insert(500,"S");
        System.out.println(t.search(12));
        t.insert(77,2);
        System.out.println(t.search(12));*/
      //  System.out.println("DDD");
    /*    ISearchEngine e= new SearchEngine();
        e.indexWebPage("C:\\Users\\DELL\\Desktop\\Wikipedia Data Sample\\Wikipedia Data Sample");*/

    }
}
