
public class ReverseOfString {
	
String word;
String rev = "";
int length;
String ReverseOfStrings(String word, int length) {	
if(length - 1 > -1) {
rev += word.charAt(length - 1);
length --;
ReverseOfStrings(word, length);
}
return rev;
}

}
