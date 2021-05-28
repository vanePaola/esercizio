public class Calculator {
    private int result;

    Calculator(){};

    public void setResult(int z){
        this.result = z;
    }
    public float getResult(){
        return this.result;
    }

    public float sum(int x, int y){
        this.setResult(x+y);
        return this.result;
    }
    public  float sub(int x, int y){
        this.setResult(x-y);
        return this.result;
    }
    public float mul(int x, int y){
        this.setResult(x*y);
        return this.result;
    }

}




