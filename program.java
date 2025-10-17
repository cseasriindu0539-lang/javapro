public class GFG{
    public static void main(String[] args){
        
       
     int m = 9, n = 5; //this is my changes in the second time
        System.out.println("Before swapping: m = " + m + ", n = " + n);//after thiswe look for the chnges commitedor not

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}
