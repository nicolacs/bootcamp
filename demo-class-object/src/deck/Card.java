package deck;
import java.util.Arrays;
public class Card {

  //!!! Make you know the difference between instance variable, static variable, static final variable

  // String -> good presentation, built-in equals() & compareTo()
  // "01", "02", "09, "10", "JACK", "QUEEN", "KING"
  private Rank rank;  // int vs char 諗下定咩TYPE先 將來邊個著數
                    // A,2,3,4,5,6,7,8,9,T,J,Q,K
  private Suit suit; //  String 既話equals 等等要call method, int, char: 上面用char 避免都係用char
                      // Diamond, Club, Heart, Spade
                      
       public Card(Rank rank, Suit suit) {
        this.rank = rank;
         this.suit = suit;
   }
// get , set
  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  // instance method
  // c1.compareTo(c2)
  //this -> c1
  //card -> c2
  public int compareTo(Card card) {
    // fixed rules
    // this (address) vs card (address)
    int rankResult = this.rank.compareTo(card.getRank());
    if (rankResult == 0) {
      if (this.suit.compareTo(card.getSuit()) == 0) { //
        return 0;
      } else if (this.suit.compareTo(card.getSuit()) > 0) { //
        return 1;
      } else {
        return -1;
      }
    }
    return rankResult;
  }

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ", suit=" + this.suit //
        + ")";
  }
  public static void main(String[] args) {
    // valueOf(''),
    Card c1 = new Card(Rank.ofACE(), Suit.ofDiamond());
    Card c2 = new Card(Rank.ofACE(), Suit.ofClub());
    Card c3 = new Card(Rank.ofJACK(), Suit.ofDiamond());
    Card c4 = new Card(Rank.ofJACK(), Suit.ofDiamond());

    System.out.println(c2.compareTo(c1)); // 1
    System.out.println(c1.compareTo(c2)); // -1
    System.out.println(c1.compareTo(c3)); // 1
    System.out.println(c4.compareTo(c3)); // 0

    ComparisonUtil.compareTwoCard(c1, c2); // 1
    ComparisonUtil.compareTwoCard(c2, c1); // -1
    ComparisonUtil.compareTwoCard(c1, c3); // 0

    // Card.CLUB = 10; // final variable cannot be modified
  }
}