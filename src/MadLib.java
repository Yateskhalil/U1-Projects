import java.util.Scanner;

public class MadLib {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String nounPl;
        String place;
        String noun;
        String noun2;
        String nounPl2;
        String adj;
        String verb;
        String num;
        String adj2;
        String bdy;
        String verb2;

        System.out.println("Name two plural nouns");
        nounPl= read.nextLine();
        nounPl2= read.nextLine();

        System.out.println("Name a place");
        place=read.next();

        System.out.println("Name a noun");
        noun=read.next();
        System.out.println("Name another noun");
        noun2=read.next();


        System.out.println("Name two adjectives");
        adj=read.nextLine();
        adj2=read.next();

        System.out.println("Name two verbs");
        verb=read.nextLine();
        verb2=read.next();

        System.out.println("Name a number");
        num=read.next();

        System.out.println("Name a body part");
        bdy= read.next();

        System.out.println("Two "+ nounPl +" both alike in dignity, in fair " + place+ " , where we lay our scene, from ancient "+ noun +
                " break to new mutiny, Where civil blood makes civil hands unclean. From fourth the fatal loins of these two foes A pair of star-cross'd "
                +nounPl2+" take their life Whole misadventured piteous overthrows Do their " +noun2+
                "bury their parents strife. The fearful passage of their "+ adj+ " love, And the " +
                " continuous of their parents rage, which, but their children's end, nought could "+ verb+", is now the " +num+" hours traffic of our stage; " +
                "The which if you with "
                + adj2 + " " +bdy + " attend, what here shall "+ verb2 +" our toil shall strive to mend.");




    }
    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
}