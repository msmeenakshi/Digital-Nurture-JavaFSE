public class SearchTest {

    // Linear Search
    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison =
                    products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0) {
                return products[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Camera", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Tablet", "Electronics"),
                new Product(105, "Watch", "Accessories")
        };

        Product linearResult = linearSearch(products, "Phone");

        if (linearResult != null) {
            System.out.println("Linear Search Found: "
                    + linearResult.productName);
        }

        Product binaryResult = binarySearch(products, "Phone");

        if (binaryResult != null) {
            System.out.println("Binary Search Found: "
                    + binaryResult.productName);
        }
    }
}