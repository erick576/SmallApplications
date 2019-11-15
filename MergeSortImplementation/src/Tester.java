import java.util.ArrayList;
import java.util.List;
public class Tester {

	public static void main(String[] args) {
		MergeSort x = new MergeSort();
		List<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(10);
		b.add(34);
		b.add(3);
		b.add(8);
		b.add(2);
		b.add(203);
		b.add(-83);
		List<Integer> sorted = x.sort(b);
		System.out.print("{");
		for(int i = 0; i < 8; i ++) {
			if(i < 7) {
			System.out.print(sorted.get(i) + ", ");
			}
			else {
				System.out.print(sorted.get(i));
			}
			}
		System.out.print("}");
	}
}
