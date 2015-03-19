package com.adobe.www.sort.select;
/**
 * С���ѣ� ��������
 * �󶥶ѣ���������
 * @author Ji Li
 *	��һ�����е���Ϊ�ѵ�ʱ�临�Ӷ�ΪO(lgn),��˶������ʱ�临�Ӷ�ΪO(nlgn)��
 *  ������Ŀռ临�Ӷ�ΪO(1).�������ǲ��ȶ��ġ�
 */
public class HeapSort {

	public static void heapSort(int[] table){
		int n = table.length;
		//������С��
		for(int j=n/2-1; j>=0; j--){
			sift(table, j, n-1);
		}
		//ÿ�˽���Сֵ���������棬�ٵ�����
		for(int j=n-1; j>0; j--){
			int temp = table[0];
			table[0] = table[j];
			table[j] = temp;
			sift(table,0,j-1);
		}
	}
	
	/**
	 * ����beginΪ����������������С�ѣ�begin,end�ֱ������е��½���Ͻ�
	 * @param table
	 * @param begin
	 * @param end
	 */
	public static void sift(int[] table, int begin, int end){
		//iΪ�����ĸ���jΪi��������
		int i = begin, j = 2*i+1;
		//��ȡ��i��Ԫ�ص�ֵ
		int temp = table[i];
		//�ؽ�Сֵ���ӽ������ɸѡ
		while(j < end){
			//����Ԫ�رȽϣ���Ϊ<Ϊ�󶥶ѣ�
			if(j < end && table[j] >= table[j+1]){
				//jΪ���Һ����еĽ�С��
				j++;
			}
			//����ĸ����ֵ�ϴ󣨸�Ϊ<Ϊ���ѣ�
			if(temp > table[j]){
				//���ӽ���еĽ�Сֵ����
				table[i] = table[j];
				//i j ����һ��
				i = j;
				j = 2*i+1;
			}
			else break;
		}
		//��ǰ������ԭ��ֵ����������λ��
		table[i] = temp;
	}
	
	public static void main(String[] args){
		int[] table = {5,32,13,24,17,3,65,98,2,1};
		heapSort(table);
		for(int i=0; i< table.length-1; i++){
			System.out.println(table[i]);
		}
	}
}

