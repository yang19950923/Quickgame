package cn.Game.play;


import java.util.Scanner;

//�����
public class Player {
      private int custNo;//��ҵȼ�
      private int noScore;//��ǰ�ȼ��ķ���
      private long start;//��ʼʱ��
      private int yiYtime;//����ʱ��
	public Player(int custNo, int noScore, long start, int yiYtime) {
		this.custNo = custNo;
		this.noScore = noScore;
		this.start = start;
		this.yiYtime = yiYtime;
		
	}
	public Player(){}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public int getNoScore() {
		return noScore;
	}
	public void setNoScore(int noScore) {
		this.noScore = noScore;
	}
	public long getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getYiYtime() {
		return yiYtime;
	}
	public void setYiYtime(int yiYtime) {
		this.yiYtime = yiYtime;
	}
	
	public void play() {
		Scanner s = new Scanner(System.in);
		Game game = new Game(this);
		for (int i = 0; i < LevelShu.le.length; i++) {
			this.custNo += 1;
			this.noScore = 0;
			this.start = System.currentTimeMillis();
			;
			for (int j = 0; j < LevelShu.le.length; j++) {
				String outstr = game.strLength();
				String instr = s.next();
				game.inOut(outstr, instr);

			}
		}
	}
      
}
