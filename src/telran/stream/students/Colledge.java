package telran.stream.students;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Colledge implements Iterable<Student> {
	Student[] students;
	public int current;
	public Colledge(Student[] students) {
		this.students = Arrays.copyOf(students, students.length);
	}
private class ColledgeIterator implements Iterator<Student> {

	@Override
	public boolean hasNext() {
				
		return current < students.length;
	}

	@Override
	public Student next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return students[current++];
	}
	
}
	@Override
	public Iterator<Student> iterator() {
		
		return new ColledgeIterator();
	}

}