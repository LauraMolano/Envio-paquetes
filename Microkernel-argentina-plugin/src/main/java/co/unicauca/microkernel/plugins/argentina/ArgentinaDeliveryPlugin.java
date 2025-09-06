package co.unicauca.microkernel.plugins.argentina;
import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class ArgentinaDeliveryPlugin implements IDeliveryPlugin {

    @Override
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();
        double weight = product.getWeight();
        double distance = delivery.getDistance();

        double cost;

        if (weight <= 3) {

            cost = (distance <= 50) ? 3 : 4;

        } else {

            cost = (distance <= 30) ? 4 : 5;

        }

        return cost;

    }
}