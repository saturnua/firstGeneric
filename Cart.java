package myPack;

import java.util.ArrayList;
import java.util.List;

public class Cart <T>{
	
	List<T> list = new ArrayList<T>(); 
	int index=0;
	
	public Cart (List<T> list){
		this.list = list;
	}
	
	public void add(T obj){
		list.add(index, obj);
		index++;
	}
	
	public void rem(Cart<T> list){
		this.list.clear();
	}
	
	
	
}
