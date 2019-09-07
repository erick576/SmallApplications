
public class StudentManagementSystem {

	
Student[] ss;
int c;
StudentManagementSystem() {	
ss = new Student[100];
}

void addRS(ResidentStudent rs) {  
ss[c] = rs; c++;
}
void addNRS(NonResidentStudent nrs) {
ss[c] = nrs; c++;
}
void addStudent(Student s) {
ss[c] = s; c ++;
}
}


