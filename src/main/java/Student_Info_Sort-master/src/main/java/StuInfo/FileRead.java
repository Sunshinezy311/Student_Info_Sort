package StuInfo;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.io.*;

public class FileRead {
    Map<String, Person> map = new HashMap<String, Person>();
    public void FileRead() throws IOException {
        Map<String, Person> stu = new HashMap<String, Person>();
        File directory = new File("");//参数为空
        String courseFile = directory.getCanonicalPath() ;//获取当前工程地址
        FileInputStream cvsFile = new FileInputStream( courseFile+File.separator+"student.csv" );
        //FileReader fr = new FileReader(csvFile);
        InputStreamReader fr = new InputStreamReader( cvsFile, "GBK" );
        BufferedReader br = new BufferedReader(fr);
        String lineStr = null ;
        while((lineStr = br.readLine()) != null) {
            Person student = new Person();
            String[] arr = lineStr.split(",");
            student.setName(arr[0]);
            student.setId(arr[1]);
            student.setAge(arr[2]);
            student.setGrade(arr[3]);
            stu.put(arr[0], student);
        }
        setmap(stu);

    }

    protected void setmap(Map map)
    {
        this.map.putAll(map);
    }

    public List gethash()
    {
        Collection<Person> valueCollection = map.values();
        List<Person>ls = new ArrayList<Person>(valueCollection);

        return ls;
    }

}