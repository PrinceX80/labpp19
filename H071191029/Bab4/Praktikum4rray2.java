class Praktikum4rray2{

    public static void main(String[] args){

        char a[] = {'A','N','N','I','S','A'};
        char b[] = {'P', 'U', 'T','R','I'};
        char save[] = new char[(a.length < b.length ? a.length:b.length)];
        System.out.print("a = {");
        for (int i=0; i< a.length; i++){
            System.out.printf("%c%s",a[i], i == a.length - 1 ? "}":" ");
        }
        System.out.println();
        System.out.print("b ={");
        for (int i=0; i<b.length; i++){
            System.out.printf("%c%s",b[i], i == b.length - 1 ? "}":" ");
        }
        System.out.println(); 
        for(int i = 0; i < save.length; i++){
            save[i] = a[i];
            a[i] = b[i];
            b[i] = save[i];
    }
        System.out.println(" A <-> B");
        System.out.print("a = {");
        for(int i = 0; i < a.length; i++){
        System.out.printf("%c%s",a[i], i == a.length - 1 ? "}":" ");
    }
        System.out.println();
        System.out.print("b = {");
        for(int i = 0; i < b.length; i++){
        System.out.printf("%c%s",b[i], i == b.length - 1 ? "}":" ");
    }
  }
}