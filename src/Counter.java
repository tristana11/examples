public class Counter {
    public static void main(String[] args) {
        Counter2 c = new Counter2 ();
        for(int i = 1; i < 4; i++) {
            c.add(i);
        }
        System.out.println(c.count);
    }
    static public class Counter3 { // пример 1 (Counter2) зменить для юза пример 2
        public int count=7;
        private int temp = 1;
        public void add(int val){
            temp += val;
            count += temp;
        }
    }
    static class Counter2 { // пример 2 (Counter3) заменить чтобы решать пример 1
        public int count=7;
        public void add(int val){
            int temp = 1;
            temp += val;
            count += temp;
        }
    }


}
