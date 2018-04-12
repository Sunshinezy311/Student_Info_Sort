import Sorts.*;
import StuInfo.*;
import java.io.IOException;
import java.util.*;

public class UI {
    public static void main(String[] args) throws IOException {

        UIshow(); // MainFrom

        // Files input
        FileRead fr = new FileRead();
        fr.FileRead();
        List<Person> ls = fr.gethash();

        Scanner function=new Scanner(System.in);
        int choose;
        while((choose=function.nextInt())!=-1)
        {
            if(choose == 1){
                //1.Sort by num
                System.out.println("请选择排序方式：");
                System.out.println("1--正序， 2--逆序， 3--输入4返回上级菜单");
                int temp;
                while((temp=function.nextInt())!=-1)
                {
                    if(temp == 0)
                    {
                        System.out.println("请选择排序方式：");
                        System.out.println("1--正序， 2--逆序， 3--输入4返回上级菜单");
                        continue;
                    }
                    else if(temp == 1) //正序
                    {
                        Comparator ComUpId = new IDUpOrder();
                        Collections.sort(ls,ComUpId);
                        Stushow(ls);
                        continue;
                    }
                    else if(temp == 2) //逆序
                    {
                        Comparator ComDownId = new IDDeOrder();
                        Collections.sort(ls,ComDownId);
                        Stushow(ls);
                        continue;
                    }
                    else if(temp == 4)
                    {
                        UIshow();
                        break;
                    }
                    else
                        System.out.println("输入数据不符合规范，请重新输入：\n1--正序， 2--逆序， 3--输入0返回上级菜单");
                        continue;
                }
                //Out the result
               // System.out.println("输出结果保存在"+ +"文件中");
            }
            else if(choose == 2){
                //2.Sort by age
                System.out.println("请选择排序方式：");
                System.out.println("1--正序， 2--逆序， 3--输入0返回上级菜单");
                int temp;
                while((temp=function.nextInt())!=-1)
                {
                    if(temp == 0)
                    {
                        System.out.println("请选择排序方式：");
                        System.out.println("1--正序， 2--逆序， 3--输入0返回上级菜单");
                        continue;
                    }
                    else if(temp == 1) //正序
                    {
                        Comparator ComUpId = new AgeUpOrder();
                        Collections.sort(ls,ComUpId);
                        Stushow(ls);
                        continue;
                    }

                    else if(temp == 2) //逆序
                    {
                        Comparator ComDownId = new AgeDeOrder();
                        Collections.sort(ls,ComDownId);
                        Stushow(ls);
                        continue;
                    }
                    else if(temp == 4)
                    {
                        UIshow();
                        break;
                    }
                    else
                        System.out.println("输入数据不符合规范，请重新输入：\n1--正序， 2--逆序， 3--输入0返回上级菜单");
                    continue;
                }
                //Out the result
               // System.out.println("输出结果保存在"+ +"文件中");
            }
            else if(choose == 3){
                //3.Sort by grade
                System.out.println("请选择排序方式：");
                System.out.println("1--正序， 2--逆序， 3--输入0返回上级菜单");
                int temp;
                while((temp=function.nextInt())!=-1)
                {
                    if(temp == 0)
                    {
                        System.out.println("请选择排序方式：");
                        System.out.println("1--正序， 2--逆序， 3--输入0返回上级菜单");
                        continue;
                    }
                    else if(temp == 1) //正序
                    {
                        Comparator ComUpId = new GradeUpOrder();
                        Collections.sort(ls,ComUpId);
                        Stushow(ls);
                        continue;
                    }

                    else if(temp == 2) //逆序
                    {
                        Comparator ComDownId = new GradeDeOrder();
                        Collections.sort(ls,ComDownId);
                        Stushow(ls);
                        continue;
                    }
                    else if(temp == 4)
                    {
                        UIshow();
                        break;
                    }
                    else
                        System.out.println("输入数据不符合规范，请重新输入：\n1--正序， 2--逆序， 3--输入0返回上级菜单");
                        continue;
                }
                //Out the result
               // System.out.println("输出结果保存在"+ +"文件中");
            }
            else if(choose == 0) {
                UIshow();
                continue;
            }
            else
                break;
        }
    }

    private static void UIshow(){
        System.out.println("欢迎使用学生信息排序功能");
        System.out.println("请选择排序方式：");
        System.out.println("1.学号排序 2.年龄排序 3.成绩排序 \n按其他键退出");
    }

    private static void Stushow(List<Person> ls)
    {
        for(int i = 0; i< ls.size(); i++)
        {
            Person p = ls.get(i);
            System.out.println(p.show());
        }
        System.out.println("输入0返回上级菜单");
    }
}
