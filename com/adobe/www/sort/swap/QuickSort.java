package com.adobe.www.sort.swap;
/**
 * 快速排序的基本思想是： 在数据序列中选择一个值作为比较的基准值，每趟从数据序列的两端开始交替进行，
 * 将小于基准值的元素移动到序列前端，将大于基准值的元素移动到元素后端，介于两者之间的位置则成为基准值的最终位置，同时，
 * 序列被划分为两个子序列，再用同样的方法对两个字序列进行排序，直到子序列的长度为1，则完成排序。
 * @author Ji Li
 *
 */
public class QuickSort {
	/**
	 * 快速排序的执行时间与数据序列的初始排列及基准值的选取有关，
	 * 最好情况是每趟排序将序列分成长度相近的两个子序列，比较次数为O(nlgn),时间复杂度为O(nlgn);
	 * 最坏情况是每趟将序列分为差异很大的两个子序列，时间复杂度为O(n^2);
	 * 总之，当n较大且数据序列随机排列时，快速排序是“快速”，但当n很小或基准值选取不合适时，快速排序较慢。
	 * 
	 * 快速排序算法在递归调用过程中，需要使用栈保存参数，栈所占用的空间与递归调用的次数有关，最好情况下
	 * 空间复杂度为O(lgn)，最坏情况下空间复杂度为O(n),平均空间复杂度为O(n)。
	 * 快速排序是不稳定的。
	 * @param table
	 * @param begin
	 * @param end
	 */
	private static void quickSort(int[] table, int begin, int end){
		if( begin < end){
			int i=begin, j=end;
			int benchmark = table[i]; 				//benchmark为基准值，依次选择
			while(i != j){ 							//一次排序
				while(i<j && benchmark<=table[j]){	//从后向前寻找较小值
					j--;
				}
				if(i<j){
					table[i++] = table[j];			//较小值向前移动，移动的位置为后端第一个小于基准值的关键值的位置
				}
				while(i<j && benchmark>=table[i]){	//从前到后寻找较大值
					i++;
				}
				if(i<j){
					table[j--] = table[i];			//较大值向后移动，移动的位置为前端第一个大于基准值的关键值的位置
				}
			}										//至此，只完成一两次交换，i仍然不等于j,继续循环比较，当i=j时退出循环，benchmark找到插入位置i;
			table[i] = benchmark;
			quickSort(table, begin,j-1);			//前端子序列再排序，递归调用
			quickSort(table, i+1, end);				//后端子序列再排序，递归调用
		}
	}
}
