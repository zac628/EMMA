import javax.swing.JFrame;

public class Main {

	/**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    
    public static void main(String args[]){
    	DBTools.createNewTable("CREATE TABLE IF NOT EXISTS User (\n"
        		+ " Username text NOT NULL,\n"
                + "	Password text NOT NULL\n"
                + ");");
    	DBTools.insert("abc", "abc");
    	Login_VC();
    	//Car testcar = new Car("type","make","model",2016,"ABC 123");
    	//System.out.print(testcar.getClassification()+" "+testcar.getMake()+" "+testcar.getModel()+" "+testcar.getYear()+" "+testcar.getLicense());
    }
   
    
    public static void Login_VC()
	{
	JFrame frame = new JFrame("EMMA");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	LoginWindow panel = new LoginWindow();
	frame.getContentPane().add(panel);
	frame.pack();
	frame.setVisible(true);
	}	
}
