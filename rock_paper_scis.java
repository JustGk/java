package com.company;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_scis {
    public static void main(String[] args) {


        byte chance = 5;
        byte human;
        byte[] comp = {1, 2, 3};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int comp_point=0;
        int human_point=0;
        String a="\n"+
"███████████████████████████████████████████████████████████████████████████████████████████████████████████\n"+
"█▄─▄▄▀█─▄▄─█─▄▄▄─█▄─█─▄█▀▀▀▀▀██▄─▄▄─██▀▄─██▄─▄▄─█▄─▄▄─█▄─▄▄▀█▀▀▀▀▀██─▄▄▄▄█─▄▄▄─█▄─▄█─▄▄▄▄█─▄▄▄▄█─▄▄─█▄─▄▄▀█\n"+
"██─▄─▄█─██─█─███▀██─▄▀██████████─▄▄▄██─▀─███─▄▄▄██─▄█▀██─▄─▄████████▄▄▄▄─█─███▀██─██▄▄▄▄─█▄▄▄▄─█─██─██─▄─▄█\n"+
"▀▄▄▀▄▄▀▄▄▄▄▀▄▄▄▄▄▀▄▄▀▄▄▀▀▀▀▀▀▀▀▄▄▄▀▀▀▄▄▀▄▄▀▄▄▄▀▀▀▄▄▄▄▄▀▄▄▀▄▄▀▀▀▀▀▀▀▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▀▄▄▀▄▄▀";

        System.out.println(a);
        while (chance>0){
            System.out.println("FOR ROCK TYPE 1");
            System.out.println("FOR PAPER TYPE 2");
            System.out.println("FOR SCISSOR TYPE 3");
            System.out.print("ENTER YOUR CHOICE ");
            human=sc.nextByte();
            int comp_choice=r.nextInt(comp.length)+1;
            if (human==1 && comp_choice==1){
                human_point=human_point+0;
                comp_point=comp_point+0;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                chance--;
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==1 && comp_choice==2){
                human_point=human_point+0;
                comp_point=comp_point+1;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);

            }
            else if (human==1 && comp_choice==3){
                human_point=human_point+1;
                comp_point=comp_point+0;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==2 && comp_choice==3){
                human_point=human_point+0;
                comp_point=comp_point+1;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==2 && comp_choice==1){
                human_point=human_point+1;
                comp_point=comp_point+0;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==2 && comp_choice==2){
                human_point=human_point+0;
                comp_point=comp_point+0;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==3 && comp_choice==3){
                human_point=human_point+0;
                comp_point=comp_point+0;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
            }
            else if (human==3 && comp_choice==1){
                human_point=human_point+0;
                comp_point=comp_point+1;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
            else if (human==3 && comp_choice==2){
                human_point=human_point+1;
                comp_point=comp_point+0;
                chance--;
                System.out.println("HUMAN POINTS = "+human_point);
                System.out.println("COMP POINTS = "+comp_point);
                System.out.println("CHANCES LEFT "+chance);
            }
        }
        if (comp_point<human_point){
            System.out.println("HUMAN POINTS = "+human_point);
            System.out.println("COMP POINTS = "+comp_point);
            System.out.println("HUMAN WINS");
        }
        else {
            System.out.println("HUMAN POINTS = "+human_point);
            System.out.println("COMP POINTS = "+comp_point);
            System.out.println("COMP WINS");
        }
    }
}
