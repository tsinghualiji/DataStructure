package com.adobe.www.sort.other;
/**
 * 归并排序的基本思想：
 * 1、申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 2、设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 3、比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 * 4、重复步骤3直到某一指针达到序列尾
 * 5、将另一序列剩下的所有元素直接复制到合并序列尾
 * @author Ji Li
 *
 */
public class MergeSort {
	
	/**
	 * 递归排序的需要O(n)容量的附加空间，与数据序列的存储容量相等，空间复杂度为O(n)
	 * n个元素的归并排序，每趟比较n-1次，共进行[lgn]趟，时间复杂度为O(nlgn)
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
		//找出中间索引
		int center = (left+right)/2;
		//对左边数组进行递归
		sort(data,left,center);
		//对右边数据进行递归
		sort(data,center+1,right);
		//合并
		merge(data,left,center,right);
	}

	/**
	 * 
	 * @param data	数据对象
	 * @param left	左边数组的第一个元素索引
	 * @param center	左边数据的最后一个元素的索引，center+1右边数据的第一个元素的索引
	 * @param right		右边数组最后一个元素的索引
	 */
	public static void merge(int[] data, int left, int center, int right){
		//临时数组
		int[] tmpArr = new int[data.length];
		//右边数组的第一个元素的索引
		int mid = center+1;
		//third记录temp数组的索引
		int third = left;
		//缓存左数组第一个元素的索引
		int tmp = left;
		//从两个数组中取出最小的放入临时数组
		while(left <= center && mid <= center){
			if(data[left] <=data[mid]){
				tmpArr[third++] = data[left++];
			}else{
				tmpArr[third++] = data[mid++];
			}
		}
		//剩余部分依次放入临时数组（实际上两个while只会执行其中一个
		while(mid <= right){
			tmpArr[third++] = data[mid++];
		}
		while(left <= center){
			tmpArr[third++] = data[mid++];
		}
		// 将临时数组中的内容拷贝回原数组中
		while(tmp <= right){
			data[tmp++] = tmpArr[tmp++];
		}
	}
}
