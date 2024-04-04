package stacks;

public class DynamicStack extends CustomStacks{

    DynamicStack(){
        super();
    }
    DynamicStack(int val){
        super(val);
    }

    @Override
    public boolean push(int val) throws CustomException {
        if(isFull()){
            int[] temp = new int[data.length*2];

            for(int i = 0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(val);
    }
}
