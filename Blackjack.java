import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        scan.nextLine();
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();


        int userScore = 0;
        int dealerScore = 0;

        int card_1 = drawRandomCard();
        int card_2 = drawRandomCard();

        String randomCard_1 = cardString(card_1);
        String randomCard_2 = cardString(card_2);

        userScore += ( card_1 + card_2);

        System.out.println("\n You get a \n" + randomCard_1 + "\n and a \n" + randomCard_2);
        System.out.println("your total is: " + (card_1 + card_2) + " \n");


        int dealerCard_1 = drawRandomCard();
        int dealerCard_2 = drawRandomCard();

        dealerScore += (dealerCard_1 + dealerCard_2);


        System.out.println("The dealer shows \n" +   faceDown() + "\nand has a card facing down \n" +  faceDown() + "\n");
        System.out.println("\nThe dealer's total is hidden \n");


        while(true){
            System.out.println("Do you want to hit or stay ?  \n");
            String playerResult = hitOrStay();
                if(playerResult.equals("hit")){
                    int randomCard = drawRandomCard();
                    userScore += randomCard;
                    System.out.println("\n You get a \n" + cardString(randomCard));
                    System.out.println("your new total is " + userScore);
                }else{
                    break;
                }

            if(userScore > 21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }}





        System.out.println(" \n  \n Dealer's turn" );
        System.out.println("The dealer's cards are \n" + cardString(dealerCard_1) + "\n and a \n" + cardString(dealerCard_2));



        scan.nextLine();


while(dealerScore < 17){

    int newCard = drawRandomCard();
    dealerScore += Math.min(newCard,10);
    System.out.println("\n Dealer gets a \n" + cardString(newCard));
    System.out.println("Dealer's total is " + dealerScore);

}


if (dealerScore > 21) {
      System.out.println("Bust! Dealer loses! With a score: " + dealerScore);
      System.exit(0);
  }


if(userScore > dealerScore){
    System.out.println("Player wins! With score: " + userScore + " and dealer score is: " + dealerScore);
}else if(dealerScore > userScore){
    System.out.println("Dealer wins! With score: " + dealerScore + " and user score is: " + userScore);
} else{
    System.out.println("It's a tie! Dealer score: " + dealerScore + " and user score: " + userScore);
}



        System.out.println(dealerScore);




        scan.close();

    }




    public static int drawRandomCard(){
        return (int) (Math.random()*13+1);
    }







    public static String cardString(int cardNumber){

        return switch(cardNumber){

            case 1 ->

            "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";

            case 2 ->

            "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";

            case 3 ->
            "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";

            case 4 ->
            "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5 ->
            "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6 ->
            "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7 ->

            "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8 ->

            "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

            case 9 ->
            "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10 ->
            "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

            case 11 ->

            "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n";

            case 12 ->

            "   _____\n" +
                    "  |Q  ww|\n"+
                    "  | o {(|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%O|\n";

            case 13 ->
            "   _____\n" +
                    "  |K  WW|\n"+
                    "  | o {)|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%>|\n";

            default -> "Invalid Card";
        };

    }



    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }




    public static String hitOrStay(){
        String playerResult = scan.nextLine();
        if(!playerResult.equals("hit") && !playerResult.equals("stay")){
            System.out.println("Please write hit or stay");
        }

        return playerResult;
    };




    }

