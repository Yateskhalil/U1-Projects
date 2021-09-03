import javax.swing.*;

public class Sales {

    public static void main(String[] args) {

    double saleprice,discountcon,subtotal,taxtotal1,taxtotal2,taxcon,finalpr1,finalpr2;
    int saletax,discount, quantity;

    saleprice=Double.parseDouble(JOptionPane.showInputDialog("What is the sale price?"));
    quantity=Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
    saletax=Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax?"));
    discount=Integer.parseInt(JOptionPane.showInputDialog("What is the discount?"));

    discountcon=discount*0.01;
    taxcon=saletax*0.01;
    taxtotal1=taxcon*saleprice;
    subtotal=quantity*saleprice;
    taxtotal2=subtotal+taxtotal1;
    finalpr1=discountcon*taxtotal2;
    finalpr2=taxtotal2-finalpr1;
    /*int finalrnd=(int)Math.round(*10.0)/10.0;*/



        JOptionPane.showMessageDialog(null, "subtotal: "+taxtotal2 +  " tax total: "+taxtotal1+" total cost: "+finalpr2+" .");

        System.exit(0);
    }
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.
    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.
    Example:
    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7
    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
