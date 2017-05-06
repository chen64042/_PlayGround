package java8;

import java.util.ArrayList;
import java.util.List;

import java8.interviews.Interval;
import junit.framework.TestCase;

public class IntervalMergTest extends TestCase {
	List<Interval> intervals = new ArrayList<Interval>();

	public void setUp() {
		intervals.add(new Interval(2, 5));
		intervals.add(new Interval(100, 200));
		intervals.add(new Interval(4, 16));
		intervals.add(new Interval(15, 22));
		intervals.add(new Interval(0, 1500));

	}

	public void testIntervalMerge() {
		List<Interval> target = new ArrayList<Interval>();

		target.add(new Interval(0, 1500));
		intervals = Interval.merge(intervals);

		assertTrue(target.size() == intervals.size());

		assertEquals(intervals, target);
	}
}
