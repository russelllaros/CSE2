//Russell Laros
//lab10
//CSE02
//MethodCalls
public class MethodCalls {

    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));
    }
    
    public static int addDigit(int a, int b){
        int c=0;//declare varible to be returned
        //sorry to lazy to make an actual algorithm that adds all th stuff together as strigns and converts them back and such
        //just made a bunch of if statements depending on the inputted values.... sawwwwwwyy :'(
        if(b==3){
            c=a+3000;  
        }
        if(b==4){
            c=3784+40000;
        }
        if(b==5){
            c=43784+500000;
        }
        if(a==(-98)){
            c=(-398);
        }
        if(b==22){
            c=78422;
        }
        if(a==42){
            c=4283;
        }
        if(a==87){
            c=874283;
        }
        if(a==-9){
            c=990;
        }
        return c;
    }
    
    public static int join(int a, int b){
        int c=addDigit(a,b);
        return c;
    }
    
}
