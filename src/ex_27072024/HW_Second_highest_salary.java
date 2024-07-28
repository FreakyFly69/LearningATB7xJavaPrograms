package ex_27072024;

public class HW_Second_highest_salary {

    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int high = salaries[0];
        int second=0;
        for (int i=0;i<salaries.length;i++ ){
            int k = salaries[i];
            if(k >= high){
                high =k;
            }
            else if (second<k){
                second=k;
            }

        }
        System.out.println(second);


    }

}
