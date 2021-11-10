//This program is to copy from one file to another file.
import java.io.*;
class showFile{
    public static void main(String args[])throws IOException,FileNotFoundException{
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        fin=new FileInputStream("data.txt");
        fout=new FileOutputStream("data_copy.txt");

        do{
            i=fin.read();
            fout.write(i);
        }while(i != -1);
        fin.close();
        fout.close();
    }
}