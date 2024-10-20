import java.util.Arrays;

public class ExamPractice {
	public static void main(String[] args) {
		String test = ("Hello World");
		System.out.println(removeVowels(test));
	}

	public static String removeVowels(String str) {
		String vowels = {"a", "e", "i", "o", "u"};
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (vowels[j] == str[i]) {
					newStr+= str[i];
					break;
				}		
			}
		}
		return newStr;
	}
}