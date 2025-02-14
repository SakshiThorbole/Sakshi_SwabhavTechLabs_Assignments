package com.aurionpro.structural.decorator.model;

public abstract class HatDecorator implements IHat {
    public IHat decoratedHat;

    public HatDecorator(IHat hat) {
        this.decoratedHat = hat;
    }

    @Override
    public String getName() {
        return decoratedHat.getName();
    }

    @Override
    public double getPrice() {
        return decoratedHat.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedHat.getDescription();
    }
}
