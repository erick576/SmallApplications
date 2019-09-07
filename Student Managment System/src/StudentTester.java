import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTester {

	@Test
	public void test() {
    Student Eric = new Student("Eric");
    Student Chris = new ResidentStudent("Chris");
    Student Alex = new NonResidentStudent("Alex");
    
    Course EECS2030 = new Course("EECS2030",1000.0);
    Course EECS2011 = new Course("EECS2011", 1000.0);
    Course MATH2015 = new Course("MATH2015", 1000.0);
    
    StudentManagementSystem sms = new StudentManagementSystem();
    
    Eric.register(EECS2030);
    Eric.register(EECS2011);
    Chris.register(MATH2015);
    Alex.register(EECS2030);
    
    ResidentStudent rs = (ResidentStudent) Chris;
    rs.setPremiumRate(1.5);
    
    NonResidentStudent nrs = (NonResidentStudent) Alex;
    nrs.setDiscountRate(0.75);
    
    
    sms.addStudent(Eric);
    sms.addRS((ResidentStudent) Chris);
    sms.addNRS((NonResidentStudent) Alex);    
	
   assertEquals(sms.ss[0], Eric);
   assertEquals(sms.ss[1], Chris);
   assertEquals(sms.ss[2], Alex);
    
    
	}

}
