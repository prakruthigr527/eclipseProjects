package com.example.demo.codingExercises;

public class SnakeOrSpiral {

    public static void spiral (){
        int[][] twoDarray = {{1, 2,  3,  4,  4,  4},
                             {4, 5,  6,  7,  7,  7},
                             {7, 8,  9, 11, 11, 11},
                             {10,11,12, 15, 15, 15},
                             {10,11,12, 15, 15, 15}};

        System.out.println("Two-D -> "+ twoDarray.length + "\nFirst Array Length -> " + twoDarray[0].length);
        int length = twoDarray[0].length;
        int breadth = twoDarray.length;
        int horizontal = 0;
        int vertical =1;

        for (int i=0; i<breadth; i++)
        {
            for (int j=horizontal; j<length; j++) {
                System.out.print(twoDarray[i][j] + " -> "); //12345 // 567
                if(j==length-1){
                    for (int k=vertical; k<breadth; k++) {
                        System.out.print(twoDarray[k][j]+ " -> ");//81115 //10
                        if(k == breadth-1){
                            length--;
                            for (int l=length-1; l>=horizontal; l--) {
                                System.out.print(twoDarray[k][l]+ " -> ");//13121110 //98
                                if(l==horizontal){
                                    breadth--;
                                    for (int m=breadth-1; m>=vertical; m--) {
                                        System.out.print(twoDarray[m][l]+ " -> ");//1074
                                    }
                                }
                            }
                        }
                    }
                }
            }
            horizontal++;
            vertical++;
        }
    }

    public static void snake () {
        int[][] twoDarray = {{1, 2, 3, 4, 5},
                             {4, 5, 6, 7, 8},
                             {7, 8, 9, 11, 9},
                             {10, 11, 12, 15, 12}};

        System.out.println("Two-D -> " + twoDarray.length + "\nFirst Array Length -> " + twoDarray[0].length);
        int length = twoDarray[0].length;
        int breadth = twoDarray.length;
        int horizontal = 0;

        for (int i = 0; i < breadth; i++) {
            for (int j = horizontal; j < length; j++) {
                System.out.print(twoDarray[i][j] + " -> "); //12345 // 567
                if (j == length - 1) {
                    i++;
                    for(int k=length-1; k>=0; k--) {
                        System.out.print(twoDarray[i][k] + " -> ");
                    }
                }
            }
        }
    }
}

