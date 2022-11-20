package schoolsystem;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class SchoolSystem {
    int[] maxStudent;    //ÿ������������
    int[] currentStudent;  //ÿ����ĵ�ǰ����
    ArrayList<Boolean> result;  //�洢���
 
    public SchoolSystem(int big, int medium, int small) {
        maxStudent = new int[3];
        maxStudent[0] = big;
        maxStudent[1] = medium;
        maxStudent[2] = small;
        currentStudent = new int[3];
        result = new ArrayList<>();
    }
 
    public static ArrayList<Integer> parse() { //����ʽ�����ַ����������ַ����������ز����洢���б��в�����
        String input;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����������Կո���� (����ǰ���������� �� �� С����������)��");
        System.out.println("(���к�������ΪҪ��ӵ� ��(1) ��(2) С(3)�������)��");
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