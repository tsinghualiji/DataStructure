package com.adobe.www.sort.other;
/**
 * �Ƚ������㷨����ͨ��������ģ��֤������������O(nlgn)
 * ����������ֻ��O(n)��ʱ�临�Ӷ�
 * O(n)�Ŀռ临�Ӷ�
 * @author Ji Li
 *
 */
public class CountSort {

	/**
	 * @param input ��������
	 * @param output �������
	 * @param k ��ʾ�����������ֶ�����0��k֮��
	 */
	public static void countSort(int[] input, int[] output, int k){
		//��ʱ�洢����
		int[] count = new int[k];
		//�ֲ�����������ʼ��
		for(int i=0; i<count.length; i++){
			count[i] = 0;
		}
		//���ÿ������Ԫ�أ����һ������Ԫ�ص�ֵΪinput[i],��ôcount[input[i]]��ֵ��1���˲�����ɺ�count[i]�д����ֵΪi��Ԫ�صĸ���
		for(int i=0; i<input.length; i++){
			count[input[i]]++;
		}
		//ͨ����count�м�¼�����ͣ�count[i]�д�ŵ���С�ڵ���iԪ�ص����ָ��� 
	    for (int i = 1; i < count.length; i++) {  
            count[i] = count[i] + count[i - 1];  
        }
	    //�����������е�Ԫ�ط�����������ж�Ӧ��λ���� ,�Ӻ���ǰ����  
        for (int i = input.length - 1; i >= 0; i--) {
            output[count[input[i]] - 1] = input[i];
            //�ò���ʹ����һ��ֵΪinput[i]��Ԫ��ֱ�ӽ������������input[i]��ǰһ��λ��
            count[input[i]]--;  
        }  
	}
}
