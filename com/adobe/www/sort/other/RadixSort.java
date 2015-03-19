package com.adobe.www.sort.other;

import java.util.Arrays;  
/**
 * 基于计数排序的基数排序算法 
 * 时间复杂度 O(n·k); 空间复杂度O(n)
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
	 * @param array 待排序数组
	 * @param radix 代表基数(10)
	 * @param distance 排序元素的位数(最大的数的位数)
	 */
    private static void radixSort(int[] array,int radix, int distance) { 
    	//待排数组的长度
        int length = array.length; 
        //用于暂存元素
        int[] temp = new int[length];
        //用于计数排序  
        int[] count = new int[radix];
        int divide = 1;  
        for (int i = 0; i < distance; i++) {  
            //将待排数组拷贝至缓存数组中
            System.arraycopy(array, 0,temp, 0, length);
            //将计数数组全部元素置0
            Arrays.fill(count, 0);  
            
            for (int j = 0; j < length; j++) {  
                int tempKey = (temp[j]/divide)%radix;  
                count[tempKey]++;  
            }  
            for (int j = 1; j < radix; j++) {  
                count [j] = count[j] + count[j-1];  
            }
            //运用计数排序实现计数排序的重点
            for (int j = length - 1; j >= 0; j--) {  
                int tempKey = (temp[j]/divide)%radix;  
                count[tempKey]--;  
                array[count[tempKey]] = temp[j];  
            }  
            divide = divide * radix;                        
        }  
    }  
}