package ex;

public class RSL8 {

	public static void main(String[] args) {
		String str= "i.like.this.program.very.much";
        System.out.println(revString1(str));
	}
	public static String revString(String str) {
		String[] words= str.split("[.]", 0);
        String revString= "";
        int n=words.length;
        for(int i=n-1; i>=0;i--){
            revString+=words[i];
            if(i!=0)revString+='.';
        }
        return revString;
	}
	public static String revString1(String str) {
        String revString= "";
        int n=str.length();
        String word="";
        boolean eo=false;
        for(int i=0; i<n;i++){
        	if(str.charAt(i)!='.') {
        		word=eo?(str.charAt(i)+word):word+str.charAt(i);
        	}
        	else {
        		revString+=word+'.';
        		word="";
        		eo=!eo;
        	}
        }
        revString+=word;
        return revString;
	}

}
