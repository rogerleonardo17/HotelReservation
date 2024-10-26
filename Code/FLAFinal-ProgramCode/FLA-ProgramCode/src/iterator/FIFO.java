package iterator;

import java.util.ArrayList;

public class FIFO<T> implements Iterator<T> {

	private ArrayList<T> list;
	private int currentIndex;

	public FIFO(ArrayList<T> list) {
		super();
		this.list = list;
		this.currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentIndex < list.size();
	}

	@Override
	public T getNext() {
		// TODO Auto-generated method stub
		return list.get(currentIndex++);
	}

}