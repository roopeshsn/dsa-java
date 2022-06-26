public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) {
        if(this.isEmpty()) {
            int[] temp = new int[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            // enhance -> System.arraycopy(this.data, 0, temp, 0, this.data.length);
            this.data = temp;
        }
        return super.push(val);
    }
}
