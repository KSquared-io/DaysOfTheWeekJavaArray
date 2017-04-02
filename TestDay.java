/**
 *
 * @author Kevin Kovack
 */
public class TestDay 
{
    public static void main(String[] args)
    {
        Day day1 = new Day();
        System.out.println(day1);
        
        Day day2 = new Day(3);
        System.out.println(day2);
        
        Day day3 = new Day("Sat");
        System.out.println(day3);
        
        Day day4 = new Day("Sunday");
        System.out.println(day4);
        
        System.out.println("\n\n");
        
        System.out.println(day1);
        day1.add(3);
        System.out.println(day1);
        day1.subtract(4);
        System.out.println(day1);
        
        System.out.println("\n\n");
        
        System.out.println(day1);
        day1.add(14);
        day1.subtract(13);
        System.out.println(day1);
        
    }
}
