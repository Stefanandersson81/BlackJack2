/**
 * Created by Stefan Andersson
 * OOP kurs med Mahmud
 * Date :2019-12-04
 * Time :20:47
 * Project-Name : inlämning3.3
 */
public class Cards {
    private Suits cardSuit;
    private int cardNum;
    private String[] numString = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    /**
     * Cards constructor
     * card suit and card number
     * all to toString
     * @param sType
     * @param sNum
     */
    public Cards(Suits stype, int snum){

        this.cardSuit = stype;

        if(snum >=1 && snum <= 13)
            this.cardNum  = snum;
        else{

            System.err.println(snum+" is not a valid card number\n");
            System.exit(1);
        }
    }

    public int getCardNumber(){

        return this.cardNum;
    }

    public String toString(){

        return this.numString[this.cardNum - 1]+" of "+this.cardSuit.toString();
    }



}

