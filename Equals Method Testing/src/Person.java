
public class Person {
int age;

Person(int age) {
	this.age = age;
}

Person() {
	this.age = 0;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean equals(Object obj) {
	if(this == obj) {return true;}
	if(obj == null || this.getClass() != obj.getClass()) {return false;}
	Person other = (Person) obj;
	boolean equal = false;
	if(this.age == other.age) {
		equal = true;
	}
	return equal;
}

}