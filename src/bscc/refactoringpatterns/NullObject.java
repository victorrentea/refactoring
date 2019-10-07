package bscc.refactoringpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NullObject {
    private List<String> stringuri = new ArrayList<>();

    public static void main(String[] args) {
        parseInts(null);
    }

    static List<Integer> parseInts(List<String> numere) {
//        if (numere == null) {
//            return Collections.emptyList();
//        }
        return numere.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    List<Double> parseDouble(List<String> numere) {
//        if (numere == null) {
//            return Collections.emptyList();
//        }
        return numere.stream().map(Double::new).collect(Collectors.toList());
    }
}


class MemberCard {
    public static final MemberCard NO_MEMBER_CARD = new MemberCard();
    private String email, undeLocuiesti,aiCopii;
    private int points;

    public int getPoints() {
        return points;
    }
}
// @Entity
class Customer {
    private MemberCard card;// = MemberCard.NO_MEMBER_CARD;

    public Optional<MemberCard> getCard() {
        return Optional.ofNullable(card);
    }
}

class PriceService {
    void computePrice(Customer customer) {
//        if (customer.getCard()!=  null) {
//        System.out.println("aplica reducerea pe " + customer.getCard().getPoints());
        System.out.println("aplica reducerea pe " +
                customer.getCard().map(MemberCard::getPoints).orElse(0));
////        }
    }
}