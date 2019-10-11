package ch08.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMapErrTest {
    public static void main(String[] args){
        HashMap ht = new HashMap();
        ht.put(new A(6000),"Java");
        ht.put(new A(45566),"Docker");
        Iterator it = ht.keySet().iterator();
        A first =(A) it.next();
        first.count = 45566;        //当作变量修改会发生无法访问的错误
        System.out.println(ht);
        ht.remove(new A(45566));
        System.out.println(ht);
        System.out.println(ht.get(new A(45566)));
        System.out.println(ht.get(new A(6000)));
    }
}
