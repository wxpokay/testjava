package com.test.java;

import java.util.Arrays;

public class Random {
	/*一、 定义一个带参带返回值的方法，实现输出随机数数组
	提示：
	 1、 定义一个带参带返回值的方法，通过参数传入数组的长度，返回值为赋值后的数组
	 2、 创建指定长度的整型数组
	 3、 使用 for 循环遍历数组，通过 Math.random( ) 生成随机并给数组成员赋值
	 4、 使用 return 返回赋值后的数组
	二、 完成 main 方法
	提示：
	 1、 调用自定义方法，保存方法执行后返回的数组
	 2、 使用 Arrays.toString( ) 将数组转换为字符串并输出，注意导入 java.util.Arrays;
*/
	public int[] getArray(int leng){
		// 定义指定长度的整型数组
		int[] array = new int[leng];
		// 循环遍历数组赋值
		for (int i =0;i<leng;i++) {
			// 产生一个100以内的随机数，并赋值给数组的每个成员
			array[i] = (int) (Math.random()*100);
		}
		return array; // 返回赋值后的数组
	}
	public static void main(String[] arc){
		Random random = new Random();
		int[] array = random.getArray(8);
		System.out.println(Arrays.toString(array));
		
		
	}
}
