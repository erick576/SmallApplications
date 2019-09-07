
public class Palindrome {

String word;

boolean IsPalindrome(String word) {

if(word.length() == 0 || word.length() == 1) {
	return true;
}	
	
	
char Start = word.charAt(0);
char End = word.charAt(word.length() - 1);
String middle = word.substring(1, word.length() - 1);

return 
		Start == End && IsPalindrome(middle);
	
}	
	
}
