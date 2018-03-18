package com.test.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

    public static int findEnemy(int [][] games){

        int minSteps = games.length+games[0].length;
        int stepCount = 0;
        int[] myself = null;

        boolean flag = false;

        List<Pair> enemys = new ArrayList<>();
        int yLength = games.length;
        int xLength = games[0].length;
        for(int y=0;y<games.length&&!flag;y++){
            for(int x=0;x<games[y].length&&!flag;x++){
                stepCount++;
                if(games[y][x] == 1){
                    myself = new int[]{x,y};

                    for(Pair p : enemys){
                        stepCount++;
                        minSteps = getMinStep(p,myself,yLength,xLength);
                        if (minSteps == 1) {
                            flag = true;
                            break;
                        }
                    }
                }else if(myself == null && games[y][x] == 2){
                    Pair e = new Pair(x,y);
                    enemys.add(e);
                }else if(myself != null && games[y][x] == 2){
                    minSteps = getMinStep(new Pair(x,y),myself,yLength,xLength);
                    if (minSteps == 1)
                        flag = true;
                }

            }
        }
        System.out.println(enemys.size());
//        for(Pair p : enemys){
//            stepCount++;
//            int negativeY = Math.abs(yLength+myself[1]-p.getY());
//            int positiveY = Math.abs(p.getY() - myself[1]);
//
//            int negativeX = Math.abs(xLength+myself[0]-p.getX());
//            int positiveX = Math.abs(p.getX() - myself[0]);
//
//            int stepTemp = Math.min(negativeX,positiveX)+Math.min(negativeY,positiveY);
//            if(stepTemp<minSteps)
//                minSteps = stepTemp;
//
//            if (minSteps == 1)
//                break;
//        }

        System.out.println(Arrays.toString(myself));
        System.out.println(enemys.toString());
//        System.out.println("asdfadfds");
//        System.out.println(Arrays.toString(myself));
//        boolean findEnemy = false;
//        for(int i=0;i<games.length&&!findEnemy;i++){
//            for(int j=0;j<games[i].length&&!findEnemy;j++){
//                stepCount++;
//                if(games[i][j] == 2){
//                    int negativeY = Math.abs(games.length+myself[1]-i);
//                    int positiveY = Math.abs(i - myself[1]);
//
//                    int negativeX = Math.abs(games[i].length+myself[0]-j);
//                    int positiveX = Math.abs(j - myself[0]);
//
//                    int stepTemp = Math.min(negativeX,positiveX)+Math.min(negativeY,positiveY);
//                    if(stepTemp<minSteps)
//                        minSteps = stepTemp;
//
//                    if (minSteps == 1)
//                        findEnemy = true;
//                }
//            }
//        }
        System.out.println("stepCount:  " + stepCount);
        return minSteps;

    }

    public static int getMinStep(Pair p, int[] myself, int yLength, int xLength){
        int minSteps = yLength+xLength;
        int negativeY = Math.abs(yLength+myself[1]-p.getY());
        int positiveY = Math.abs(p.getY() - myself[1]);

        int negativeX = Math.abs(xLength+myself[0]-p.getX());
        int positiveX = Math.abs(p.getX() - myself[0]);

        int stepTemp = Math.min(negativeX,positiveX)+Math.min(negativeY,positiveY);
        if(stepTemp<minSteps)
            minSteps = stepTemp;


        return minSteps;
    }
    public static void main(String[] args){

        /**
         * 0 2 0 2 2
         * 1 0 0 0 0
         * 2 0 2 2 0
         * 0 0 0 0 0
         **/

        int [][] games = {{0,2,0,2,2},{1,0,0,0,0},{2,0,2,2,0},{0,0,0,0,0}};
        System.out.println("*******");
        System.out.println(findEnemy(games));

    }


}

class Pair{
    private int x;
    private int y;

    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "[ X = "+this.getX() + ", Y = "+this.getY();
    }
}
