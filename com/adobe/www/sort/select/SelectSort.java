package com.adobe.www.sort.select;
/**
 * ֱ��ѡ������Ļ���˼�룺
 * ��һ�˴�n��Ԫ�ص�����������ѡ���ؼ�����С(��)��Ԫ�ز��ŵ���ǰ(��)��λ��,��һ���ٴ�n-1��Ԫ��ѡ����С(��)��Ԫ�طŵ���ǰ(��)��λ�ã���������
 * @author Ji Li
 *
 */
public class SelectSort {
	/**
	 * ֱ��ѡ���������������еĳ�ʼ�����й�
	 * ʱ�临�Ӷ�ΪO(^2)
	 * �ռ临�Ӷ�ΪO(1)
	 * ���ȶ�
	 * @param table
	 */
	public static void selectSort(int[] table){
		for(int i=0; i<table.length-1;i++){ 		//n-1������ÿ����i��ʼ����������Ѱ����СԪ��
			int min=i;								//���i��Ԫ����С
			for(int j=i+1;j<table.length;j++){		//����������Ѱ����Сֵ
				if(table[j]<table[min]){			
					min = j;						//��ס��Сֵ��λ��
				}
			}
			if(min != i){							//����Сֵ����i��λ�ã�Ȼ������´�ѭ��
				int temp = table[i];
				table[i] = table[min];
				table[min] = temp;
			}
		}
	}
}
