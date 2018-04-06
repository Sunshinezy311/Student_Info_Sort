import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        System.out.println("欢迎使用学生信息排序功能");
        System.out.println("请选择排序方式：");
        System.out.println("1.学号排序 2.年龄排序 3.成绩排序 \n按其他键退出");
        Scanner function=new Scanner(System.in);
        int choose=function.nextInt();

        // Files input


        while(choose>0&&choose<4){
            if(choose == 1){
                //1.Sort by num

                //Out the result
                System.out.println("输出结果保存在"+ +"文件中");
            }
            if(choose == 2){
                //2.Sort by age

                //Out the result
                System.out.println("输出结果保存在"+ +"文件中");
            }
            if(choose == 3){
                //3.Sort by grade

                //Out the result
                System.out.println("输出结果保存在"+ +"文件中");
            }
        }
    }
}
