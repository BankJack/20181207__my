package test1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
       File file=new File("e:/abc");
        if(file.exists()){
            test1(file);
        }
    }

    /**
     * 递归删除
     * @param file
     */
    private static void test1(File file){
            File[] arr=file.listFiles();
            if(arr!=null&&arr.length>0){
                for (File f : arr) {
                    if(f.isFile())
                        f.delete();
                    else
                        test1(f);
                }
            }
        file.delete();
        }

    }

