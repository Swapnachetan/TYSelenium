package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import learn_TestNG.Utils;

public class loginChecker {

	@Test
	public void testLogin() throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Utils.XL_Read("Sheet1",0,0);
	}
	
	@Test
	public void testLoginForAll() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		int totalRownum = Utils.XL_RowNum("Sheet1");
		
		for (int i=0; i<totalRownum; i++)
		{
			Utils.XL_Read("Sheet1", i, 0);
		}
	}

	
}
