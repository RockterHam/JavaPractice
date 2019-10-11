package ch08.Map;

import java.util.Hashtable;

class A{
    int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (obj != null && obj.getClass() == A.class){
            A a = (A) obj;
            return a.count == this.count;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.count;
    }
}

class B{
    @Override
    public boolean equals(Object obj){
        return true;
    }

}

public class HashtableTest {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        ht.put(new A(6000),"Java");
        ht.put(new A(45566),"Docker");
        ht.put(new A(23132),new B());
        System.out.println(ht);
        System.out.println(ht.containsValue("123"));        //通过equals方法比较，equals返回true则判断相等
        System.out.println(ht.containsKey(new A(6000)));        //只要传入参数相等，equals返回true，hashcode值也相等则判断为相同的key
        ht.remove(new A(45566));
        System.out.println(ht);
    }
}
