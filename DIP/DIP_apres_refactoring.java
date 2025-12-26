package DIP;

interface Database {
    public void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

class OrderProcessor {
    private Database database;
    
    public OrderProcessor(Database database) {
        this.database = database;
    }
    
    public void processOrder(String order) {
        database.save(order);
    }
}

public class DIP_apres_refactoring {
    public static void main(String[] args) {
        Database database;
        
        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("'Données à sauvegarder'");
        
        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("'Données à sauvegarder'");
    }
}