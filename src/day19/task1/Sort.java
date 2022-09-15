package src.day19.task1;

public class Sort implements Comparable<Sort> {
    public int sss;
    public int count;
    public String world;

    public int getSss() {
        return sss;
    }

    public Sort(int sss, int count, String world) {
        this.sss = sss;
        this.count = count;
        this.world = world;
    }

@Override
public int compareTo(Sort s) {
    if (s.count > this.count) {
        return -1;
    }
    if (s.count == this.count) {
        return 0;
    }
    if(s.count < this.count ){
        return 1;
    }
        return 0;
}

    public int getCount() {
        return count;
    }

    public String getWorld() {
        return world;
    }





    public void setCount(int count) {
        this.count = count;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "" +world+ " = " + count;
    }
}
