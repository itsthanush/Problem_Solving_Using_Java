public class task4_weight_of_hill {
    public static void main(String[] args) {
        int input1=4;
        int input2=1;
        int input3=5;

        int sum=input2;
        int temp=input3;

        for(int i=1;i<input1;i++){
            temp += input3;
            for(int j=0;j<i;j++){
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}
