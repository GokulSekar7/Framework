package javaChallenge;

public class CombineAlertnateString {

	public static String runCombineString(String input1, String input2) {
		String[] split1 = input1.split("");
		String[] split2 = input2.split("");
		String output="";
		if(split1.length==split2.length) {
			for(int i=0; i<split1.length;i++) {
				output = output+split1[i]+split2[i];
			}
		}else if(split1.length>split2.length) {
			for(int i=0; i<split1.length;i++) {
				if(i<split2.length) {
				output = output+split1[i]+split2[i];
				}else {
					output = output+split1[i];
				}
			}
		}else {
			for(int i=0; i<split2.length;i++) {
				if(i<split1.length) {
				output = output+split1[i]+split2[i];
				}else {
					output = output+split2[i];
				}
		}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(runCombineString("Hello","World"));
		System.out.println(runCombineString("Automation","Testing"));
		System.out.println(runCombineString("Java","Selenium"));
	}

}
