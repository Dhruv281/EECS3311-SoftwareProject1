package shape;

import java.util.List;
import java.util.Collections;

public class Sorting {
	
	private static Sorting sorting;
	
	private Sorting() {
		
	}
	
	protected static Sorting getInstance() {
		if(sorting == null) {
			sorting = new Sorting();
			return sorting;
		}
		return sorting;
	}
	
	protected void SortMethod(List<Shape> slist) {
		int min_Area;
		for(int i = 0; i < slist.size(); i++) {
			min_Area = i;
			for(int j = i + 1; j < slist.size(); j++) {
				double Area_min_Area = slist.get(min_Area).getArea();
				double Area_J = slist.get(j).getArea();
				if(((Comparable<Double>) Area_min_Area).compareTo(Area_J) > 0)
					min_Area = j;
			}
			
			if(min_Area != i) {
				int iX = slist.get(min_Area).getDimensionX();
				int iY = slist.get(min_Area).getDimensionY();
				
				slist.get(min_Area).setDimensionX(slist.get(i).getDimensionX());
				slist.get(min_Area).setDimensionY(slist.get(i).getDimensionY());
				
				slist.get(i).setDimensionX(iX);
				slist.get(i).setDimensionY(iY);
				
				Collections.swap(slist, i, min_Area);
			}
		}
	}
}
