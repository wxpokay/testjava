package com.test.java;

//导入Arrays类
import java.util.Arrays;
public class SortString {
  public static void main(String[] args) {
      
		// 定义一个字符串数组
		String[] hobbys = { "sports", "game", "movie" };
      
		// 使用Arrays类的sort()方法对数组进行排序
		Arrays.sort(hobbys);
      
		// 使用Arrays类的toString()方法将数组转换为字符串并输出
		System.out.println(Arrays.toString(hobbys));
	}
}