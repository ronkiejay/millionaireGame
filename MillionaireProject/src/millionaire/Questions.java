package millionaire;

public class Questions {
    private String quest;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char rightAnswer;

    public Questions()
    {

    }

    public Questions(String quest, String optionA, String optionB, String optionC, String optionD, char rightAnswer)
    {
        this.quest = quest;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.rightAnswer = rightAnswer;
    }

    public Questions(String optionA, String optionB, String optionC, String optionD)
    {
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public char getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(char rightAnswer) {
        this.rightAnswer = rightAnswer;
    }


    public char matchResponse(char match)
    {
        //char match ='\0';
        char answer = '\0';
        if(match == getOptionA().charAt(0) || match == getOptionB().charAt(0) || match == getOptionC().charAt(0) || match == getOptionD().charAt(0))
        {
            answer = match;
        }
        return answer;
    }




    @Override
    public String toString() {
        return "Question: " + quest + "\n" + getOptionA() + "\n" + getOptionB() + "\n" + getOptionC() + "\n" + getOptionD();
    }


}

