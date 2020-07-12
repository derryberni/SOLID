// need fix
abstract class Product {
    abstract String setName();
    abstract Date setExpiredDate();

    /**
     * Function to get all of information about product
     */
    public void getProductInfo() {
        // some magic code
    }
}

class Vegetable extends Product {

    @Override
    String setName() {
        return "Broccoli";
    }

    @Override
    Date setExpiredDate() {
        return new Date();
    }
}

class Smartphone extends Product {

    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }

    @Override
    Date setExpiredDate() {
        return new Date(); // ???????
    }
}

// fix
abstract class Product {
    abstract String setName();

    /**
     * Function to get all of information about product
     */
    public void getProductInfo() {
        // some magic code
    }
}

abstract class FoodProduct extends Product{
    abstract Date setExpiredDate();
}

class Vegetable extends FoodProduct {

    @Override
    String setName() {
        return "Broccoli";
    }

    @Override
    Date setExpiredDate() {
        return new Date();
    }
}

class Smartphone extends Product {
    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }
}
