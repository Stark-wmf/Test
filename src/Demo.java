import java.io.IOException;
 import java.util.Scanner;

public class Demo{
    static int i =0;
    public int flag(String read) throws IOException {
        Student[] stu = FileUtil.parseStudents("students.txt");
        for (; i < stu.length; i++) {
            if (read.equals(stu[i].getStuid())) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        Student[] stus = FileUtil.parseStudents("students.txt");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        Demo k = new Demo();
        if(k.flag(read)==0) {
            System.out.println("姓名： " + stus[i].getName() + "  学号： " + stus[i].getStuid());
        }
        else {
            System.out.println("该学生不存在");
        }
    }
}