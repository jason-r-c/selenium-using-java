
public class Methods {

	public void ValidateHeader() {
		System.out.println("Header links validated");
	}
	
	public void pStr(String printVar) {
		System.out.println(printVar);
	}

	public void Pdiv() {
		System.out.println("=================================== \n");
	}
	
	public String ReturnString(String strArg) {
		String appended = strArg+" - appended by the ReturnString method";
		return appended;
	}
	
	public Integer ReturnInt(int intArg) {
		int appended = intArg+10;	
		return appended;
	}

	public void pInt(int concatInt) {
		// TODO Auto-generated method stub
		
	}

}
