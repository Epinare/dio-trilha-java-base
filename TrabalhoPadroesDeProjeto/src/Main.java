// Interface para os produtos
interface Product {
    void calculateShippingCost();
    void calculateDiscount();
}

// Implementações concretas de produtos
class Book implements Product {
    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating shipping cost for Book...");
    }

    @Override
    public void calculateDiscount() {
        System.out.println("Calculating discount for Book...");
    }
}

class Electronics implements Product {
    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating shipping cost for Electronics...");
    }

    @Override
    public void calculateDiscount() {
        System.out.println("Calculating discount for Electronics...");
    }
}

class Clothes implements Product {
    @Override
    public void calculateShippingCost() {
        System.out.println("Calculating shipping cost for Clothes...");
    }

    @Override
    public void calculateDiscount() {
        System.out.println("Calculating discount for Clothes...");
    }
}

// Interface para o criador (Factory Method)
interface Creator {
    Product createProduct();
}

// Implementações concretas do criador
class BookCreator implements Creator {
    @Override
    public Product createProduct() {
        return new Book();
    }
}

class ElectronicsCreator implements Creator {
    @Override
    public Product createProduct() {
        return new Electronics();
    }
}

class ClothesCreator implements Creator {
    @Override
    public Product createProduct() {
        return new Clothes();
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Creator creator = new BookCreator();
        Product book = creator.createProduct();
        book.calculateShippingCost();
        book.calculateDiscount();
        
        creator = new ElectronicsCreator();
        Product electronics = creator.createProduct();
        electronics.calculateShippingCost();
        electronics.calculateDiscount();
        
        creator = new ClothesCreator();
        Product clothes = creator.createProduct();
        clothes.calculateShippingCost();
        clothes.calculateDiscount();
    }
}
