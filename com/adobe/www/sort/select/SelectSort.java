package com.adobe.www.sort.select;
/**
 * 直接选择排序的基本思想：
 * 第一趟从n个元素的数据序列中选出关键字最小(大)的元素并放到最前(后)的位置,下一次再从n-1个元素选择最小(大)的元素放到次前(后)的位置，依次类推
 * @author Ji Li
 *
 */
public class SelectSort {
	/**
	 * 直接选择排序与数据序列的初始排列有关
	 * 时间复杂度为O(^2)
	 * 空间复杂度为O(1)
	 * 不稳定
	 * @param table
	 */
	public static void selectSort(int[] table){
		for(int i=0; i<table.length-1;i++){ 		//n-1趟排序，每次在i开始的子序列中寻找最小元素
			int min=i;								//设第i个元素最小
			for(int j=i+1;j<table.length;j++){		//在子序列中寻找最小值
				if(table[j]<table[min]){			
					min = j;						//记住最小值的位置
				}
			}
			if(min != i){							//将最小值放在i的位置，然后进行下次循环
				int temp = table[i];
				table[i] = table[min];
				table[min] = temp;
			}
		}
	}
}
