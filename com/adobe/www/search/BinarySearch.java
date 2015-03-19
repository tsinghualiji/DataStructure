package com.adobe.www.search;

public class BinarySearch {
	
	public static void main(String[] args){
		int[] table = {0,1,2,2,3,4,5,6,7,10};
		int index = binarySearch1(table,0,table.length-1,4);
		System.out.println(index);
	}
	
	public static int binarySearch1(int[] table, int begin, int end, int key){
		while(begin <= end){
			int mid = (begin + end)/2;
			if( table[mid] == key){
				return mid;
			}else if(table[mid] <= key){
				begin = mid + 1;
			}else{
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static int binarySearch2(int[] table, int begin, int end, int key){
		int len = table.length;
		int mid = (begin+end)/2;
		if(key<table[0] || key>table[len-1]) return -1;
		if(table[mid] == key) return mid;
		if(key > table[mid]) return binarySearch2(table, mid+1, end, key);
		if(key < table[mid]) return binarySearch2(table, begin, mid-1, key);
		return -1;
	}
}
