package Rules;

import java.util.*;
public class GameRule {
    private String rule;



    public GameRule()
    {

    }

    public GameRule(String rule) {
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }


    @Override
    public String toString() {
        return "\nRULES OF THE GAME\n" + "There are two options in this game called the Easy and the Hard option.\n" + "Each option has 3 Rounds.\n" +
                "In each round of the easy, 3 questions are to be picked from the bank of questions.\n" + "If you successfully got through this round, you can either walk away at the end of round 1 and round 2\n" +
                "The same is applicable for the Hard option but has 5 question in each round\n" + "You have 3 lifelines available throughout this game\n" + "You can either request for 50/50, Ask the Audience, or Phone a Friend\n"
                + "You can only have access to the 3 lifelines in Round 2 and 3 for the Hard option but can access it from round 1 for the Easy option\n" +
                "If you miss any question, you will walk away with the amount on the last question in the previous round\n" + "GOOD LUCK!!!\n";
    }
}
