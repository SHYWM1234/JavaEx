import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionTest02{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("D:\\GitHubRepository\\Second-public\\character3\\test.txt");
			for(int i=0; i<10; i++){
				System.out.println(fis.read());
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("¶ÁÎÄ¼þ´íÎó£¡");
		} catch(IOException e) {
			System.out.println("IO´íÎó£¡");
		} finally {
			if (fis != null){
				try{
					fis.close();
				} catch (IOException e){
				
				}
			}
		}
	}

}