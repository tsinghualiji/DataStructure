package com.adobe.www.sort.swap;
/**
 * 冒泡排序的基本思想是： 比较相邻两个元素的关键字值，如果反序，则交换。
 * 若按升序排列，每一趟将被扫描的数据序列中的最大元素交换到最后位置
 * 就像气泡从水里冒出来一样。
 * @author Ji Li
 *
 */
public class BubbleSort {
	/**
	 * 冒泡排序算法的
	 * 最好情况是数据的初始排列已排序，只需一趟扫描，则排序完成，比较次数为n,此时时间复杂度为O(n);
	 * 最坏情况是数据的初始排列是反序的，需要n-1扫描，比较次数和移动次数都是O(n^2);
	 * 总之，数据序列的初始排列越接近有序，冒泡排序的时间效率越高，其时间效率在O(n)到O(n^2)之间。
	 * 冒泡排序需要一个辅助空间用于交换两个元素，空间复杂度为O(1);
	 * 冒泡排序算法是稳定的
	 * @param table
	 */
	public static void bubbleSort(int[] table){
		boolean exchange = true;  //exchange标志用做本趟扫描是否存在交换的标记，如果第一次循环，没有交换，则说明数据序列已有序，没有必要进行下一次循环
		for(int i=1; i<table.length&&exchange; i++){
			exchange = false;
			for(int j=0; j<table.length-i; j++){ //table.length-i,说明i的位置到数据序列结尾之间的数据已经有序了。
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
