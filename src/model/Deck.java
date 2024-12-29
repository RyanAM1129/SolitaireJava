package model;

import java.util.Random;
import java.util.Stack;

enum cardValues {
    joker {int value = 0; boolean faceCard = true;},
    ace {int value = 1; boolean faceCard = false;},
    two {int value = 2; boolean faceCard = false;},
    three {int value = 3; boolean faceCard = false;},
    four {int value = 4; boolean faceCard = false;},
    five {int value = 5; boolean faceCard = false;},
    six {int value = 6; boolean faceCard = false;},
    seven {int value = 7; boolean faceCard = false;},
    eight {int value = 8; boolean faceCard = false;},
    nine {int value = 9; boolean faceCard = false;},
    ten {int value = 10; boolean faceCard = false;},
    jack {int value = 11; boolean faceCard = true;},
    queen {int value = 12; boolean faceCard = true;},
    king {int value = 14; boolean faceCard = true;}
}

public class Deck {
    Stack<Integer> myStack;
    int[] myCardList;

    public Deck(int size, boolean faceCards, boolean numberCards) {
        Random theNumberGen = new Random();
        myStack = new Stack<>();
        myCardList = new int[size+1];
        for (int i = 0; i < size; i++) {
            if(faceCards) {
                theNumberGen.nextInt(1, 15);
            } else {
                theNumberGen.nextInt(1, );
            }
        }
    }
}
