package ch08.Map;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args){
        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("语文"),new String("良好"));
        whm.put(new String("数学"),new String("优秀"));
        whm.put(new String("英语"),new String("中等"));
        whm.put("java",new String("中等"));       //向其中添加key-value，key为系统缓存的字符串对象
        System.out.println(whm);
        System.gc();        //垃圾回收，回收弱引用
        System.out.println(whm);
    }
}
