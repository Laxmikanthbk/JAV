
public class ticket {
	int tid;
	String Desc;
	customer cc;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public customer getCc() {
		return cc;
	}
	public void setCc(customer cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "ticket [tid=" + tid + ", Desc=" + Desc + ", cc=" + cc + "]";
	}
	

}
