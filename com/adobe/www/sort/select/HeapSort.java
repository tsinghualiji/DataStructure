package com.adobe.www.sort.select;
/**
 * 小顶堆： 降序排列
 * 大顶堆：升序排列
 * @author Ji Li
 *	将一个序列调整为堆的时间复杂度为O(lgn),因此堆排序的时间复杂度为O(nlgn)。
 *  堆排序的空间复杂度为O(1).堆排序是不稳定的。
 */
public class HeapSort {

	public static void heapSort(int[] table){
		int n = table.length;
		//创建最小堆
		for(int j=n/2-1; j>=0; j--){
			sift(table, j, n-1);
		}
		//每趟将最小值交换到后面，再调整堆
		for(int j=n-1; j>0; j--){
			int temp = table[0];
			table[0] = table[j];
			table[j] = temp;
			sift(table,0,j-1);
		}
	}
	
	/**
	 * 将以begin为根的子树调整成最小堆，begin,end分别是序列的下界和上界
	 * @param table
	 * @param begin
	 * @param end
	 */
	public static void sift(int[] table, int begin, int end){
		//i为子树的根，j为i结点的左孩子
		int i = begin, j = 2*i+1;
		//获取第i个元素的值
		int temp = table[i];
		//沿较小值孩子结点向下筛选
		while(j < end){
			//数据元素比较（改为<为大顶堆）
			if(j < end && table[j] >= table[j+1]){
				//j为左右孩子中的较小者
				j++;
			}
			//若父母结点的值较大（改为<为最大堆）
			if(temp > table[j]){
				//孩子结点中的较小值上移
				table[i] = table[j];
				//i j 向下一层
				i = j;
				j = 2*i+1;
			}
			else break;
		}
		//当前子树的原根值到达调整后的位置
		table[i] = temp;
	}
	
	public static void main(String[] args){
		int[] table = {5,32,13,24,17,3,65,98,2,1};
		heapSort(table);
		for(int i=0; i< table.length-1; i++){
			System.out.println(table[i]);
		}
	}
}

