package methodoverloading;

public class Bill {
    public double findPrice(int itemId) {
        return switch (itemId) {
            case 1001 -> 25;
            case 1002 -> 20;
            case 1003 -> 23;
            case 1004 -> 18;
            default -> 0;
        };
    }

    public double findPrice(String brandName,String itemType, int size) {
        if(brandName.equals("Puma")) {
            if(itemType.equals("T-shirt")) {
                if(size == 36 || size == 34)
                    return 25;
                else
                    return 0;
            }
            else if(itemType.equals("Skirt")) {
                if(size == 38 || size == 40)
                    return 20;
                else
                    return 0;
            } else {
                return 0;
            }
        }

        if(brandName.equals("Reebok")) {
            if(itemType.equals("T-shirt")) {
                if(size == 36 || size == 34)
                    return 23;
                else
                    return 0;
            }
            else if(itemType.equals("Skirt")) {
                if(size == 38 || size == 40)
                    return 18;
                else
                    return 0;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
