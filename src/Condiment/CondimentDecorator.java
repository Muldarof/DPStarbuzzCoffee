package Condiment;

import Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
// we extend the beverage class here because we need to be interchangeable with beverages
