public class marks {
int s1,s2,s3,total;

public int getS1() {
	return s1;
}

public void setS1(int s1) {
	this.s1 = s1;
}

public int getS2() {
	return s2;
}

public void setS2(int s2) {
	this.s2 = s2;
}

public int getS3() {
	return s3;
}

public void setS3(int s3) {
	this.s3 = s3;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

@Override
public String toString() {
	return "marks [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", total=" + s1+s2+s3 + "]";
}
}