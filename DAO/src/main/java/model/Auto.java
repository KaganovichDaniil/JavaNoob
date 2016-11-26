package model;

/**
 * Created by Daniil on 22.11.2016.
 */
public class Auto {
    private int id;
    private String modelName;
    private int mileAge;
    private int ownerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (id != auto.id) return false;
        if (mileAge != auto.mileAge) return false;
        if (ownerId != auto.ownerId) return false;
        return modelName != null ? modelName.equals(auto.modelName) : auto.modelName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        result = 31 * result + mileAge;
        result = 31 * result + ownerId;
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", mileAge=" + mileAge +
                ", ownerId=" + ownerId +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMileAge() {
        return mileAge;
    }

    public int getOwnerId() {
        return ownerId;
    }

    private Auto(int id, String modelName, int mileAge, int ownerId) {
        this.id = id;
        this.modelName = modelName;
        this.mileAge = mileAge;
        this.ownerId = ownerId;
    }

    public static class Builder {
        private int id;
        private String modelName;
        private int mileAge;
        private int ownerId;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setOwnerId(int ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder setMileAge (int mileAge) {
            this.mileAge = mileAge;
            return this;
        }

        public Auto build() {
            return new Auto(this.id, this.modelName, this.mileAge, this.ownerId);
        }


    }


}
