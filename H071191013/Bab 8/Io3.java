import java.io.*;
import java.util.*;
class Io3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input nama file yang akan disalin ");
        String fileLama = sc.next() + ".txt";
        System.out.println("Input nama file baru");
        String fileBaru = sc.next() + ".txt";
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try 
        {
            fr = new FileReader(fileLama);
            br = new BufferedReader(fr);
                    
            String s1;
            fw = new FileWriter(fileBaru);
            pw = new PrintWriter(fw);

            while ((s1 = br.readLine()) != null) 
            {
                pw.println(String.format("%20s" , s1));
            }
            System.out.println("\nIsi file baru :");
            System.out.println("Berhasil");

        }
        catch (Exception ioe)
        {
            System.out.println("Gagal");
        }
        finally
        {
            try 
            {
                if (fr != null)
                {
                    fr.close();
                }
                if (br != null)
                {
                    br.close();
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