package telran.arrays;


import java.util.Arrays;


public class MyArraysInt {
	
	
	public static int [] addNumber (int[] array, int num) {
		//TODO
		//adds num at the array's end
		//returns new array with added number
		//using standard method Arrays.copyOf
		int[] newArr = Arrays.copyOf(array, array.length + 1);
	    newArr[newArr.length-1] = num;
		
		return newArr;
	}
	
	
	public static int[] removeNumber (int[] array, int index) {
		//TODO
		//removes element at a given index for right index (0 - arr.length-1) value and returns new array with no the removed one
		//returns the source array if for a wrong index value (less than 0 or greater than array.length - 1)
		//using the standard method System.arraycopy
		
		if (index < 0 || index >= array.length) {
	        // Если индекс некорректный, возвращаем исходный массив
	        return array;
	    }
	    
	    // Создаем новый массив, который будет на 1 элемент меньше
	    int[] newArr = new int[array.length - 1];
	    
	    // Копируем все элементы до индекса из старого массива в новый массив
	    System.arraycopy(array, 0, newArr, 0, index);
	    
	    // Копируем все элементы после индекса из старого массива в новый массив
	    System.arraycopy(array, index + 1, newArr, index, (array.length - 1) - index);
	    
	    // Возвращаем новый массив без удаленного элемента
	    return newArr;
	}

	
	
	public static int[] insertNumber (int[] array, int index, int num) {
		//TODO
		//insert a given num at a given index for right value of the index (0 - arr.length) and returns new array with the inserted number
		//returns the source array for a wrong index value (less than 0 or greater than array.length)
		//using the standard method System.arraycopy
		 if (index < 0 || index > array.length) {
		        // Если индекс некорректный, возвращаем исходный массив
		        return array;
		    }
		    
		    // Создаем новый массив, который будет на 1 элемент больше
		    int[] newArr = new int[array.length + 1];
		    
		    // Копируем все элементы до индекса из старого массива в новый массив
		    System.arraycopy(array, 0, newArr, 0, index);
		    
		    // Вставляем новый элемент в новый массив
		    newArr[index] = num;
		 
		    // Копируем все элементы после индекса из старого массива в новый массив
		    System.arraycopy(array, index, newArr, index + 1, array.length - index);
		    
		    // Возвращаем новый массив с вставленным элементом
		    return newArr;
	}
	
	public static int[] insertNumberSorted (int[] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if(index < 0) {
			index = -index - 1;
		}
		return insertNumber(array, index, num);
	}

}
