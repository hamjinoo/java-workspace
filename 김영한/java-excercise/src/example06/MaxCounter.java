package example06;

// 최대값을 지정하고 최대값까지만 값이 증가하는 기능을 제공
public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max){
            System.out.println("최대 값을 넘어갔습니다.");
            return;
        }else {
            count += 1;
        }
    }

    public int getCount(){
        return count;
    }
    
}
