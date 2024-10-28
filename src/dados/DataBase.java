package dados;

import java.util.ArrayList;
import java.util.List;

public abstract class DataBase {
    public static List<String> items;

    static {
        items = new ArrayList<>();
        items.add("um");
        items.add("dois");
        items.add("três");
    }
}
