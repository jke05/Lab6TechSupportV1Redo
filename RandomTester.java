import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random generator = new Random();
    private Random multiGenerator = new Random();
    private Random dice = new Random();
    
    public RandomTester()
    {
        
    }

    public int printOneRandom(){
        int number = generator.nextInt();
        return number;
    }
    
    public void printMultiRandom(int howMany){
        for (int i = 0; i < howMany; i++){
            int number = multiGenerator.nextInt();
            System.out.println(number);
        }
    }
    
    public int rollDice(){
        int roll = dice.nextInt(6) + 1;
        return roll;
    }
}