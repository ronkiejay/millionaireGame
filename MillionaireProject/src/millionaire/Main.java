package millionaire;

import java.sql.SQLOutput;
import java.util.*;
import Rules.GameException;
import Rules.GameRule;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //creating an arraylist to store a bank of questions for easy and hard option
        ArrayList<Questions> question = new ArrayList();
        ArrayList<String> answeredQuestion = new ArrayList();

        //ArrayList<Questions> hardQuestion = new ArrayList();

        //All questions stored in the bank
        question.add(new Questions("Which city is the capital of the United States", "A. Seattle", "B. Albany", "C. Washington D.C", "D. Los Angeles", 'C'));
        question.add(new Questions("Harvard University is located in which city?", "A. Providence", "B. Cambridge", "C. New York", "D. Washington D.C", 'B'));
        question.add(new Questions("Which apollo mission was the first to land on the moon?", "A. Apollo 9", "B. apollo 10", "C. apollo 13", "D. apollo 11", 'D'));
        question.add(new Questions("Which of these countries remained neutral during World War II", "A. Switzerland", "B. United Kingdom", "C. France", "D. Italy", 'A'));
        question.add(new Questions("The collapse of the Soviet Union took place in which year?", "A. 1982", "B. 1991", "C. 1891", "D. 1990", 'B'));
        question.add(new Questions("Which element has the highest melting point?", "A. Tungsten", "B. Platinum", "C. Carbon", "D. Osmium", 'C'));
        question.add(new Questions("What is the fastest land animal?", "A. Lion", "B. Thomson Gazelle", "C. Pronghorn Antelope","D. Cheetah", 'D'));
        question.add(new Questions("What is the scientific name for modern day humans?", "A. Homo Sapiens", "B. Homo Ergaster", "C. Homo Erectus", "D. Homo Neanderthalensis", 'A'));
        question.add(new Questions("What is the collective noun for a group of crows?", "A. Gaggle", "B. Murder", "C. Pack", "D. Herd", 'B'));
        question.add(new Questions("Which country is the home of the largest Japanese population outside of Japan", "A. China", "B. Russia", "C. Brazil", "D. The United States", 'C'));
        question.add(new Questions("What does LASER stand for?", "A. Light amplification by stimulated emission of radiation", "B. Lite analysing by stereo ecorazer", "C. Light amplifier by standby energy of radio", "D. Life antimatter by standing entry of range", 'A'));
        question.add(new Questions("What color is the female blackbird?", "A. Black", "B. Brown", "C. White", "D. Yellow", 'B'));
        question.add(new Questions("What is the capital of Denmark?", "A. Aarhus", "B. Odense", "C. openhagen", "D. Aalborg", 'C'));
        question.add(new Questions("Who discovered Penicillin?", "A. Marie Curie", "B. Alfred Nobel", "C. Louis Pasteur", "D. Alexander Fleming", 'D'));
        question.add(new Questions("To what political party did Abraham Lincoln belong when elected POTUS?", "A. Democrat", "B. Republican", "C. Independent", "D. Whig", 'B'));
        question.add(new Questions("How old was Adolf Hitler when he died?", "A. 56", "B. 43", "C. 65", "D. A47", 'A'));
        question.add(new Questions("How many legs do butterflies have?", "A. 6", "B. 2", "C. 4", "D. 0", 'A'));
        question.add(new Questions("Which of the following Japanese islands is the biggest?", "A. Hokkaido", "B. Shikoku", "C. Kyushu", "D. Honshu", 'D'));
        question.add(new Questions("The medical term for the belly button is which of the following?", "A. Umbilicus", "B. Nevus", "C. Nares", "D. Paxillus", 'A'));
        question.add(new Questions("How many planets are in the solar system", "A. Nine", "B. Eight", "C. Seven", "D. Ten", 'B'));
        question.add(new Questions("Whistler was the codename of this Microsoft Operating System", "A. Windows 2000", "B. Windows XP", "C. Windows 7", "D. Windows 95", 'B'));
        question.add(new Questions("Which of the following is not an official development name for a Ubuntu release?", "A.Mystic Mansion", "B. Trusty Tahr", "C. Utopic Unicorn", "D. Wily Werewolf", 'A'));
        question.add(new Questions("Who was the only president to not be in office in Washington D.C?", "A. Abraham Lincoln", "B. Richard Nixon", "C. George Washington", "D. Thomas Jefferson", 'C'));
        question.add(new Questions("Which president erased the national debt of the United states?", "A. Ronald Reagan", "B. John F. Kennedy", "C. Franklin Roosevelt", "D. Andrew Jackson", 'D'));
        question.add(new Questions("Who is the lead singer of Silverchair?", "A. Gen Gillies", "B. Daniel Johns", "C. Chris Joannou", "D. George Costanza", 'B'));
        question.add(new Questions("From which country does the piano originate?", "A. Italy", "B. Germany", "C. Austria", "D. France", 'A'));
        question.add(new Questions("Which actress's real name was Frances Ethel Gumm?", "A. Doris Day", "B. Julie Andrews", "C. Marilyn Monroe", "D. Judy Garland", 'D'));
        question.add(new Questions("In the hexadecimal system, what number comes after 9?", "A. 10", "B. The letter A", "C. The Number 0", "D. 16", 'B'));
        question.add(new Questions("How many zeros are there in a googol?", "A. 100", "B. 10", "C. 1,000", "D. 1,000,000", 'A'));
        question.add(new Questions("Before 2016, in which other year did Donald Trump run for President?", "A. 2012", "B. 1988", "C. 2000", "D. 2008", 'C'));
        question.add(new Questions("What year did Gerald Ford become President?", "A. 1977", "B. 1973", "C. 1974", "D. 1969", 'C'));
        question.add(new Questions("In the server hosting industry IaaS stands for ...", "A. Infrastructure as a Service", "B. Internet as a Service", "C. Internet and a Server", "D. Infrastructure as a Server", 'A'));
        question.add(new Questions("Which coding language was the #1 programming language in terms of GitHub in 2015?", "A. C#", "B. Python", "C. JavaScript", "D. PHP", 'C'));
        question.add(new Questions("What was the name of Marilyn Monroe's first husband?", "A. Joe Dimaggio", "B. James Dougherty", "C. Kirk Douglas", "D. Arthur Miller", 'B'));
        question.add(new Questions("What year did radio icon Howard Stern start a job at radio station WNBC?", "A. 1982", "B. 1985", "C. 1984", "D. 1995", 'A'));
        question.add(new Questions("How old was Muhammad Ali when he died?", "A. 74", "B. 61", "C. He's still alive", "D. 56", 'A'));
        question.add(new Questions("What is the alphanumeric representation of the imaginary number?", "A. e", "B. n", "C. i", "D. x", 'C'));
        question.add(new Questions("Which television show has Dan Gheesling been on?", "A. Big Brother", "B. Jeopardy", "C. Survivor", "D. The Bachelor", 'A'));
        question.add(new Questions("A doctor with a PhD is a doctor of what?", "A. Philosophy", "B. Psychology", "C. Phrenology", "D. Physical Therapy", 'A'));
        question.add(new Questions("Which language is NOT Indo-European?", "A. Hungarian", "B. Russian", "C.Greek", "D. Latvian", 'A'));
        question.add(new Questions("What character was once considered to be the 27th letter of the alphabet?", "A. Ampersand", "B. Interrobang", "C. Tilde", "D. Pilcrow", 'A'));
        question.add(new Questions("What Greek letter is used to signify summation?", "A. Delta", "B. Alpha", "C. Sigma", "D. Omega", 'C'));
        question.add(new Questions("Which of the following dice is not a platonic solid?", "A. 12-sided die", "B. 10-sided die", "C. 20-sided die", "D. 8-sided die", 'B'));
        question.add(new Questions("Moby, an American DJ, singer, and musician, achieved worldwide success for the 1999 release of which of the follwoing albums?", "A. Everything is Wrong", "B. Moby", "C. Play", "D. 18", 'C'));
        question.add(new Questions("All of the following programs are classified as raster graphics editors EXCEPT:", "A. Paint.NET", "B. GIMP", "C. Inkscape", "D. Adobe Photoshop", 'C'));
        question.add(new Questions("In programming, the ternary operator is mostly defined with what symbol(s)?", "A. ??", "B. ?:", "C. if then", "D. ?", 'B'));
        question.add(new Questions("What are the first names of the first father and son pair that were both Prime Ministers of Canada?", "A. John and Louis", "B. Justin and Pierre", "C.Brian and Justin", "D. Brian and Pierre", 'B'));
        question.add(new Questions("The Watergate Scandal occurred in what year?", "A. 1972", "B. 1973", "C. 1974", "D. 1971",'A'));
        question.add(new Questions("Which mathematician refused the Fields Medal?", "A. Grigori Perelman", "B. Andrew Wiles", "C. Terence Tao", "D. Edward Witten", 'A'));
        question.add(new Questions("What is a Burgee?", "A. A rope", "B. A flag", "C. A window", "D. A type of food", 'B'));
        //question.add(new Questions("https://www.jobbank.gc.ca/jobsearch/jobposting/33907785, apply Full time Technical support Specialist"));

        //Player to select an option from the start up menu
        char choice;
        int round = 1;

        do {

            System.out.println("\nPlease choose an option ");
            System.out.println("Enter A to Start the Game ");
            System.out.println("Enter B to View the rules of the game ");
            System.out.println("Enter Q to quit the game");

            choice = input.next().charAt(0);

            //if player chose to quit the game
            if (choice == 'Q' || choice == 'q') {
                System.out.println("Bye for now. See you again");
                break;
            }

            //if player chose to view the rules of the game
            else if(choice == 'B' || choice == 'b')
            {
                //creating an object from the GameRule class and calling its to string method to display all the rules
                GameRule rules = new GameRule();
                System.out.println(rules.toString());
            }

            //if player chose to start the game
            else if(choice == 'A' || choice == 'a')
            {

                //getting player's names
                System.out.println("\nPlease enter your first name: ");
                String firstName = input.next();

                //input.next();
                System.out.println("\nPlease enter your last name: ");
                String lastName = input.next();
                //input.nextLine();

                //creating a Player object
                Player names = new Player(firstName, lastName);


                System.out.println("\nWelcome " + names);

                System.out.println("\nEnter 'E' for the Easy Difficult option' and 'D' for the Hard Difficult option ");
                char option = input.next().charAt(0);

                //round = 1;
                int times = 0;
                int lifeline = 3;
                //int _5050;
                int questionNo = 1;
                char firstAnswer = '\0';
                char finalAnswer = '\0';

                //If player chooses the Easy option
                if(option == 'E' || option == 'e')
                {
                    do
                    {
                        System.out.println("\n\nRound " + round);
                        do
                        {
                            System.out.println("\nQuestion " + (questionNo));
                            Random random = new Random();
                            int randomQuest = random.nextInt(question.size());

                            //checking to make sure no question is answered twice  ie. a random number doesn't occur twice.
                            for(int i = 0; i < answeredQuestion.size(); i++)
                            //for(int j = 0; j < answeredQuestion.size(); j++)
                            {
                                if(question.get(randomQuest).getQuest().equals(answeredQuestion.get(i)))
                                {
                                    int newRandomQuest = random.nextInt(question.size());
                                    randomQuest = newRandomQuest;
                                    //System.out.println(question.get(randomQuest).toString());
                                    //break;
                                }
                            }
                            //printing out the question for the player
                            System.out.println(question.get(randomQuest).toString());

                            if(lifeline != 0)
                            {
                                System.out.println("\nYou have " + lifeline + " lifeline(s) left. \nDo you want to use any?");
                                char lifeReply = input.next().charAt(0);

                                if(lifeReply == 'Y' || lifeReply == 'y')
                                {
                                    System.out.println("\nWhich lifeline do you want to use?");
                                    System.out.println("Please enter \nA. for 50/50. \nB. for 'Call a friend'. \nC. for Audience\n");
                                    char lifelineChoice = input.next().charAt(0);

                                    if((lifelineChoice == 'A') || (lifelineChoice == 'a' ))
                                    {
                                        System.out.println("\n50/50 - This will eliminate two wrong answers from the question above. So you have two answers to choose from.");

                                        //filtering out two wrong answers from the answers in any random question
                                        String[] answers = new String[4];
                                        String[] filteredAnswers = new String[4];
                                        String rightAns = "";

                                        answers[0] = question.get(randomQuest).getOptionA();
                                        answers[1] = question.get(randomQuest).getOptionB();
                                        answers[2] = question.get(randomQuest).getOptionC();
                                        answers[3] = question.get(randomQuest).getOptionD();

                                        for(int i=0; i<answers.length; i++)
                                        {
                                            if(question.get(randomQuest).getRightAnswer() != answers[i].charAt(0))
                                            {
                                                filteredAnswers[i] = answers[i];
                                            }
                                            else {
                                                rightAns = answers[i];
                                            }

                                        }
                                        int v = getRandom(filteredAnswers);
                                        System.out.println(question.get(randomQuest).getQuest());
                                        System.out.println(filteredAnswers[v]);
                                        System.out.println(rightAns);

                                        System.out.println("Please choose your right answer");
                                        firstAnswer = Character.toUpperCase(input.next().charAt(0));

                                        lifeline--;
                                    }
                                    else if((lifelineChoice == 'B' ) || (lifelineChoice == 'b' ))
                                    {
                                        System.out.println("\nThis option will contact a friend for the right answer\n");
                                        System.out.println("Please enter the name of the friend");
                                        String friend = input.next();
                                        //input.nextLine();
                                        System.out.println("Please enter his/her phone number");
                                        String phoneNumber = input.next();
                                        long phoneNo = Long.parseLong(phoneNumber);
                                        System.out.println("Dialling " + friend + "'s number " + phoneNo + "........");
                                        System.out.println("Hello " + friend + ", This is Chris from Who Wants To Be A Millionaire");
                                        System.out.println("You have your friend " + names.toString() + " here on the hot sit and would like you to answer this question for him/her\n");
                                        System.out.println(question.get(randomQuest).toString());
                                        System.out.println("Please choose your right answer");
                                        firstAnswer = Character.toUpperCase(input.next().charAt(0));
                                        lifeline--;
                                    }
                                    else if((lifelineChoice == 'C' ) || (lifelineChoice == 'c'))
                                    {
                                        System.out.println("\nThis option will throw the question to the audience and the system will get the answer based on the highest percentage of answers from them");
                                        System.out.println(question.get(randomQuest).toString());

                                        //Getting an array of all answers and receiving answers from 60 audience
                                        String[] answers = new String[4];

                                        answers[0] = question.get(randomQuest).getOptionA();
                                        answers[1] = question.get(randomQuest).getOptionB();
                                        answers[2] = question.get(randomQuest).getOptionC();
                                        answers[3] = question.get(randomQuest).getOptionD();
                                        System.out.println(callAudience(answers , 60));
                                        lifeline--;
                                    }
                                    else{
                                        System.out.println("Invalid input");
                                    }
                                }else
                                {
                                    System.out.println(question.get(randomQuest).toString());
                                    System.out.println("Please choose your right answer");
                                    firstAnswer = Character.toUpperCase(input.next().charAt(0));
                                }

                            }
                            else{
                                //System.out.println(question.get(randomQuest).toString());
                                System.out.println("Please choose your right answer");
                                firstAnswer = Character.toUpperCase(input.next().charAt(0));
                            }

                            char response;
                            do
                            {
                                System.out.println("\nIs this your final answer? Y/N ");
                                response = input.next().charAt(0);

                                switch (response)
                                {
                                    case 'Y':
                                    case 'y':
                                    {
                                        if (question.get(randomQuest).matchResponse(firstAnswer)  == question.get(randomQuest).getRightAnswer())
                                        {
                                            try{
                                                System.out.println("\nCongratulations, " + names.getFirstName() + " You just won $" + getAmountWon(round, questionNo));
                                                answeredQuestion.add(question.get(randomQuest).getQuest());
                                                //System.out.println(answeredQuestion);
                                                questionNo++;
                                            }
                                            catch(Exception ex)
                                            {
                                                System.out.println(ex.getMessage());
                                            }
                                        }
                                        else
                                            {
                                            try
                                            {
                                                System.out.println("\nOh!!! Wrong Answer");
                                                System.out.println("\nYou will now walk away with $" + getAmountWon(round-1, 3) + "!!!");
                                                System.out.println("End of Game.");

                                            }
                                            catch(Exception ex)
                                            {
                                                System.out.println(ex.getMessage());
                                            }
                                                System.exit(0);
                                        }

                                        break;
                                    }
                                    //break;
                                    case 'N':
                                    case 'n':
                                    {
                                        try
                                        {
                                            System.out.println("Please select your final answer");
                                            finalAnswer = Character.toUpperCase(input.next().charAt(0));
                                            if (question.get(randomQuest).matchResponse(finalAnswer)  == question.get(randomQuest).getRightAnswer()){
                                                System.out.println("\nCongratulations, " + names.getFirstName() + " You just won $" + getAmountWon(round, questionNo));
                                                answeredQuestion.add(question.get(randomQuest).getQuest());
                                                //System.out.println(answeredQuestion);
                                                questionNo++;
                                            } else{
                                                System.out.println("\nWrong Answer");
                                                System.out.println("End of Game.");
                                                System.exit(0);
                                            }
                                        }
                                        catch(Exception ex)
                                        {
                                            System.out.println("Error");
                                        }

                                    }
                                    break;
                                    default:


                                        System.out.println("\nInvalid input");
                                        break;

                                }
                                times++;
                            }while (Character.isAlphabetic(firstAnswer) && finalAnswer == question.get(randomQuest).getRightAnswer() && times < 1);
                        }while (questionNo < 4);

                        questionNo = 1;

                        //Option to know if player want to walk away
                        System.out.println("You have finished round " + round + ".");
                        if(round == 3 && questionNo == 3)
                            System.exit(0);


                        if(round < 3 && questionNo < 3)
                        {
                            System.out.println("\nDo you want to walk away Y/N?");
                            char walkAway = input.next().charAt(0);

                            switch(walkAway)
                            {
                                //if player chooses to walk away
                                case 'Y':
                                case 'y': {
                                    try {
                                        System.out.println("\nCongratulations " + names.getFirstName() + "! You will walk away with $" + getAmountWon(round, 3) + ". \nThank you for your time and hope to see you again. ");
                                        System.exit(0);

                                    } catch (Exception ex) {
                                        System.out.println("Error");
                                    }
                                }
                                    //if player choose to continue playing
                                break;
                                case 'N':
                                case 'n':
                                    System.out.println("\nYou will now continue to round " + (round + 1));
                            }

                        }
                        else
                        {
                            System.out.println("Congratulations " + names.getFirstName() + "! You have completed the game. See you again");
                        }

                        round++;

                    }while (round < 4);

                }

                //If player chooses the Hard option
                else if(option == 'D' || option == 'd')
                {
                    do
                    {
                        System.out.println("\n\nRound " + round);
                        do
                        {
                            System.out.println("\nQuestion " + (questionNo));
                            Random random = new Random();
                            int randomQuest = random.nextInt(question.size());

                            //checking to make sure no question is answered twice  ie. a random number doesn't occur twice.
                            for(int i = 0; i < answeredQuestion.size(); i++)
                            //for(int j = 0; j < answeredQuestion.size(); j++)
                            {
                                if(question.get(randomQuest).getQuest().equals(answeredQuestion.get(i)))
                                {
                                    int newRandomQuest = random.nextInt(question.size());
                                    randomQuest = newRandomQuest;
                                    //System.out.println(question.get(randomQuest).toString());
                                    //break;
                                }
                            }
                            //printing out the question for the player

                            System.out.println(question.get(randomQuest).toString());

                            //lifeline option from the player
                            if((round == 1 && questionNo > 1 && lifeline != 0) || (round > 1 && questionNo > 0 && lifeline != 0))
                            {
                                System.out.println("\nYou have " + lifeline + " lifeline(s) left. \nDo you want to use any?");
                                char lifeReply = input.next().charAt(0);

                                if(lifeReply == 'Y' || lifeReply == 'y')
                                {
                                    System.out.println("\nWhich lifeline do you want to use?");
                                    System.out.println("Please enter \nA. for 50/50. \nB. for 'Call a friend'. \nC. for Audience\n");
                                    char lifelineChoice = input.next().charAt(0);

                                    if((lifelineChoice == 'A') || (lifelineChoice == 'a'))
                                    {
                                        System.out.println("\n50/50 - This will eliminate two wrong answers from the question above. So you have two answers to choose from.");

                                        //filtering out two wrong answers from the answers in any random question
                                        String[] answers = new String[4];
                                        String[] filteredAnswers = new String[4];
                                        String rightAns = "";

                                        answers[0] = question.get(randomQuest).getOptionA();
                                        answers[1] = question.get(randomQuest).getOptionB();
                                        answers[2] = question.get(randomQuest).getOptionC();
                                        answers[3] = question.get(randomQuest).getOptionD();

                                        for(int i=0; i<answers.length; i++)
                                        {
                                            if(question.get(randomQuest).getRightAnswer() != answers[i].charAt(0))
                                            {
                                                filteredAnswers[i] = answers[i];
                                            }
                                            else {
                                                rightAns = answers[i];
                                            }

                                        }
                                        int v = getRandom(filteredAnswers);
                                        System.out.println(question.get(randomQuest).getQuest());
                                        System.out.println(filteredAnswers[v]);
                                        System.out.println(rightAns);

                                        System.out.println("Please choose your right answer");
                                        firstAnswer = Character.toUpperCase(input.next().charAt(0));

                                        lifeline--;
                                    }
                                    else if((lifelineChoice == 'B' ) || (lifelineChoice == 'b'))
                                    {
                                        System.out.println("\nThis option will contact a friend for the right answer\n");
                                        System.out.println("Please enter the name of the friend");
                                        String friend = input.next();
                                        //input.nextLine();
                                        System.out.println("Please enter his/her phone number");
                                        String phoneNumber = input.next();
                                        long phoneNo = Long.parseLong(phoneNumber);
                                        System.out.println("Dialling " + friend + "'s number " + phoneNo + "........");
                                        System.out.println("Hello " + friend + ", This is Chris from Who Wants To Be A Millionaire");
                                        System.out.println("You have your friend " + names.toString() + " here on the hot sit and would like you to answer this question for him/her\n");
                                        System.out.println(question.get(randomQuest).toString());
                                        System.out.println("Please choose your right answer");
                                        firstAnswer = Character.toUpperCase(input.next().charAt(0));
                                        lifeline--;
                                    }
                                    else if((lifelineChoice == 'C') || (lifelineChoice == 'c'))
                                    {
                                        System.out.println("\nThis option will throw the question to the audience and the system will get the answer based on the highest percentage of answers from them");
                                        System.out.println(question.get(randomQuest).toString());

                                        //Getting an array of all answers and receiving answers from 60 audience
                                        String[] answers = new String[4];

                                        answers[0] = question.get(randomQuest).getOptionA();
                                        answers[1] = question.get(randomQuest).getOptionB();
                                        answers[2] = question.get(randomQuest).getOptionC();
                                        answers[3] = question.get(randomQuest).getOptionD();
                                        System.out.println(callAudience(answers , 60));
                                        lifeline--;
                                    }
                                    else{
                                        System.out.println("Invalid input");
                                    }
                                }
                                else{
                                    //System.out.println(question.get(randomQuest).toString());
                                    System.out.println("Please choose your right answer");
                                    firstAnswer = Character.toUpperCase(input.next().charAt(0));
                                }
                            }
                            else
                            {
                                System.out.println("Please choose your right answer");
                                firstAnswer = Character.toUpperCase(input.next().charAt(0));
                            }

                            char response;
                            do
                            {
                                System.out.println("\nIs this your final answer? Y/N ");
                                response = input.next().charAt(0);

                                switch (response)
                                {
                                    case 'Y':
                                    case 'y':
                                    {
                                        if (question.get(randomQuest).matchResponse(firstAnswer)  == question.get(randomQuest).getRightAnswer())
                                        {
                                            try{
                                                System.out.println("\nCongratulations, " + names.getFirstName() + " You just won $" + getHardAmountWon(round, questionNo));
                                                answeredQuestion.add(question.get(randomQuest).getQuest());
                                                //System.out.println(answeredQuestion);
                                                questionNo++;
                                            }
                                            catch(Exception ex)
                                            {
                                                System.out.println(ex.getMessage());
                                            }
                                        }
                                        else
                                        {
                                            try
                                            {
                                                System.out.println("\nOh!!! Wrong Answer");
                                                System.out.println("\nYou will now walk away with $" + getHardAmountWon(round-1, 5) + "!!!");
                                                System.out.println("End of Game.");

                                            }
                                            catch(Exception ex)
                                            {
                                                System.out.println(ex.getMessage());
                                            }
                                            System.exit(0);
                                        }

                                        break;
                                    }
                                    //break;
                                    case 'N':
                                    case 'n':
                                    {
                                        try
                                        {
                                            System.out.println("Please select your final answer");
                                            finalAnswer = Character.toUpperCase(input.next().charAt(0));
                                            if (question.get(randomQuest).matchResponse(finalAnswer)  == question.get(randomQuest).getRightAnswer()){
                                                System.out.println("\nCongratulations, " + names.getFirstName() + " You just won $" + getHardAmountWon(round, questionNo));
                                                answeredQuestion.add(question.get(randomQuest).getQuest());
                                                //System.out.println(answeredQuestion);
                                                questionNo++;
                                            } else{
                                                System.out.println("\nWrong Answer");
                                                System.out.println("End of Game.");
                                                System.exit(0);
                                            }
                                        }
                                        catch(Exception ex)
                                        {
                                            System.out.println("Error");
                                        }

                                    }
                                    break;
                                    default:


                                        System.out.println("\nInvalid input");
                                        break;

                                }
                                times++;
                            }while (Character.isAlphabetic(firstAnswer) && finalAnswer == question.get(randomQuest).getRightAnswer() && times < 1);
                        }while (questionNo < 6);

                        questionNo = 1;

                        //Option to know if player want to walk away
                        System.out.println("You have finished round " + round + ".");
                        if(round == 3 && questionNo == 5)
                            System.exit(0);
                        if(round < 3 && questionNo < 5)
                        {
                            System.out.println("\nDo you want to walk away Y/N?");
                            char walkAway = input.next().charAt(0);

                            switch(walkAway)
                            {
                                //if player chooses to walk away
                                case 'Y':
                                case 'y': {
                                    try {
                                        System.out.println("\nCongratulations " + names.getFirstName() + "! You will walk away with $" + getHardAmountWon(round, 5) + ". \nThank you for your time and hope to see you again. ");
                                        System.exit(0);

                                    } catch (Exception ex) {
                                        System.out.println("Error");
                                    }
                                }
                                //if player choose to continue playing
                                break;
                                case 'N':
                                case 'n':
                                    System.out.println("\nYou will now continue to round " + (round + 1));
                            }

                        }
                        else
                        {
                            System.out.println("Congratulations " + names.getFirstName() + "! You have completed the game. See you again");
                        }

                        round++;

                    }while (round < 4);

                }//end else hard option
            }
            else if(round == 3)
                System.exit(0);
            //end else option to start the game
            else{
                System.out.println("This is not a valid option. Please choose between 'A', 'B', or 'Q'");
            }


        }while ((choice != 'q' && round != 3)|| (choice != 'Q' && round != 3));
        System.exit(0);

    }



    //methods to calculate the amount won
    public static int getAmountWon(int a, int b) throws Exception
    {
        int amountWon = 0;
        if(a == 1 && b == 1)
            amountWon = 100;
        else if(a == 1 && b == 2)
            amountWon = 500;
        else if(a == 1 && b == 3)
            amountWon = 1000;
        else if(a == 2 && b == 1)
            amountWon = 8000;
        else if(a == 2 && b == 2)
            amountWon = 16000;
        else if(a == 2 && b == 3)
            amountWon = 32000;
        else if(a == 3 && b == 1)
            amountWon = 250000;
        else if(a == 3 && b == 2)
            amountWon = 500000;
        else if(a == 3 && b == 3)
            amountWon = 1000000;
        else
        {
            throw new Exception("Oh! Sorry! you will have to walk away now. See you other time.");
        }

        return amountWon;
    }

    public static int getHardAmountWon(int a, int b) throws Exception
    {
        int amountWon = 0;
        if(a == 1 && b == 1)
            amountWon = 100;
        else if(a == 1 && b == 2)
            amountWon = 200;
        else if(a == 1 && b == 3)
            amountWon = 300;
        else if(a == 1 && b == 4)
            amountWon = 500;
        else if(a == 1 && b == 5)
            amountWon = 1000;
        else if(a == 2 && b == 1)
            amountWon = 2000;
        else if(a == 2 && b == 2)
            amountWon = 4000;
        else if(a == 2 && b == 3)
            amountWon = 8000;
        else if(a == 2 && b == 4)
            amountWon = 16000;
        else if(a == 2 && b == 5)
            amountWon = 32000;
        else if(a == 3 && b == 1)
            amountWon = 64000;
        else if(a == 3 && b == 2)
            amountWon = 125000;
        else if(a == 3 && b == 3)
            amountWon = 250000;
        else if(a == 3 && b == 4)
            amountWon = 500000;
        else if(a == 3 && b == 5)
            amountWon = 1000000;
        else
        {
            throw new Exception("Oh! Sorry! you will have to walk away now. See you other time.");
        }

        return amountWon;
    }

    public static int getRandom(String[] b)
    {
        Random rand = new Random();
        int random50 = rand.nextInt(b.length);

        return random50;
    }

    public static int getLargestNo(int[] d)
    {
        for(int i=0; i < d.length-1; i++)
        {
            if(d[i] > d[i+1])
                d[0] = d[i];
        }
        return d[0];
    }



    public static char callAudience(String[] a, int c)
    {
        int ans_A = 0;
        int ans_B = 0;
        int ans_C = 0;
        int ans_D = 0;

        int no_audienceAns;

        int[] ans_Array = new int[4];

        char[] audience_Ans = new char[c];
        for(int i=0; i < c; i++)
        {
            //this array stores all answers chosen from the audience.
            audience_Ans[i] = a[getRandom(a)].charAt(0);
            //for(int j=0; j<audience_Ans.length; j++)
            //{
            //counting the number of responses from each answers
                if(audience_Ans[i] == 'A' || audience_Ans[i] == 'a') {
                    audience_Ans[i] = 'A';
                    ans_A = ans_A + 1;
                }else if(audience_Ans[i] == 'B' || audience_Ans[i] == 'b') {
                    audience_Ans[i] = 'B';
                    ans_B = ans_B + 1;
                }else if(audience_Ans[i] == 'C' || audience_Ans[i] == 'c') {
                    audience_Ans[i] = 'C';
                    ans_C = ans_C + 1;
                }else if(audience_Ans[i] == 'D' || audience_Ans[i] == 'd'){
                    audience_Ans[i] = 'D';
                    ans_D = ans_D + 1;
                }
            //}
        }
        char highestAnswer = '\0'; //a character variable to store the answer that has the highest count
        ans_Array[0] = ans_A;
        ans_Array[1] = ans_B;
        ans_Array[2] = ans_C;
        ans_Array[3] = ans_D;

        //an integer value storing the largest count of answers randomly chosen from audience
        no_audienceAns = getLargestNo(ans_Array);
        if((audience_Ans[0] == 'A' && ans_A == no_audienceAns) || audience_Ans[0] == 'a' && ans_A == no_audienceAns)
        {
            highestAnswer = 'A';
        }
        else if((audience_Ans[1] == 'B' && ans_A == no_audienceAns) || audience_Ans[1] == 'b' && ans_A == no_audienceAns)
        {
            highestAnswer = 'B';
        }
        else if((audience_Ans[2] == 'C' && ans_A == no_audienceAns) || audience_Ans[2] == 'c' && ans_A == no_audienceAns)
        {
            highestAnswer = 'C';
        }
        else if((audience_Ans[3] == 'D' && ans_A == no_audienceAns) || audience_Ans[3] == 'd' && ans_A == no_audienceAns)
        {
            highestAnswer = 'D';
        }



        return highestAnswer;
    }
}
