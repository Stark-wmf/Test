import java.io.IOException;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Student[] stus = FileUtil.parseStudents("students.txt");
        Map<String,String> map1=new HashMap<>();
        for(int i= 0;i<stus.length;i++){
            map1.put(stus[i].getStuid(),stus[i].getName());
        }
        Map<String,Integer> res=new HashMap<>();
        for (Map.Entry<String,String> entry:map1.entrySet()){
            if (res.containsKey(entry.getValue())){
                res.put(entry.getValue(),res.get(entry.getValue())+1);
            }else{
                res.put(entry.getValue(),1);
            }
        }

        List<Map.Entry<String,Integer>> res1 =new ArrayList<Map.Entry<String,Integer>>(res.entrySet());
        Collections.sort(res1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> r1, Map.Entry<String, Integer> r2)
            {
                return r2.getValue().compareTo(r1.getValue());
            }
        });
        System.out.println(res1);




    }
    }

