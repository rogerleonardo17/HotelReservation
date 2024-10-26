package iterator;

import java.util.ArrayList;

public class LIFO<T> implements Iterator<T> {

	private ArrayList<T> list;
	private int currentIndex;

	public LIFO(ArrayList<T> list) {
		super();
		this.list = list;
		this.currentIndex = list.size() - 1;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentIndex >= 0;
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		return list.get(currentIndex--);
	}

}
