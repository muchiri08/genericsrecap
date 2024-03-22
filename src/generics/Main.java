/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pairOne = new OrderedPair<>("one", 1);
        Pair<String, Integer> pairTwo = new OrderedPair<>("two", 2);

        boolean match = Util.compare(pairOne, pairTwo);
        if (match) {
            System.out.println("matches");
        } else {
            System.out.println("not match");
        }

        Money money = new Money(65);
        System.out.println("Comp: " + money.compareTo(new Money(65)));

        Money[] moneys = {new Money(50), new Money(60), new Money(70), new Money(80), new Money(90)};
        int count = Util.countGreaterThanElements(moneys, money);
        System.out.println("Count: "+count);
        
        List<String> names = Arrays.asList("Kennedy", "Mbogo", "Muchiri");
        Util.printList(names);
    }

    public static class Money implements MyComparable<Money> {

        Integer amount;

        public Money(Integer amount) {
            this.amount = amount;
        }

        @Override
        public int compareTo(Money t) {
            if (amount > t.amount) {
                return 1;
            } else if (amount < t.amount) {
                return -1;
            } else {
                return 0;
            }
        }

    }
}
