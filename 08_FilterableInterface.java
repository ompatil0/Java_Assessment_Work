// 8.Define an interface named Filterable with abstract methods
// like apply_filter(filter_type) and reset_filter().
// Create two classes, ImageProcessor and DataAnalyzer, that
// both implement the Filterable interface.
// Implement the methods in each class to perform distinct actions relevant to image
// and data processing respectively, showcasing a shared contract with different
// implementations.
interface Filterable {
    void applyFilter(String type);
    void resetFilter();
}

class ImageProcessor implements Filterable {

    public void applyFilter(String type) {
        System.out.println("Applying image filter: " + type);
    }

    public void resetFilter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {

    public void applyFilter(String type) {
        System.out.println("Applying data filter: " + type);
    }

    public void resetFilter() {
        System.out.println("Data filter reset");
    }
}

class FilterableInterface {
    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.applyFilter("Blur");
        img.resetFilter();

        data.applyFilter("Noise Reduction");
        data.resetFilter();
    }
}