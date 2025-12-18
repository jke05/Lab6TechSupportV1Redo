import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    
    
    public RandomTester()
    {
        
    }

    public int printOneRandom(){
        Random generator = new Random();
        int number = generator.nextInt();
        return number;
    }
    
    public void printMultiRandom(int howMany){
        Random generator = new Random();
        for (int i = 0; i < howMany; i++){
            int number = generator.nextInt();
            System.out.println(number);
        }
    }
}