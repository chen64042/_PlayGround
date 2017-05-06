package java8.interviews;

import java.util.ArrayList;
import java.util.List;

public class IntervalMerger {
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<Interval>();

		intervals.add(new Interval(2, 5));
		intervals.add(new Interval(100, 200));
		intervals.add(new Interval(4, 16));
		intervals.add(new Interval(15, 22));
		intervals.add(new Interval(0, 1500));

		intervals.sort((i1, i2)-> i1.getStart() - i2.getStart());

		for(int i=0; i<intervals.size(); i++) {
			List<Interval> toBeRemoved = new ArrayList<Interval>();

			for(int j=1; j<intervals.size(); j++) {
				Interval merged = null;

				if (intervals.get(i).getEnd() > intervals.get(j).getStart()) {
					if (intervals.get(i).getEnd() > intervals.get(j).getEnd()) {
						merged = new Interval(intervals.get(i).getStart(), intervals.get(i).getEnd());
					} else {
						merged = new Interval(intervals.get(i).getStart(), intervals.get(j).getEnd());
					}
				}

				intervals.set(i, merged);
				toBeRemoved.add(intervals.get(j));
			}

			intervals.removeAll(toBeRemoved);
		}
	}
}
