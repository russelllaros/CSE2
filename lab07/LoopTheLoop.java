public class LoopTheLoop {
    public static void main(String[] args){
        int nStars = 10,counter = 0;
        while(nStars>counter){
            counter++;
            while(nStars>counter){
                System.out.print("*");
                counter++;
                }
                
            }
        System.out.println("");
    }
    
}