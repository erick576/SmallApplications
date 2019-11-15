import java.util.List;
import java.util.ArrayList;
public class MergeSort {

public List<Integer> sort (List<Integer> list) {
List<Integer> sortedList;
	if(list.size() == 0) { sortedList = new ArrayList<>();}
	else if(list.size() == 1) {
		sortedList = new ArrayList<>();
		sortedList.add(list.get(0));
	}
	else {
	int middle = list.size() / 2;
	List<Integer> left = list.subList(0, middle);
	List<Integer> right = list.subList(middle, list.size());
	List<Integer> sortedLeft = sort(left);
	List<Integer> sortedRight = sort(right);
	sortedList = merge(sortedLeft, sortedRight);
	}
	return sortedList;	
}

public List<Integer> merge(List<Integer> L, List<Integer> R) {
	List<Integer> merge = new ArrayList<>();
	if(L.isEmpty() || R.isEmpty()) {
		merge.addAll(L);
		merge.addAll(R);
	}
	else {
		int i = 0;
		int j = 0;
	while(i < L.size() && j < R.size()) {
		if(L.get(i) <= R.get(j)) {merge.add(L.get(i)); i ++;}
		else { merge.add(R.get(j)); j ++;
			}
		}
	for(int k = i; k < R.size(); k ++) {merge.add(L.get(k));}
	for(int k = j; k < R.size(); k ++) {merge.add(R.get(k));}
	}
	return merge;
	
}
}
