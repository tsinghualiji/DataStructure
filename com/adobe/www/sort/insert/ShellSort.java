package com.adobe.www.sort.insert;
/**
 * 希尔排序：又称为缩小增加排序（diminishing increment sort),其基本思想是分组的直接插入排序
 * 由直接插入排序算法分析可知：若数据序列越接近有序，则时间效率越高；再者，当n较小时，时间效率也较高
 * 希尔排序正式基于这两点对直接插入排序算法进行改进。
 * 希尔排序算法描述如下：
 * 1.将一个数据序列分成若干组，每组由若干相隔一段距离的元素组成，这段距离称为增量，在一个组内采用
 * 		直接插入排序算法进行排序；
 * 2.增量的初始值通常为数据序列长度的一半，以后每趟增量逐渐缩小，最后值为1.随着增量逐渐缩小，
 *  	组内元素增加，整个序列则越接近有序，当增量为1时，只有一组，元素是有序，再进行一次直接插入排序即可
 *  
 *希尔排序算法的时间复杂度分析比较复杂，时间所需的时间取决于具体的增量序列。希尔排序的空间负载度为O(1)
 *希尔排序算法不稳定
 * @author Ji Li
 * 
 */
public class ShellSort {
	public static void shellSort(int[] table){
		for(int delta=table.length/2; delta>0; delta/=2){ //若干趟扫描，控制增量，增量减半
			for(int i=delta; i<table.length; i+=delta){ //一趟分为若干组，每组进行直接插入排序
				int temp=table[i],j;//table[i]是当前等待插入的元素
				for(j=i-delta; j>0&&temp<table[j];j-=delta){ //每组元素相隔delta远，从后往前寻找插入位置，比temp的元素往后移动。
					table[j+delta] = table[j];
				}
				table[j+delta] = temp; //temp到达应该插入的位置
			}
		}
	}
}
