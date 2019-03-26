package selenium12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//复制某个文件（需要先创建一个文件夹）
		//FileHandler.copy(new File("E:\\a1\\2.txt"),new File("E:\\a2\\1.txt"));
		//创建目录
		//FileHandler.createDir(new File("/new_created_directory"));
		//删除目录
		//FileHandler.delete(new File("/new_created_directory"));
		//读取文件
		//String file=FileHandler.readAsString(new File("/directory/fileToRead.txt"));
		//System.out.println(file);
		//第一种创建文件
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
				
		//写入文件
		oos.writeObject("aaaaa");
		//第二种写入文件
		FileOutputStream out=new FileOutputStream("E:\\a.txt");
		String str="好";
		System.out.println(str.length() );
		//写入文件
		byte[] b=str.getBytes();
		System.out.println(b.length );
		for(int i=0;i<str.length();i++) {
			out.write(b[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
