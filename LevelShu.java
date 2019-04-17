package cn.Game.play;
//级别的各类参数
public class LevelShu {
      public  static final Level[] le=new Level[6];
      
      static{
    	  le[0]= new Level(1,8,29,1,2);
    	  le[1]= new Level(2,7,30,3,3);
    	  le[2]= new Level(3,6,31,5,4);
    	  le[3]= new Level(4,5,30,8,5);
    	  le[4]= new Level(5,5,28,15,6);
    	  le[5]= new Level(6,5,25,15,6);
      }
}
