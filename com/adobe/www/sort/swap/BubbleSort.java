package com.adobe.www.sort.swap;
/**
 * ð������Ļ���˼���ǣ� �Ƚ���������Ԫ�صĹؼ���ֵ����������򽻻���
 * �����������У�ÿһ�˽���ɨ������������е����Ԫ�ؽ��������λ��
 * �������ݴ�ˮ��ð����һ����
 * @author Ji Li
 *
 */
public class BubbleSort {
	/**
	 * ð�������㷨��
	 * �����������ݵĳ�ʼ����������ֻ��һ��ɨ�裬��������ɣ��Ƚϴ���Ϊn,��ʱʱ�临�Ӷ�ΪO(n);
	 * ���������ݵĳ�ʼ�����Ƿ���ģ���Ҫn-1ɨ�裬�Ƚϴ������ƶ���������O(n^2);
	 * ��֮���������еĳ�ʼ����Խ�ӽ�����ð�������ʱ��Ч��Խ�ߣ���ʱ��Ч����O(n)��O(n^2)֮�䡣
	 * ð��������Ҫһ�������ռ����ڽ�������Ԫ�أ��ռ临�Ӷ�ΪO(1);
	 * ð�������㷨���ȶ���
	 * @param table
	 */
	public static void bubbleSort(int[] table){
		boolean exchange = true;  //exchange��־��������ɨ���Ƿ���ڽ����ı�ǣ������һ��ѭ����û�н�������˵����������������û�б�Ҫ������һ��ѭ��
		for(int i=1; i<table.length&&exchange; i++){
			exchange = false;
			for(int j=0; j<table.length-i; j++){ //table.length-i,˵��i��λ�õ��������н�β֮��������Ѿ������ˡ�
				if(table[j] > table[j+1]){
					int temp = table[j];
					table[j] = table[j+1];
					table[j+1] = table[j];
					exchange = true;
				}
			}
		}
	}
}
