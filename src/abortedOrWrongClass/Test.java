package abortedOrWrongClass;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String[]> a =new ArrayList<>();
        a.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
    }

    /*Connection conn=null;
        try {

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        DBUtil.closeResources(conn,null,null);
    }*/
}
