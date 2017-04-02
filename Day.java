import java.util.Scanner;
/**
 *
 * @author Kevin Kovack
 */
public class Day 
{
    String today;
    int dayPosition;
    String[] week = {"Sun","Mon","Tues","Wednes","Thurs","Fri","Satur"};

    public Day()
    {
        dayPosition = 0;
        today = week[dayPosition];
    }
    
    public Day(int num)
    {
        num%=7;
        dayPosition = num;
        today = week[dayPosition];
    }
    
    public Day(String theDay)
    {
        switch(theDay)
        {
                case "Sun":     dayPosition = 0;
                                today = week[dayPosition];
                                break;
                case "Sunday":  dayPosition = 0;
                                today = week[dayPosition];
                                break;
                case "Mon":     dayPosition = 1;
                                today = week[dayPosition];
                                break;
                case "Monday":  dayPosition = 1;
                                today = week[dayPosition];
                                break;
                case "Tues":     dayPosition = 2;
                                today = week[dayPosition];
                                break;
                case "Tuesday":  dayPosition = 2;
                                today = week[dayPosition];
                                break;
                case "Wed":     dayPosition = 3;
                                today = week[dayPosition];
                                break;
                case "Wednesday":  dayPosition = 3;
                                today = week[dayPosition];
                                break;
                case "Thurs":     dayPosition = 4;
                                today = week[dayPosition];
                                break;
                case "Thursday":  dayPosition = 4;
                                today = week[dayPosition];
                                break;
                case "Fri":     dayPosition = 5;
                                today = week[dayPosition];
                                break;
                case "Friday":  dayPosition = 5;
                                today = week[dayPosition];
                                break;
                case "Sat":     dayPosition = 6;
                                today = week[dayPosition];
                                break;
                case "Saturday":  dayPosition = 6;
                                today = week[dayPosition];
                                break;
                default:
                                dayPosition = 0;
                                today = week[dayPosition];
                                break;
        }
        
                
    }
    
    public void setDay()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Set the day:"
                + "\n0: Sunday"
                + "\n1: Monday"
                + "\n2: Tuesday"
                + "\n3: Wednesday"
                + "\n4: Thursday"
                + "\n5: Friday"
                + "\n6: Saturday"
                + "\n"
                + "\n>>");
        today=week[kb.nextInt()];
    }
    
    public String toString()
    {
        return today+"day";
    }
    
    public void printDay()
    {
        System.out.println("Today is "+today+"day.");
    }
    
    public Day returnDay()
    {
        return this;
    }
    
    public Day returnTomorrow()
    {
        Day tomorrow = new Day();
        tomorrow.dayPosition = this.dayPosition++;
        tomorrow.today = week[dayPosition];
        return tomorrow;
    }
    
    public Day returnYesterday()
    {
        Day yesterday = new Day();
        yesterday.dayPosition = this.dayPosition++;
        yesterday.today = week[dayPosition];
        return yesterday;
    }
    
    public void add(int num)
    {
        num%=7;
        for(int i=1;i<=num;i++)
        {
            this.dayPosition++;
            if(this.dayPosition==7)
                this.dayPosition=0;
            this.today=week[dayPosition];
        }
    }
    
    public void subtract(int num)
    {
        num%=7;
        for(int i=1;i<=num;i++)
        {
            this.dayPosition--;
            if(this.dayPosition==-1)
                this.dayPosition=6;
            this.today=week[dayPosition];
        }
    }
}
