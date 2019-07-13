package com.sourceit.kopiichenko.l7;

class Phone extends Product {

    private String brand;
    private boolean isPushButton;

    Phone(String id, String name, String price, String brand, boolean isPushButton) {
        super(id, name, price);
        this.brand = brand;
        this.isPushButton = isPushButton;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPrice() {
        return super.getPrice();
    }

    public String getBrand() {
        return brand;
    }

    public boolean isPushButton() {
        return isPushButton;
    }
}
