package lesson_2026_05_29;
/*
public class homework {
    // 14d
    public void updatePlacesFilled() {
        this.placesFilled++;
        if (this.placesFilled >= 10) {
            this.isRunning = true;
        }
    }


    // 14e
    public void assignTrip(Student s) {
        for (int i = 0; i <= s.sPreferenceList.length; i++) {
            int tripNum = s.sPreferenceList[i];
            Trip t = allTrips[tripNum - 1];
            if (t.getPlacesFilled() < 25) {
                s.setTripAssigned(t.getTripTitle());
                t.updatePlacesFilled();
                t.addStudentToTripList(s);
                return;
            }
        }
    }


    // 15c
    public void displayPlacesLeft() {
        for (int i = 0; i < allTrips.length; i++) {
            if (allTrips[i].isRunning() == true && allTrips[i].getPlacesFilled() < 25) {
                int placesLeft = 25 - allTrips[i].getPlacesFilled();
                System.out.println("Trip " + i + ": " + allTrips[i].getTripTitle() + "   Places left: " + placesLeft);
            }
        }
    }


    // 15d
    public int noTrip() {
        int count = 0;
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getTripAssigned() == "zzz") {
                count++;
            }
        }
        return count;
    }


    // 17a
    public void avgPopularity(int[][] popularity, int[] tripPop) {
        for (int i = 0; i < popularity.length; i++) {
            int total = 0;
            for (int j = 0; j < popularity[i].length; j++) {
                total = total + popularity[i][j];
            }
            tripPop[i] = total / 5;
        }
    }


    // 17b

    for (int i = 0; i < allTrips.length; i++) {
            if (popularity[i][0] < tripPop[i]) {
                System.out.println(allTrips[i].getTripTitle());
            }
    }


    // 18b.ii
    public void aMethod() {
        for (int n = 0; n < allTrips.length; n++) {
            if (allTrips[n].isRunning() == false) {
                for (int i = 0; i < allTrips[n].getList().size(); i++) {
                    aList.add((String) allTrips[n].getList().get(i));
                }
            }
        }
    }
}
*/