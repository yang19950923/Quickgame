package cn.Game.play;
//������
public class Level {
     private  int  custNo;//��ҵȼ�
     private  int  strTime;//�ַ�������
     private  int  timeXzhi;//ʱ������
     private  int  score;//����
     private  int  strLength; //�ַ�������
    public Level(){}
	public Level(int custNo, int strTime, int timeXzhi, int score, int strLength) {
		
		this.custNo = custNo;
		this.strTime = strTime;
		this.timeXzhi = timeXzhi;
		this.score = score;
		this.strLength = strLength;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public int getStrTime() {
		return strTime;
	}
	public void setStrTime(int strTime) {
		this.strTime = strTime;
	}
	public int getTimeXzhi() {
		return timeXzhi;
	}
	public void setTimeXzhi(int timeXzhi) {
		this.timeXzhi = timeXzhi;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getStrLength() {
		return strLength;
	}
	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}
     
     
}
