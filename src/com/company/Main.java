package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Madlib");
        // phase 1
        String name;
        String place;
        String time2;
        String time;
        String pluralnoun ;
        String name4;
        String name2;
        String name3;
        String adjective5;
        String noun;
        String verb;
        String job2;
        String verb2;
        String adjective4;
        String adjective;
        String adjective2;
        String book;
        String adjective3;
        String food;
        String job;
        String weather;

        //phase2
        Scanner input;
        input= new Scanner(System.in);
    System.out.println(" Hello there!");
    System.out.println("Please enter a name" );
    name = input.nextLine();
    System.out.print("give me a second name");
    name2 = input.nextLine();
    System.out.println("Aihgt!...Give me a job now cuz!");
    job = input.nextLine();
    System.out.println(" Now I need you to give me an adjetive");
    adjective = input.nextLine();
    System.out.println(" You doin' good just give me a noun.");
    noun = input.nextLine();
    System.out.println("Don't think to hard I need a verb");
    verb = input.nextLine();
    System.out.println("cool, now give me another  adjective");
    adjective2 = input.nextLine();
    System.out.println("Give me a job again please");
    job2 = input.nextLine();
    System.out.println("Give me a time of day now");
    time = input.nextLine();
    System.out.println("Give me a nother name");
    name = input.nextLine();
    System.out.println("Half way there just give me a weather");
    adjective3 = input.nextLine();
    System.out.println("Now I need an adjective");
    weather = input.nextLine();
    System.out.println("Dont get bored yet. I need a type of food");
    food = input.nextLine();
    System.out.println("Now give me a noun");
    pluralnoun = input.nextLine();
    System.out.println("Ok now give me a verb");
    verb2 = input.nextLine();
    System.out.println("Great job now adjective");
    adjective4 = input.nextLine();
    System.out.println("Almost done just give an noun");
    noun = input.nextLine();
    System.out.println("Great job kido now give me a time");
    time2 = input.nextLine();
    System.out.println("two more, I need an adjective");
    adjective = input.nextLine();
    System.out.println(" give a noun");
    place = input.nextLine();
    System.out.println("lastly,give adjective");
    adjective5 = input.nextLine();
    System.out.print("JK give me another name");
    name3 = input.nextLine();
    System.out.println("Seriously this is it give me another name");
    name4 = input.nextLine();



System.out.println("Once upon a time there live a boy named " + name +
                   " in his " + place + " with his friend " + name2);
System.out.println("He worked at " + job + " and had a best friend at his work named, " + name3);
System.out.println("He was a very " + adjective + " though");
System.out.println("He worked at " + noun);
System.out.println( "He "+ verb + adjective2 + " to " + job2 + " everday at " + time);
System.out.println("Even through " + adjective3 + weather + " he would still go to work");
System.out.println("He would often eat " + food + " for lunch");
System.out.println("He loved " + pluralnoun + " and would die for them" );
System.out.println("After " + time2 + " he would " + adjective4 + verb2 + " back " + place
                    + " with hios dog," + name3 + " and lived " + adjective5 + " ever after " );
     }

}