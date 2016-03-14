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
	
	//1.创建新文件
	static void creatFile(){
		//定义文件路径
		String path = "F:\\java\\test.txt";
		//创建文件对象
		File file = new File(path);
		try {
			file.createNewFile();//创建新文件createNewFile()
			if(file.exists()){//判断文件是否存在exists()
				System.out.println("创建成功了");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//2.创建目录
	static void creatDir(){
		String path1 ="F:\\java\\test"; 
		String path2 ="F:\\java\\test\\test\\test"; 

		File file1 = new File(path1);
		file1.mkdir();//创建目录
		if(file1.exists()){
			System.out.println("目录创建成功");
		}
		File file2 = new File(path2);
		file2.mkdirs();//创建连目录
		if(file2.exists()){
			System.out.println("连目录创建成功");
		}
	}
		
	//3.删除文件
	static void romoveFile(){
		File file = new File("F:\\java\\test.txt");
		file.delete();//删除文件
		if(!file.exists()){
			System.out.println("删除成功");
		}
		
	}
	
	//4.获得文件信息
	static void getFileAtt(){
		File file = new File("F:\\java\\test.txt");
		String fileName = file.getName();//获取文件名字
		System.out.println("Name="+fileName);
		String ap = file.getAbsolutePath();//获取绝对路径
		System.out.println("ap="+ap);
		System.out.println("getParent="+file.getParent());//获取父目录
		System.out.println("getPath="+file.getPath());//获取相对路径
	}
	
	//5.重命名
	static void renameFile(){
		File file = new File("F:\\java\\test.txt");
		File rename = new File("F:\\java\\test-1.txt");
		System.out.println(rename.exists());
		if(file.renameTo(rename)&&rename.exists()){
			System.out.println("重命名成功");
		}else{
			System.out.println("重命名失败");
			System.out.println(file.renameTo(rename));//重命名
			System.out.println(rename.exists());
		}
	}
	
	//6.遍历目录
	static void listDir(){
		File file = new File("f:\\");
		File[] f = file.listFiles();//列出目录下所有的文件
		for(File f1:f){
			System.out.println(f1.getName());//获取文件名字
		}
	}
	
	//7.文件测试
	static void fileTest(){
		File file = new File("F:\\java\\test.txt");
		System.out.println("是否可写："+file.canRead());//是否可写
		System.out.println("是否可读："+file.canWrite());//是否可读
		System.out.println("是否为一个目录："+file.isDirectory());//是否为一个目录
		System.out.println("是否是个文件："+file.isFile());//是否是个文件
		System.out.println("是否存在："+file.exists());//是否存在
		System.out.println("是否为隐藏文件："+file.isHidden());//是否为隐藏文件
	}
}
