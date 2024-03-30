package chap0403;
class Printer{
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

     public void print(int amount){
        if (duplex){
            if (numOfPapers <= 0)
                System.out.println("용지가 부족합니다.");
            else if (numOfPapers >= ((amount/2)+(amount%2))){
                numOfPapers -= ((amount/2)+(amount%2));
                System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", ((amount/2)+(amount%2)), numOfPapers);
            }
            else if (numOfPapers < ((amount/2)+(amount%2))) {
                System.out.printf("양면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n",(((amount/2)+(amount%2))-numOfPapers),numOfPapers);
                numOfPapers -= numOfPapers;
            }
        }
        else {
            if (numOfPapers >= amount){
                numOfPapers -= amount;
                System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
            }
            else if (numOfPapers <= 0)
                System.out.println("용지가 부족합니다.");
            else if (numOfPapers < amount){
                System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (amount-numOfPapers), numOfPapers);
                numOfPapers -= numOfPapers;
            }
        }

    }

    public boolean getDuplex(){
        return duplex;
    }

    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
}

public class 도전과제3 {
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}