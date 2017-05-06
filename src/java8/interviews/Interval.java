package java8.interviews;

import java.util.ArrayList;
import java.util.List;

public class Interval {
	private Pair<Integer> pair;

	public Interval(int start, int end) {
		this.pair = new Pair<Integer>(start > end ? end : start, start > end ? start : end);
	}

	public int getStart() {
		return this.pair.getV1();
	}

	public int getEnd() {
		return this.pair.getV2();
	}

	public String toString() {
		return "<"+this.getStart()+", "+this.getEnd()+">";
	}

	public boolean equals(Object o) {
		return this.toString().equals(o.toString());
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public static List<Interval> merge(List<Interval> intervals) {
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

		return intervals;
	}
}
