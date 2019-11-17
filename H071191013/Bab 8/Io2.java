import java.io.*;
import java.util.*;
class Io2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input nama file yang akan di duplikat :");
        String namaFileLama = input.next() + ".txt"; 
        System.out.println("Input nama file baru : ");
        String namaFileBaru = input.next()+ ".txt";

        FileReader fr1 = null;
        BufferedReader br1 = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try 
        {
            fr1 = new FileReader(namaFileLama);
            br1 = new BufferedReader(fr1);
                    
            String s1;
            String content = "";

            while ((s1 = br1.readLine()) != null)
            {
                content += s1;
                content += "\n";
            }       
            fw = new FileWriter(namaFileBaru);
            pw = new PrintWriter(fw);
                    
            pw.println(content);

            System.out.println("\nIsi file baru :");
            System.out.println(content);
            System.out.println("Berhasil");

        }
        catch (Exception ioe)
        {
            System.out.println("Gagal");
        }
        finally
        {
            try {
                if (fr1 != null)
                {
                    fr1.close();
                }
                if (br1 != null)
                {
                    br1.close();
                }
                if (fw != null)
                {
                    fw.close();
                }
                if (pw != null)
                {
                    pw.close();
                }
            }
            catch (Exception ioe)
            {
                System.out.println(ioe.getMessage());
            }   
        }
    }
}