package com.test.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GetList {
	
	public static String ReadJasonTxt(String filepath){
		StringBuffer text = new StringBuffer();
		String encoding = "utf-8";
		File file = new File(filepath);
		if (file.isFile() && file.exists()){
			try {
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null){
					text.append(lineTxt);
				}
				read.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			}
		else {
			System.out.println("找不到文件");
			
		}
		return text.toString();
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// TODO Auto-generated method stub
		String filePath = "C:/Users/Administrator/Desktop/jason.txt";
		String text = ReadJasonTxt(filePath);
		JSONObject jsonObject = JSONObject.fromObject(text);
		JSONArray arrays = (JSONArray) jsonObject.get("data");
		System.out.println("总记录数=" + arrays.size());
		for (Object array : arrays) {
			JSONObject banginfo = JSONObject.fromObject(array);
			String pop = "排序热门";
			if (Integer.valueOf(banginfo.get("popular").toString()) > 0){
				pop = "手动热门";
			}
			System.out.println("bang_id=" + banginfo.get("bang_id")
					+ "---apply_num=" + banginfo.get("apply_num")
					+"---bang_status=" + banginfo.get("bang_status")
					+"---" + pop);
			list.add(banginfo.get("bang_id").toString());
			int bangStatus = Integer.valueOf(banginfo.get("bang_status").toString());
			if(bangStatus !=1 && bangStatus !=2) {
				System.out.println("$$$$$$$$出现了已完成的帖子$$$$$$");
			}
		}
		if(list != null && list.size() > 0) {
			for(int i=0;i<list.size();i++) {
				for(int j=i+1;j<list.size();j++) {
					if(list.get(i).equals(list.get(j))) {
						System.out.println("￥￥￥￥￥￥￥￥出现了相同的bang_id￥￥￥￥￥￥￥￥：" + list.get(i));
					}
				}
			}
		}
		
		
		
	}

}
