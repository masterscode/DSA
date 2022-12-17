package __V1.assessments;

import lombok.ToString;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarRental {

    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        List<RentalTime> rentalTime = rentalTimes.stream().sorted(Comparator.naturalOrder()).toList();

        List<Boolean> result = new ArrayList<>();
        for (int i = 1; i < rentalTimes.size(); i++) {
            result.add(!rentalTime.get(i - 1).end.after(rentalTime.get(i).start));
        }
        return result.stream().allMatch(Boolean.TRUE::equals);
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(canScheduleAll(rentalTimes));
    }


    @ToString
    public static class RentalTime implements Comparable<RentalTime> {
        private Date start, end;

        public RentalTime(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return this.start;
        }

        public Date getEnd() {
            return this.end;
        }

        @Override
        public int compareTo(RentalTime o) {
            return this.start.before(o.start) ? -1 : 1;
        }
    }
}
