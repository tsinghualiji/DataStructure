package com.adobe.www.sort.other;

import java.util.Arrays;  
/**
 * ���ڼ�������Ļ��������㷨 
 * ʱ�临�Ӷ� O(n��k); �ռ临�Ӷ�O(n)
 * @author Ji Li
 */
public class RadixSort { 
	
	public static void main(String[] args) {  
	      
        int[] array = {3,2,3,2,5,333,45566,2345678,78,990,12,432,56};  
        radixSort(array,10,7);  
        for (int i = 0; i < array.length; i++) {  
            System.out.print("  " + array[i]);  
        }  
    }  
  
	/**
	 * 
	 * @param array ����������
	 * @param radix �������(10)
	 * @param distance ����Ԫ�ص�λ��(��������λ��)
	 */
    private static void radixSort(int[] array,int radix, int distance) { 
    	//��������ĳ���
        int length = array.length; 
        //�����ݴ�Ԫ��
        int[] temp = new int[length];
        //���ڼ�������  
        int[] count = new int[radix];
        int divide = 1;  
        for (int i = 0; i < distance; i++) {  
            //���������鿽��������������
            System.arraycopy(array, 0,temp, 0, length);
            //����������ȫ��Ԫ����0
            Arrays.fill(count, 0);  
            
            for (int j = 0; j < length; j++) {  
                int tempKey = (temp[j]/divide)%radix;  
                count[tempKey]++;  
            }  
            for (int j = 1; j < radix; j++) {  
                count [j] = count[j] + count[j-1];  
            }
            //���ü�������ʵ�ּ���������ص�
            for (int j = length - 1; j >= 0; j--) {  
                int tempKey = (temp[j]/divide)%radix;  
                count[tempKey]--;  
                array[count[tempKey]] = temp[j];  
            }  
            divide = divide * radix;                        
        }  
    }  
}