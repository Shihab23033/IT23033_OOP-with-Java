package assignment_codes;

public class qus32 {
    private static int instanceCount = 0;
    public qus32() {
        instanceCount++;
        if (instanceCount > 50) {
            instanceCount = 0;
            System.out.println("Object count exceeded 50, resetting to 0.");
        }
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    public static void main(String[] args) {
       // int... hj ={1,5,7,9};
        for (int i = 0; i < 100; i++) {
            new qus32();
            System.out.println("Instance count: " + qus32.getInstanceCount());
        }
    }
}

