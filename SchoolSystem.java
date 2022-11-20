package schoolsystem;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class SchoolSystem {
    int[] maxStudent;    //每个班的最大人数
    int[] currentStudent;  //每个班的当前人数
    ArrayList<Boolean> result;  //存储结果
 
    public SchoolSystem(int big, int medium, int small) {
        maxStudent = new int[3];
        maxStudent[0] = big;
        maxStudent[1] = medium;
        maxStudent[2] = small;
        currentStudent = new int[3];
        result = new ArrayList<>();
    }
 
    public static ArrayList<Integer> parse() { //按格式输入字符串，分析字符串，获得相关参数存储到列表中并返回
        String input;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字以空格隔开 (其中前三个数代表 大 中 小班的最大人数)：");
        System.out.println("(其中后三个数为要添加的 大(1) 中(2) 小(3)班的人数)：");
        input = scanner.nextLine();
        String[] value = input.split(" ");
        for (String s : value) {
            list.add(Integer.valueOf(s));
        }
        return list;
 
    }
 
    public boolean addStudent(int stuType) {
        boolean b = false;
        if (stuType == 1) {
            if (currentStudent[0] < maxStudent[0]) {
                currentStudent[0]++;
                b = true;
            }
        } else if (stuType == 2) {
            if (currentStudent[1] < maxStudent[1]) {
                currentStudent[1]++;
                b = true;
            }
        } else if (stuType == 3) {
            if (currentStudent[2] < maxStudent[2]) {
                currentStudent[2]++;
                b = true;
            }
        }
        result.add(b);
        return b;
    }
 
    public void print() {
        System.out.println(result);
    }
}