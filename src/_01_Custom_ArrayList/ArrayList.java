package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] ar;
	
	public ArrayList() {
		ar = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (ar[loc]);
	}
	
	public void add(T val) {
		T[] ar2 = (T[]) new Object[ar.length + 1];
		for(int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
		ar2[ar2.length - 1] = val;
		ar = ar2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] ar2 = (T[]) new Object[ar.length + 1];
		short changer = 0;
		for(int i = 0; i < ar.length; i++) {
			if(i + changer != loc) {
				ar2[i + changer] = ar[i];
			}
			else {
				ar2[i] = val;
				changer ++;
				i--;
			}
		}
		ar = ar2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		ar[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] ar2 = (T[]) new Object[ar.length - 1];
		short changer = 0;
		for(int i = 0; i < ar.length; i++) {
			if(i == loc) {
				changer = 1;
				continue;
			}
			ar2[i - changer] = ar[i];
		}
		ar = ar2;	
	}
	
	public boolean contains(T val) {
		for(T v: ar) {
			if(v == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return ar.length;
	}
}