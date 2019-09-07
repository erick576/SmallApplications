
public class Counter {

static final int MAX_INT = 1;
static final int MIN_INT = 0;

int value;

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public Counter() {
	this.value = 0;
}

public void increase() throws ValueTooLargeException {
if(this.value > MAX_INT -1) {
	throw new ValueTooLargeException("Value " + value + " is over the acceptable value. ");
}
else {
	this.value ++; }
}

public void decrease() throws ValueTooSmallException {
if(this.value < MIN_INT + 1) {
	throw new ValueTooSmallException("Value " + value + " is under the acceptable value. ");
}
else {
	this.value --;
}


}

	
}
