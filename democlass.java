
class calculator{
    
    public int sum(int x, int y){
        
    
    int result= x+y;
System.out.println(result);
    return result;

}
public int multiply(int x,int y){
    int res= x*y;
    System.out.println(res);
   
return res;
}
public int sub(int x, int y){
    int res2= x-y;
    System.out.println(res2);
    return res2;

}
public int div(int x,int y){
    int res3= x/y;
    System.out.println(res3);
    return res3;

}
public int mod(int x, int y){
    int res4= x%y;
    System.out.println(res4);
    return res4;
}
public void  display(){
    System.out.println("Calculator working");
    

}
public String calcdisplay( String X){
    System.out.println("my calculator");
    return X;

}
}


class democlass{
    public static void main(String[] args) {
        int a=5;
         int b=5;
        calculator c= new calculator();
        c.sum(a,b);
        c.multiply(a,b);
        c.sub(a, b);
        c.div(a, b);
        c.mod(a, b);
        c.display();
        c.calcdisplay("");
        
    }
}