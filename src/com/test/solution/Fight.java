package com.test.solution;

import java.util.ArrayList;
import java.util.List;

public class Fight {


    private static int findEnemy(int [][] games){

        Fight fight = new Fight();

        int stepCount = 0;

        final int ME = 1;
        final int ENEMY = 2;

        boolean findEnemyFlag = false;

        int minSteps = games[0].length+games.length;

        Area area = fight.new Area(games.length,games[0].length);

        List<Node> enemys = new ArrayList<>();

        Node me = null;

        for(int y=0;y<area.height&&!findEnemyFlag;y++)
            for(int x = 0; x<area.width &&!findEnemyFlag; x++){
                stepCount++;
                if(games[y][x]==ME){
                    me = fight.new Node(x,y);
                    for(int i = 0;i<enemys.size()&&!findEnemyFlag;i++){
                        stepCount++;
                        minSteps = Math.min(minSteps,calStep(area,me,enemys.get(i)));
                        findEnemyFlag = alreadyFindEnemy(minSteps);

                    }
                }else if(games[y][x]==ENEMY){
                        enemys.add(fight.new Node(x,y));
                        if(me!=null){
                            minSteps = Math.min(minSteps,calStep(area,me,fight.new Node(x,y)));
                            findEnemyFlag = alreadyFindEnemy(minSteps);

                        }
                }



            }

        System.out.println(stepCount);
        return enemys.size() == 0 ? 0:minSteps;

    }

    private static boolean alreadyFindEnemy(int minSteps){

        return minSteps==1;

    }

    private static int calStep(Area area,Node me,Node enemy){

        int stepX = Math.min(Math.abs(enemy.X-me.X),Math.abs(me.X+area.width -enemy.X));

        int stepY = Math.min(Math.abs(enemy.Y-me.Y),Math.abs(me.Y+area.height-enemy.Y));

        return stepX+stepY;

    }


    class Node {
        int X;
        int Y;

        Node(int X,int Y){
           this.X=X;
           this.Y=Y;
        }

    }

    class Area {
        int height;
        int width;

        Area(int height,int width){
            this.height = height;
            this.width = width;
        }

    }


    public static void main(String[] args){

        /**
         * 0 2 0 2 2
         * 1 0 0 0 0
         * 2 0 2 2 0
         * 0 0 0 0 0
         **/

        int [][] games = {{0,2,0,2,2},{1,0,0,0,0},{2,0,2,2,0},{0,0,0,0,0}};
        System.out.println(findEnemy(games));

    }
}
