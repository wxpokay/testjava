package com.test.java;

import java.io.File;
import java.io.IOException;



public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creatFile();
		//creatDir();
		//romoveFile();
		//getFileAtt();
		//renameFile();
		//listDir();
		fileTest();

	}
	
	//1.�������ļ�
	static void creatFile(){
		//�����ļ�·��
		String path = "F:\\java\\test.txt";
		//�����ļ�����
		File file = new File(path);
		try {
			file.createNewFile();//�������ļ�createNewFile()
			if(file.exists()){//�ж��ļ��Ƿ����exists()
				System.out.println("�����ɹ���");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//2.����Ŀ¼
	static void creatDir(){
		String path1 ="F:\\java\\test"; 
		String path2 ="F:\\java\\test\\test\\test"; 

		File file1 = new File(path1);
		file1.mkdir();//����Ŀ¼
		if(file1.exists()){
			System.out.println("Ŀ¼�����ɹ�");
		}
		File file2 = new File(path2);
		file2.mkdirs();//������Ŀ¼
		if(file2.exists()){
			System.out.println("��Ŀ¼�����ɹ�");
		}
	}
		
	//3.ɾ���ļ�
	static void romoveFile(){
		File file = new File("F:\\java\\test.txt");
		file.delete();//ɾ���ļ�
		if(!file.exists()){
			System.out.println("ɾ���ɹ�");
		}
		
	}
	
	//4.����ļ���Ϣ
	static void getFileAtt(){
		File file = new File("F:\\java\\test.txt");
		String fileName = file.getName();//��ȡ�ļ�����
		System.out.println("Name="+fileName);
		String ap = file.getAbsolutePath();//��ȡ����·��
		System.out.println("ap="+ap);
		System.out.println("getParent="+file.getParent());//��ȡ��Ŀ¼
		System.out.println("getPath="+file.getPath());//��ȡ���·��
	}
	
	//5.������
	static void renameFile(){
		File file = new File("F:\\java\\test.txt");
		File rename = new File("F:\\java\\test-1.txt");
		System.out.println(rename.exists());
		if(file.renameTo(rename)&&rename.exists()){
			System.out.println("�������ɹ�");
		}else{
			System.out.println("������ʧ��");
			System.out.println(file.renameTo(rename));//������
			System.out.println(rename.exists());
		}
	}
	
	//6.����Ŀ¼
	static void listDir(){
		File file = new File("f:\\");
		File[] f = file.listFiles();//�г�Ŀ¼�����е��ļ�
		for(File f1:f){
			System.out.println(f1.getName());//��ȡ�ļ�����
		}
	}
	
	//7.�ļ�����
	static void fileTest(){
		File file = new File("F:\\java\\test.txt");
		System.out.println("�Ƿ��д��"+file.canRead());//�Ƿ��д
		System.out.println("�Ƿ�ɶ���"+file.canWrite());//�Ƿ�ɶ�
		System.out.println("�Ƿ�Ϊһ��Ŀ¼��"+file.isDirectory());//�Ƿ�Ϊһ��Ŀ¼
		System.out.println("�Ƿ��Ǹ��ļ���"+file.isFile());//�Ƿ��Ǹ��ļ�
		System.out.println("�Ƿ���ڣ�"+file.exists());//�Ƿ����
		System.out.println("�Ƿ�Ϊ�����ļ���"+file.isHidden());//�Ƿ�Ϊ�����ļ�
	}
}
