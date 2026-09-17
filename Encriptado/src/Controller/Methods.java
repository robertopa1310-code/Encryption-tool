package Controller;

public class Methods {
	
	public Methods(String options,String path,String password) throws Exception {
		super();
		SelectMode(options, path,password);
	}
	
	private void SelectMode(String options,String path,String password) throws Exception {
		if(options.equalsIgnoreCase("Encript")){
			System.out.println(options);
			Encript en = new Encript(path, password);
		}else if(options.equalsIgnoreCase("Decript")) {
			System.out.println(options);
			Decript de = new Decript(path, password);
		}
	}
	
}