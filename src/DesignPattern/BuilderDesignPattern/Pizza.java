package DesignPattern.BuilderDesignPattern;

public class Pizza {
    private String name;
    private Float price;
    private String size;
    private Boolean cheeze;
    private Pizza(Builder build){
        this.name=build.name;
        this.price=build.price;
        this.cheeze=build.cheeze;
        this.size=build.size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", cheeze=" + cheeze +
                '}';
    }

    public static class Builder{
        private String name;
        private Float price;
        private String size;
        private Boolean cheeze;

        public Builder cheeze(Boolean cheeze) {
            this.cheeze = cheeze;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder price(Float price) {
            this.price = price;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }

    }
}
