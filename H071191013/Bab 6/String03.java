class String2{
    public static void main(String[] args) {
        String m = "BBHIHI GFIFIUB";
        String a = "";
        String b = "";
        char[] n = m.toLowerCase().toCharArray();
        for (int i =0; i < n.length; i++){
            if(n[i] == 'b'){
                a += "Bazz";
            }else if (n[i] == 'f'){
                b += "Fizz";
            }
        }
        System.out.println(a+" "+b);
        
            
        

    }
}