public class cl {
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
    public static void main(String args[]){
        cl calc = new cl();
        int result = calc.add(12,13);
        System.out.println(result);

    }
    
}
