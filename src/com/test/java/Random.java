package com.test.java;

import java.util.Arrays;

public class Random {
	/*һ�� ����һ�����δ�����ֵ�ķ�����ʵ��������������
	��ʾ��
	 1�� ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ�����ֵΪ��ֵ�������
	 2�� ����ָ�����ȵ���������
	 3�� ʹ�� for ѭ���������飬ͨ�� Math.random( ) ����������������Ա��ֵ
	 4�� ʹ�� return ���ظ�ֵ�������
	���� ��� main ����
	��ʾ��
	 1�� �����Զ��巽�������淽��ִ�к󷵻ص�����
	 2�� ʹ�� Arrays.toString( ) ������ת��Ϊ�ַ����������ע�⵼�� java.util.Arrays;
*/
	public int[] getArray(int leng){
		// ����ָ�����ȵ���������
		int[] array = new int[leng];
		// ѭ���������鸳ֵ
		for (int i =0;i<leng;i++) {
			// ����һ��100���ڵ������������ֵ�������ÿ����Ա
			array[i] = (int) (Math.random()*100);
		}
		return array; // ���ظ�ֵ�������
	}
	public static void main(String[] arc){
		Random random = new Random();
		int[] array = random.getArray(8);
		System.out.println(Arrays.toString(array));
		
		
	}
}
