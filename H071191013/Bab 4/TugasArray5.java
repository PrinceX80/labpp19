class TugasArray5 {
    public static void main(String[] args) {
        char[] a = {'F', 'I', 'T',};
        char[] b = {'R', 'A', 'H'};
        char[] c = new char[a.length > b.length?b.length:a.length];
        System.out.println(a + " ");
        System.out.println(b + " "); 
        for (int i = 0; i < c.length; i++){
            c[i] = a[i];
            a[i] = b[i];
            b[i] = c[i];     
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]+ " ");
        }
        
       

    }
}