package selenium12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����ĳ���ļ�����Ҫ�ȴ���һ���ļ��У�
		//FileHandler.copy(new File("E:\\a1\\2.txt"),new File("E:\\a2\\1.txt"));
		//����Ŀ¼
		//FileHandler.createDir(new File("/new_created_directory"));
		//ɾ��Ŀ¼
		//FileHandler.delete(new File("/new_created_directory"));
		//��ȡ�ļ�
		//String file=FileHandler.readAsString(new File("/directory/fileToRead.txt"));
		//System.out.println(file);
		//��һ�ִ����ļ�
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
				
		//д���ļ�
		oos.writeObject("aaaaa");
		//�ڶ���д���ļ�
		FileOutputStream out=new FileOutputStream("E:\\a.txt");
		String str="��";
		System.out.println(str.length() );
		//д���ļ�
		byte[] b=str.getBytes();
		System.out.println(b.length );
		for(int i=0;i<str.length();i++) {
			out.write(b[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
