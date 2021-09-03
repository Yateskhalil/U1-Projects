import javax.swing.JOptionPane;

public class RPGCharacter {
    public static void main(String[] args) {


        String name;
        int knowledge, strength;
        double spelldmage, battledamage;



        name = JOptionPane.showInputDialog("What is your name?");
        strength= Integer.parseInt(JOptionPane.showInputDialog("What is " + name + " 's Strength level?"));
        knowledge=Integer.parseInt(JOptionPane.showInputDialog("What is "+  name + " 's Knowledge level?"));

        spelldmage=knowledge*1.5;

        battledamage=strength* knowledge;

        JOptionPane.showMessageDialog(null, ""+name+"'s character has the strength level of "+strength+",the knowledge level of "+ knowledge+ " ," +
                "the spell damage of "+spelldmage+ ",and the battle damage of "+ battledamage+" ." );

        System.exit(0);
    }

   /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
}
