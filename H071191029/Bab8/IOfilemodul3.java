import java.io.*;
import java.util.Scanner;

class IOfilemodul3 {
	public static void main(String[] args) {
		Scanner ap = new Scanner(System.in);
		String filename = ap.next() + ".txt";

		int n = ap.nextInt();

		String name[] = new String[n];
		String id[] = new String[n];
		int year[] = new int[n];

		for (int i = 0; i < n; i++) {
			String nameTemp = ap.next().replaceAll("_", " ");
			name[i] = nameTemp.substring(0, Math.min(nameTemp.length(), 20));
            String idTemp = ap.next();
            id[i] = idTemp.substring(0, Math.min(idTemp.length(), 10));
			year[i] = ap.nextInt();
		}

		FileOutputStream out = null;
		try {
			out = new FileOutputStream(filename);
			PrintWriter writer = new PrintWriter(out);

		
			writer.println("+----------------------+------------+---------- +");
			writer.println("| Nama                 | NIM        | Angkatan |");
			writer.println("+----------------------+------------+----------+");
			for (int i = 0; i < n; i++)
				writer.printf("| %-20s | %-10s | %-8d |\n", name[i], id[i], year[i]);
			writer.println("+----------------------+------------+----------+");

			writer.flush();
			System.out.println("Berhasil");
		} catch (IOException e) {
			System.out.println("Gagal");
		} finally {
			try {
                if (out != null) 
                out.close();
			} catch (IOException e) {
				System.out.println(e);
				System.exit(1);
			}
		}
	}
}