public class student {
int id;
String name;
marks marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public marks getMarks() {
	return marks;
}
public void setMarks(marks marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
}