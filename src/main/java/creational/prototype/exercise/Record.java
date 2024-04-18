package creational.prototype.exercise;

// deep copy
public class Record implements Cloneable {

    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

// shallow copy
//public class Record {}