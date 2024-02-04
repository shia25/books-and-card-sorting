import java.util.Comparator;

public class SortCards implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {

        int card1 = o1.getNumericValue();
        int card2 = o2.getNumericValue();

        if (card1 > card2) {
            return 1;
        } else if (card1 < card2) {
            return -1;
        } else {
            return 0;
        }
    }

}
