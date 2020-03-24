package tddjunit;
public class TddClass {
	String iWillCheck(String a) {
	String k="";
	String b = a.substring(0, 2);
	String c = a.substring(2, a.length());
	if(b.charAt(0)=='A')
		k = "";
	else
		k += b.charAt(0);
	if(b.charAt(1)=='A')
		k =k + "";
	else
		k = k + b.charAt(1);
	k =k + c;
	return(k);
}
}