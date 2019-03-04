package Week2.IfStatements;
// activity 33
import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String room1;
        String kitchen;
        String upstairs;
        String refrigerator;
        String cabinet;
        String eat;
        String door;
        String color;

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE! ");
        System.out.println("\nYou are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"? ");
        System.out.print("> ");
        room1 = input.nextLine();
        if (room1.equals("kitchen")) {
            System.out.println("\nThere is a long countertop with dirty dishes everywhere. \nOff to one side there is, as you'd expect, a refrigerator. \nYou may open the \"refrigerator\" or look in a \"cabinet\"");
            System.out.print("> ");
            kitchen = input.nextLine();
            if (kitchen.equals("refrigerator")) {
                System.out.println("\nInside the refrigerator you see food and stuff. It looks pretty nasty. \nWould you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.print("> ");
                eat = input.nextLine();
                    if (eat.equals("yes")) {
                        System.out.println("You are going to get sick");
                    } else if (eat.equals("no")) {
                        System.out.println("You are going to die of starvation... eventually. ");
                    }
                }
        } else if (room1.equals("upstairs")) {
            System.out.println("\nUpstairs you see a hallway. At the end of the hallway is the master \"bedroom\". \nThere is also a \"bathroom\" off the hallway. Where would you like to go? ");
            System.out.print("> ");
            upstairs = input.nextLine();
            if (upstairs.equals("bedroom")){
                System.out.println("\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. \nIn the back of the room, the closet door is ajar (slightly open). \nWould you like to open the door? (\"yes\" or \"no\"?)");
                System.out.print("> ");
                door = input.nextLine();
                if (door.equals("yes")) {
                    System.out.println("\nTidy up this messy closet!!");
                } else if (door.equals("no")) {
                    System.out.println("\nWell, then I guess you will never know what was in there. Thanks for playing! \nI'm tired of making nested if statements! ");

                }
            } else if (upstairs.equals("bathroom")) {
                System.out.println("\nThis bathroom is called the lilac bathroom. \nDo you like the color? (\"yes\" or \"no\"?");
                System.out.print("> ");
                color = input.nextLine();
                if (color.equals("yes")) {
                    System.out.println("\nYou have good taste for colors!");
                } else if (color.equals("no")) {
                    System.out.println("\nYou don't have good taste for colors!! ");
                }
            }
        }
    }
}
