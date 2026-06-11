package lesson_2026_06_05;
import java.util.LinkedList;

public class SupplierManager {
    LinkedList<Supplier> supplierList;

    public SupplierManager() {
        supplierList = new LinkedList<>();
    }

    public void addSupplier(Supplier newSupplier) {
        int pos = 0;
        while(pos < supplierList.size() && newSupplier.getSupplierName().compareTo(supplierList.get(pos).getSupplierName()) > 0) {
            pos = pos + 1;
        }
        supplierList.add(pos, newSupplier);
    }

    public void displayList() {
        for(int i = 0; i < supplierList.size(); i++) {
            supplierList.get(i).displayData();
        }
    }

    public static int countOfSuppliers(LinkedList<Supplier> supplierList, String country, int n) {
        if(n == 0) {
            return 0;
        }
        int c = countOfSuppliers(supplierList, country, n - 1);
        if(supplierList.get(n - 1).getSupplierCountry().equals(country)) {
            c = c + 1;
        }
        return c;
    }
}
