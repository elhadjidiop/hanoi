package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
        
        // Condition1 et conditions 2 vraies
	public void test1() {
            Tour tour = new Tour();
            Disque d1 = new Disque(3);
            tour.empiler(d1);
            Disque d2 = new Disque(2);
            tour.empiler(d2);
            Disque d3 = new Disque (1);
            boolean attendu = true;
            boolean result = tour.empiler(d3);
            assertEquals(attendu, result);
	}

        //Condition 1 vraie, condition2 fausse
        public void test2(){
            Tour tour = new Tour();
            Disque d1 = new Disque(3);
            tour.empiler(d1);
            Disque d2 = new Disque(2);
            tour.empiler(d2);
            Disque d3 = new Disque (3);
            boolean attendu = false;
            boolean result = tour.empiler(d3);
            assertEquals(attendu, result);
        }
        
        //Condition1 fausse, condition2 vraie
        public void test3(){
            Tour tour = nes Tour();
            Disque d1 = new Disque(4);
            tour.empiler(d1);
            Disque d2 = new Disque (3);
            tour.empiler(d2);
            Dique d3 = new Disque (2);
            tour.empiler(d3);
            Disque d4 = new Disque(1);
            boolean attendu = false;
            boolean result = tour.empiler(d4);
            assertEquals(attendu, result);
        }
        
        //Condition1 et condition2 fausses
        public void test4(){
            Tour tour = new Tour();
            Disque d1 = new Disque(4);
            tour.empiler(d1);
            Disque d2 = new Disque(3);
            tour.empiler(d2);
            Disque d3 = new Disque(2);
            tour.empiler(d3);
            Disque d4 = new Disque(2);
            boolean attendu = false;
            boolean result = tour.empiler(d4);
            assertEquals(attendu, result);
        }
        
}
