public class Solution {

    private final String[][] HOURS = {
            {"0"},                          // 0 LED
		    {"1", "2", "4", "8"},           // 1 LED
			{"3", "5", "6", "9", "10"},     // 2 LED
		    {"7", "11"}                     // 3 LED
    };

    private final String[][] MINUTES = {
            {"00"},                         // 0 LED
			{"01", "02", "04", "08", "16",  // 1 LED
			 "32"},
			{"03", "05", "06", "09", "10",  // 2 LED
			 "12", "17", "18", "20", "24",
			 "33", "34", "36", "40", "48"},
			{"07", "11", "13", "14", "19",  // 3 LED
			 "21", "22", "25", "26", "28",
			 "35", "37", "38", "41", "42",
			 "44", "49", "50", "52", "56"},
			{"15", "23", "27", "29", "30",  // 4 LED
			 "39", "43", "45", "46", "51",
			 "53", "54", "57", "58"},
			{"31", "47", "55", "59"}        // 5 LED
    };

    public List<String> readBinaryWatch(int num) {
		List<String> results = new ArrayList();
		for (int i = 0; i < HOURS.length && i <= num; i++) {
			if (num - i < MINUTES.length) {
				for (String hh : HOURS[i]) {
					for (String mm : MINUTES[num - i]) {
						results.add(hh + ":" + mm);
					}
				}
			}
		}
		return results;
    }
}
