package com.adobe.www.sort.other;
/**
 * 比较排序算法可以通过决策树模型证明，其下线是O(nlgn)
 * 而计数排序只需O(n)的时间复杂度
 * O(n)的空间复杂度
 * @author Ji Li
 *
 */
public class CountSort {

	/**
	 * @param input 输入数组
	 * @param output 输出数组
	 * @param k 表示有所输入数字都介于0到k之间
	 */
	public static void countSort(int[] input, int[] output, int k){
		//临时存储数据
		int[] count = new int[k];
		//局部变量需做初始化
		for(int i=0; i<count.length; i++){
			count[i] = 0;
		}
		//检查每个输入元素，如果一个输入元素的值为input[i],那么count[input[i]]的值加1，此操作完成后，count[i]中存放了值为i的元素的个数
		for(int i=0; i<input.length; i++){
			count[input[i]]++;
		}
		//通过在count中记录计数和，count[i]中存放的是小于等于i元素的数字个数 
	    for (int i = 1; i < count.length; i++) {  
            count[i] = count[i] + count[i - 1];  
        }
	    //把输入数组中的元素放在输出数组中对应的位置上 ,从后往前遍历  
        for (int i = input.length - 1; i >= 0; i--) {
            output[count[input[i]] - 1] = input[i];
            //该操作使得下一个值为input[i]的元素直接进入输出数组中input[i]的前一个位置
            count[input[i]]--;  
        }  
	}
}
