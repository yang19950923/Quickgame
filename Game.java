package cn.Game.play;




import java.util.Random;

//游戏类
public class Game {
      Player play; //玩家对象
      
      public Game(Player play){
    	  this.play=play;
      }
      
    /*输出字符串,返回字符串用于和玩家的输入作比较
     * 用StringBuffer 的append方法生成字符
     */
//      public String showStr(){
//    	  Random ran=new Random();
//    	  StringBuffer bus=new StringBuffer();
//    	  int strLength=ls.le[play.getCustNo()-1].getStrLength();
//    	  for(int i=0;i<strLength;i++){
//    		  int rand=ran.nextInt(strLength);
//    		  switch(rand){
//    		  case 0:
//    			  bus.append("a");
//    			  break;
//    		  case 1:
//    			  bus.append("s");
//    			  break;
//    		  case 2:
//    			  bus.append("d");
//    			  break;
//    		  case 3:
//    			  bus.append("f");
//    			  break;
//    		  case 4:
//    			  bus.append("g");
//    			  break;  
//    		  }
//    	  }
//    	  System.out.println(bus);
//    	  
//    	  return bus.toString();
//      }
      
      /*
       * 生成字符，用数组加Math.random()方法实现
       */
      public String strLength(){
     	 char strs[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     	 String str="";
     	 int strLength=LevelShu.le[play.getCustNo()-1].getStrLength();
     	 for(int i=0;i<strLength;i++){
     		 str=str+strs[(int)(Math.random()*26)];
     	 }
     	 System.out.println(str);
     	 return str;
      }
      
      //比较游戏输出out和玩家输入in
      public void inOut(String out,String in){
    	  boolean flag;
    	  if(out.equals(in)){
    		  flag=true;
    	  }else{
    		  flag=false;
    	  }
    	  long cutime=System.currentTimeMillis();
    	  if(flag==true){
    	  if((cutime-play.getStart())/1000>LevelShu.le[play.getCustNo()-1].getTimeXzhi()){
    		  System.out.println("您输入的太慢了，已经超时，退出！");
    		  System.exit(1);
    	  }else {
    		  //计算当前积分
    		  play.setNoScore(play.getNoScore()+LevelShu.le[play.getCustNo()-1].getScore()) ;
    		  //已用时间
    		  play.setYiYtime((int)(cutime-play.getStart())/1000);

    		  System.out.println("输入正确，您的级别"+play.getCustNo()+"，您的积分"+play.getNoScore()+"，已用时间"+play.getYiYtime()+"秒");
    		  if(play.getCustNo()==5){
    			  int score=LevelShu.le[play.getCustNo()-1].getScore()*LevelShu.le[play.getCustNo()-1].getStrTime();
    			  if(score==play.getNoScore()){
    			  System.out.println("恭喜闯关成功！");
    			  System.exit(1);
    			  }
    		  }
    	  }
    	 }else{
    		 System.out.println("输入错误，退出！");
    		 System.exit(1);
    	 }
      }
}
