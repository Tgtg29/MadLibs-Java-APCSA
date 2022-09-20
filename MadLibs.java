import java.util.Scanner;
/**
 * Write a description of class MadLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadLibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please fill in the blanks:");
        
        System.out.print("Name: ");
        String name = input.nextLine();
        
        System.out.print("Date: ");
        String date = input.nextLine();
        
        System.out.print("Noun1/Name: ");
        String noun1 = input.nextLine();
        
        System.out.print("Number1: ");
        int num1 = input.nextInt();
        
        System.out.print("Verb1(past tense): ");
        String space = input.nextLine();      
        String verb1 = input.nextLine();
        
        System.out.print("Noun2: ");
        String noun2 = input.nextLine();
        
        System.out.print("Adjective1: ");
        String adj1 = input.nextLine();
        
        System.out.print("Adjective2: ");
        String adj2 = input.nextLine();
        
        System.out.print("Noun3: ");
        String noun3 = input.nextLine();
        
        System.out.print("Adjective3: ");
        String adj3 = input.nextLine();
        
        System.out.print("Noun4: ");
        String noun4 = input.nextLine();
        
        System.out.print("Verb2: ");
        String verb2 = input.nextLine();
        
        System.out.print("Verb3: ");
        String verb3 = input.nextLine();
        
        System.out.print("Verb4: ");
        String verb4 = input.nextLine();
        
        System.out.print("Noun5: ");
        String noun5 = input.nextLine();
        
        System.out.print("Verb5: ");
        String verb5 = input.nextLine();
        
        System.out.print("Noun6: ");
        String noun6 = input.nextLine();
    
        System.out.print("Verb6: ");
        String verb6 = input.nextLine();
        
        System.out.print("Noun7: ");
        String noun7 = input.nextLine();
        
        System.out.print("Noun8: ");
        String noun8 = input.nextLine();
        
        System.out.println(name + " " + date + "\n" + "My name is " + noun1 + " and ive known Jade and Sean for " + num1 + " years.");
        System.out.println("I " + verb1 + " all the way from " + noun2 + " to celebrate this day.");
        System.out.println("I am so " + adj1 + " that Jade and Sean are tying the knot!");
        System.out.println("They have to be the most " + adj2 + " " + noun3 + " and I wish them " + adj3 + " " + noun4 + " for years to come.");
        System.out.println("My best advice? Don't forget to " + verb2 + " before you " + verb3 + " and " + verb4 + " after the " + noun5 + ".");
        System.out.println("Sean, you should always " + verb5 + " Jade's " + noun6 + " and Jade you should always " + verb6 + " Sean's " + noun7 + ".");
        System.out.println("I wish you both a lifetime of happiness and " + noun8 + ".");
        System.out.println("xoxo " + noun1);
    }
}
