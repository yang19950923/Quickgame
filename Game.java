package cn.Game.play;




import java.util.Random;

//��Ϸ��
public class Game {
      Player play; //��Ҷ���
      
      public Game(Player play){
    	  this.play=play;
      }
      
    /*����ַ���,�����ַ������ں���ҵ��������Ƚ�
     * ��StringBuffer ��append���������ַ�
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
       * �����ַ����������Math.random()����ʵ��
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
      
      //�Ƚ���Ϸ���out���������in
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
    		  System.out.println("�������̫���ˣ��Ѿ���ʱ���˳���");
    		  System.exit(1);
    	  }else {
    		  //���㵱ǰ����
    		  play.setNoScore(play.getNoScore()+LevelShu.le[play.getCustNo()-1].getScore()) ;
    		  //����ʱ��
    		  play.setYiYtime((int)(cutime-play.getStart())/1000);

    		  System.out.println("������ȷ�����ļ���"+play.getCustNo()+"�����Ļ���"+play.getNoScore()+"������ʱ��"+play.getYiYtime()+"��");
    		  if(play.getCustNo()==5){
    			  int score=LevelShu.le[play.getCustNo()-1].getScore()*LevelShu.le[play.getCustNo()-1].getStrTime();
    			  if(score==play.getNoScore()){
    			  System.out.println("��ϲ���سɹ���");
    			  System.exit(1);
    			  }
    		  }
    	  }
    	 }else{
    		 System.out.println("��������˳���");
    		 System.exit(1);
    	 }
      }
}
