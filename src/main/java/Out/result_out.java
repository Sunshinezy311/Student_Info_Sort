package Out;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class result_out {
    private String filename = null;
    private String str_=null;
    public result_out(String filename,String str_){
        try {
            if(filename!=null) {
                File directory = new File("");//参数为空
                String courseFile = directory.getCanonicalPath();//获取当前工程地址
                FileWriter writer = new FileWriter(courseFile+"\\"+filename);
                SetFileName(courseFile+"\\"+filename);
                writer.write(str_);
                writer.close();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public String GetFileName()
    {
        return  filename;
    }

    public void SetFileName(String filename)
    {
        this.filename = filename;
    }


}
