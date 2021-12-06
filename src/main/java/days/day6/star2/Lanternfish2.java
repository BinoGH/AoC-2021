package days.day6.star2;

public class Lanternfish2 {
    int timer;

    public Lanternfish2(){
        timer = 8;
    }

    public Lanternfish2(int timer){
        this.timer = timer;
    }

    public boolean newDay(){
        if(timer == 0){
            timer = 6;
            return true;
        }
        timer--;
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(timer);
    }
}
