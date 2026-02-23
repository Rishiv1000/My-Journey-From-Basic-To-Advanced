// Java program to demonstrate conversion from 
// String to StringBuffer and StringBuilder.
public class code4_string_to_stringBuilder_striCngBuffer_conversion 
{
	public static void main(String[] args)
	{
		String str = "Geeks";
		
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		
		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);
	}
}
