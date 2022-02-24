package com.company;

public class Main {

    public static void main(String[] args) {

        String myNameIs = "My name is Mads Pedersen";
        String findWord = "Mads";

        String myName = myNameIs.substring(11);
        System.out.println("Name is: " + myName);

        String firstChar = myNameIs.substring(0,1);
        System.out.println("First character in string: " + firstChar);

        System.out.println("Looking for word: " + findWord);
        int findWordStartIndex = myNameIs.indexOf(findWord);
        if (findWordStartIndex != -1)
        {
            int findWordEndIndex = findWordStartIndex + findWord.length();
            System.out.println("Start index: " + findWordStartIndex);
            System.out.println("End index: " + findWordEndIndex);

            System.out.println("The word is: " + myNameIs.substring(findWordStartIndex, findWordEndIndex));
        }
        else
        {
            System.out.println("Could not find the word: " + findWord);
        }
        String findLetter = "M";
        System.out.println("Looking for letter: " + findLetter);

        int findFirstLetterStartIndex = myNameIs.indexOf(findLetter);
        if (findFirstLetterStartIndex != -1)
        {
            int findFirstLetterEndIndex = findFirstLetterStartIndex + findLetter.length();
            System.out.println("1st letter Start index: " + findFirstLetterStartIndex);
            System.out.println("1st letter End index: " + findFirstLetterEndIndex);

            System.out.println("The first time the letter is displayed: " + myNameIs.substring(findFirstLetterStartIndex, findFirstLetterEndIndex));
        }
        else
        {
            System.out.println("Could not find the letter: " + findLetter);
        }
        int findSecondLetterStartIndex = myNameIs.indexOf(findLetter, 2);
        if (findSecondLetterStartIndex != -1)
        {
            int findSecondLetterEndIndex = findSecondLetterStartIndex + findLetter.length();
            System.out.println("2nd letter Start index: " + findSecondLetterStartIndex);
            System.out.println("2nd letter End index: " + findSecondLetterEndIndex);

            System.out.println("The second time the letter is displayed: " + myNameIs.substring(findSecondLetterStartIndex, findSecondLetterEndIndex));
        }
        else
        {
            System.out.println("Could not find the letter: " + findLetter);
        }

        System.out.println("Looking for the last word..");
        int findLastWordStartIndex = myNameIs.lastIndexOf(" ");
        if (findLastWordStartIndex != -1)
        {
            String lastWord = myNameIs.substring(findLastWordStartIndex+1);
            System.out.println("The last word in the string is: " + lastWord);
        }
        else
        {
            System.out.println("Could not find any spaces.");
        }
    }
}
