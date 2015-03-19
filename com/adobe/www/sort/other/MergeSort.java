package com.adobe.www.sort.other;
/**
 * �鲢����Ļ���˼�룺
 * 1������ռ䣬ʹ���СΪ�����Ѿ���������֮�ͣ��ÿռ�������źϲ��������
 * 2���趨����ָ�룬���λ�÷ֱ�Ϊ�����Ѿ��������е���ʼλ��
 * 3���Ƚ�����ָ����ָ���Ԫ�أ�ѡ�����С��Ԫ�ط��뵽�ϲ��ռ䣬���ƶ�ָ�뵽��һλ��
 * 4���ظ�����3ֱ��ĳһָ��ﵽ����β
 * 5������һ����ʣ�µ�����Ԫ��ֱ�Ӹ��Ƶ��ϲ�����β
 * @author Ji Li
 *
 */
public class MergeSort {
	
	/**
	 * �ݹ��������ҪO(n)�����ĸ��ӿռ䣬���������еĴ洢������ȣ��ռ临�Ӷ�ΪO(n)
	 * n��Ԫ�صĹ鲢����ÿ�˱Ƚ�n-1�Σ�������[lgn]�ˣ�ʱ�临�Ӷ�ΪO(nlgn)
	 * @param data
	 */
	public static void mergeSort(int[] data){
		sort(data, 0, data.length-1);
	}
	
	/**
	 * @param data
	 * @param left
	 * @param right
	 */
	public static void sort(int[] data, int left, int right){
		if(left >= right) return;
		//�ҳ��м�����
		int center = (left+right)/2;
		//�����������еݹ�
		sort(data,left,center);
		//���ұ����ݽ��еݹ�
		sort(data,center+1,right);
		//�ϲ�
		merge(data,left,center,right);
	}

	/**
	 * 
	 * @param data	���ݶ���
	 * @param left	�������ĵ�һ��Ԫ������
	 * @param center	������ݵ����һ��Ԫ�ص�������center+1�ұ����ݵĵ�һ��Ԫ�ص�����
	 * @param right		�ұ��������һ��Ԫ�ص�����
	 */
	public static void merge(int[] data, int left, int center, int right){
		//��ʱ����
		int[] tmpArr = new int[data.length];
		//�ұ�����ĵ�һ��Ԫ�ص�����
		int mid = center+1;
		//third��¼temp���������
		int third = left;
		//�����������һ��Ԫ�ص�����
		int tmp = left;
		//������������ȡ����С�ķ�����ʱ����
		while(left <= center && mid <= center){
			if(data[left] <=data[mid]){
				tmpArr[third++] = data[left++];
			}else{
				tmpArr[third++] = data[mid++];
			}
		}
		//ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ��
		while(mid <= right){
			tmpArr[third++] = data[mid++];
		}
		while(left <= center){
			tmpArr[third++] = data[mid++];
		}
		// ����ʱ�����е����ݿ�����ԭ������
		while(tmp <= right){
			data[tmp++] = tmpArr[tmp++];
		}
	}
}
