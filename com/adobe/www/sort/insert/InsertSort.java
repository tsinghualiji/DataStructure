package com.adobe.www.sort.insert;
/**
 * 插入排序，每趟将一个元素，按照其关键字大小插入到它前面已排序的子序列中，使得插入后的子序列仍旧是排序的，依次重复
 * 直到全部元素插入完毕。
 * 插入排序主要有：直接插入排序，折半插入排序和希尔排序
 * @author Ji Li
 */
public class InsertSort {
	/**
	 * 直接插入排序是稳定排序
	 * 1. 数据序列已经排好序（最好情况）的时间复杂度是O(n)
	 * 2. 数据序列反序排列（最坏情况）的时间复杂度是O(n^2)
	 * 3. 数据序列随机排列的时间复杂度为O(n^2)
	 * 总之： 数据序列的初始排列越接近有序，直接插入排序的时间效率越高，其时间效率在O(n)到 O(n^2)之间。
	 * 直接插入排序的空间复杂度在O(1),且直接插入排序是稳定的。
	 * @param table
	 */
	public static void insertSort(int[] table){
		for(int i=1; i<table.length; i++){ //n-1趟扫描
			int temp = table[i],j;
			for(j=i-1; j>=0 && temp<table[j]; j--){//每趟将table[i]插入到前面的排序序列中去
				table[j+1] = table[j]; //将比前面比temp(table[i])大的元素依次往后移动。
			}
			table[j+1] = temp; //temp也就是table[i]的值到达应该插入到的位置。
		}
	}
}
/*
直接插入排序的每一趟都是将一个元素a[i]插入到前面的一个已排序的子序列中去，其中采用顺序查找算法寻找a[i]的插入位置，
若此时采用折半查找去寻找a[i]的位置，则构成折半插入排序
*/