public class Issue55_LibraryBookStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A1", "B1", "C1"};
        String target = new String("B1");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
