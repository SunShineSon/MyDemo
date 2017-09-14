package com.demo.algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		//int[] arr = {1, 2, 5, 8, 23, 56, 88, 100, 123, 124, 222, 233, 333, 443, 3434, 3435};
		int[] arr = {1, 2, 5, 8, 23, 56, 77};
		int a = recursion(arr, 0, arr.length - 1, 2);
		System.out.println(a);
	}

	private static int recursion(int[] arr, int begin, int end, int findNum){
		if(findNum == arr[begin]){
			return begin;
		}else if(findNum == arr[end]){
			return end;
		}else{
			int arrLen = end; 
			if(end % 2 == 1){
				arrLen = end + 1;
			}
			int mid = arr[arrLen/2];	//查询数值与中间数作比较
			if(findNum == mid){
				return arrLen;
			}else if(findNum < mid){	//查找值在数组中间值左边，递归算法在数组左侧运算
				int newEnd = arrLen/2; 
				recursion(arr, begin, newEnd, findNum);
			}else if(findNum > mid){
				int newBegin = arrLen/2;
				recursion(arr, newBegin, end, findNum);
			}
		}
		return 0;
	}
	
	
	
	
}
