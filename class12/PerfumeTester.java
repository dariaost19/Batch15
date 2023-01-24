package class12;

public class PerfumeTester {

    public static void main(String[] args) {
        perfume Creed=new perfume();
        Creed.name="Aventus for her";
        Creed.manufacture="Paris";
        Creed.notes="Egyptian Green Apple, Indonesian Patchouli, Italian Bergamont, Pink Berries";
        Creed.yearofproduction=2016;

        Creed.lasting();
        Creed.spay();


    }
}
