
public class Student {

String name;
Course[] registeredCourses;
int numberofcourses;

Student(String name) {
	this.name = name;
	registeredCourses = new Course[10];
}

void register(Course c) {
	registeredCourses[numberofcourses] = c;
	numberofcourses ++;
}

double getTuition() {
	double tuition = 0;
	for(int i = 0; i < numberofcourses; i++) {
		tuition += registeredCourses[i].fee;
	}
	return tuition;
}
	
	
}
