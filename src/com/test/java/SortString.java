package com.test.java;

//����Arrays��
import java.util.Arrays;
public class SortString {
  public static void main(String[] args) {
      
		// ����һ���ַ�������
		String[] hobbys = { "sports", "game", "movie" };
      
		// ʹ��Arrays���sort()�����������������
		Arrays.sort(hobbys);
      
		// ʹ��Arrays���toString()����������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(hobbys));
	}
}