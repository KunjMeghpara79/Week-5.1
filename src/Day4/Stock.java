package Day4;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stock {
    public List<String> getOrderList() {
        return orderList;
    }

    public Set<String> getOrderSet() {

        return orderSet;
    }

    private List<String> orderList = new ArrayList<>();
    private Set<String> orderSet = new HashSet<>();
}
